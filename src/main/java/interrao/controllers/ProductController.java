package interrao.controllers;

import interrao.entities.ProductEntity;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Tag(name = "Costumer Controller", description = "Контроллер для взаимодействия с продавцами")
public interface ProductController {

    @GetMapping("/{article}")
    @Operation(summary = "Получить информацию о товаре по артикулу")
    ProductEntity getByArticle(@PathVariable String article);

    @GetMapping("/allByStorageId/{storageId}")
    @Operation(summary = "Получить все товары со склада")
    List<ProductEntity> getAllByStorageId(@PathVariable Integer storageId);
}
