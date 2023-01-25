package interrao.controllers;


import interrao.models.ResponseModel;
import interrao.models.SaleProductModel;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Tag(name = "Storage Controller", description = "Контроллер для взаимодействия со складом")
public interface StorageController {
    @PostMapping("/sell")
    @Operation(summary = "Произвести списание со склада")
    ResponseModel sellFromStorage(@RequestBody SaleProductModel saleProductModel);
}
