package interrao.services;

import interrao.entities.ProductEntity;

import java.util.List;

public interface ProductService {
    ProductEntity getByArticle(String article);
    List<ProductEntity> getAllByStorageId(Integer storageId);
}
