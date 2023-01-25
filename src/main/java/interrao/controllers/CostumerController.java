package interrao.controllers;

import interrao.entities.CostumerEntity;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Tag(name = "Costumer Controller", description = "Контроллер для взаимодействия с покупателями")
public interface CostumerController {
    @GetMapping("/{id}")
    @Operation(summary = "Получить информацию о покупателе по id")
    CostumerEntity getById(@PathVariable Integer id);

    @GetMapping("/getAll")
    @Operation(summary = "Получить информацию о всех покупателях")
    List<CostumerEntity> getAll();
}
