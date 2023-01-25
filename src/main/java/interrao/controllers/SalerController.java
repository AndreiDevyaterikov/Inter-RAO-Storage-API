package interrao.controllers;

import interrao.entities.SalerEntity;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Tag(name = "Costumer Controller", description = "Контроллер для взаимодействия с продавцами")
public interface SalerController {
    @GetMapping("/{id}")
    @Operation(summary = "Получить информацию о продавце по id")
    SalerEntity getById(@PathVariable Integer id);

    @GetMapping("/getAll")
    @Operation(summary = "Получить информацию о всех продавцах")
    List<SalerEntity> getAll();
}
