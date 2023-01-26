package interrao.services.impl;

import interrao.constants.Messages;
import interrao.entities.ProductEntity;
import interrao.exceptions.InterRaoStorageException;
import interrao.repositories.ProductRepository;
import interrao.services.ProductService;
import interrao.services.StorageService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final StorageService storageService;

    @Override
    public ProductEntity getByArticle(String article) {
        var productOpt = productRepository.findByArticle(article);
        if (productOpt.isPresent()) {
            return productOpt.get();
        } else {
            var message = String.format(Messages.NOT_FOUND_PRODUCT_WITH_ARTICLE, article);
            throw new InterRaoStorageException(message, 404);
        }
    }

    @Override
    public List<ProductEntity> getAllByStorageId(Integer storageId) {
        var storage = storageService.getById(storageId);
        return productRepository.findAllByStorageId(storage.getId());
    }
}
