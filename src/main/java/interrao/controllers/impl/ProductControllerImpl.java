package interrao.controllers.impl;

import interrao.controllers.ProductController;
import interrao.entities.ProductEntity;
import interrao.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductControllerImpl implements ProductController {

    private final ProductService productService;
    @Override
    public ProductEntity getByArticle(String article) {
        return productService.getByArticle(article);
    }

    @Override
    public List<ProductEntity> getAllByStorageId(Integer storageId) {
        return productService.getAllByStorageId(storageId);
    }
}
