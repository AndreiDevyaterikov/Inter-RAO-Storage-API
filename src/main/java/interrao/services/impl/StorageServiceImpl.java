package interrao.services.impl;

import interrao.constants.Messages;
import interrao.entities.StorageEntity;
import interrao.exceptions.InterRaoStorageException;
import interrao.models.ResponseModel;
import interrao.models.SaleProductModel;
import interrao.repositories.StorageRepository;
import interrao.services.CostumerService;
import interrao.services.ProductService;
import interrao.services.SalerService;
import interrao.services.StorageService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StorageServiceImpl implements StorageService {

    private final StorageRepository storageRepository;
    private final CostumerService costumerService;
    private final SalerService salerService;
    private final ProductService productService;

    @Override
    public StorageEntity getById(Integer id) {
        var storageOpt = storageRepository.findById(id);
        if (storageOpt.isPresent()) {
            return storageOpt.get();
        } else {
            var message = String.format(Messages.NOT_FOUND_STORAGE_WITH_ID, id);
            throw new InterRaoStorageException(message, 404);
        }
    }

    @Override
    public ResponseModel sellFromStorage(SaleProductModel saleProductModel) {
        var costumer = costumerService.getById(saleProductModel.getCostumerId());
        var saler = salerService.getById(saleProductModel.getSalerId());
        var storage = storageRepository.findById(saleProductModel.getStorageId());
        var products = saleProductModel.getProducts();
        if (products.isEmpty()) {
            throw new InterRaoStorageException(Messages.EMPTY_PRODUCTS_LIST, 400);
        } else {
            for (var product : products) {
                productService.deleteByArticle(product.getArticle());
            }
            return new ResponseModel(200, Messages.PRODUCTS_HAS_BEEN_SALED);
        }
    }
}
