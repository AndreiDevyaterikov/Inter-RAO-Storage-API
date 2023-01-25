package interrao.services;

import interrao.entities.StorageEntity;
import interrao.models.ResponseModel;
import interrao.models.SaleProductModel;

public interface StorageService {
    StorageEntity getById(Integer id);
    ResponseModel sellFromStorage(SaleProductModel saleProductModel);
}
