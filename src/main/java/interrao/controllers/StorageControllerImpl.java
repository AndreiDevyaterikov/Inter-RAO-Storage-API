package interrao.controllers;

import interrao.models.ResponseModel;
import interrao.models.SaleProductModel;
import interrao.services.StorageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/storage")
@RequiredArgsConstructor
public class StorageControllerImpl implements StorageController {

    private final StorageService storageService;
    @Override
    public ResponseModel sellFromStorage(SaleProductModel saleProductModel) {
        return null;
    }
}
