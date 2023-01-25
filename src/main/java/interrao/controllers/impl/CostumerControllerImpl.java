package interrao.controllers.impl;

import interrao.controllers.CostumerController;
import interrao.entities.CostumerEntity;
import interrao.services.CostumerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/costumer")
@RequiredArgsConstructor
public class CostumerControllerImpl implements CostumerController {

    private final CostumerService costumerService;
    @Override
    public CostumerEntity getById(Integer id) {
        return costumerService.getById(id);
    }

    @Override
    public List<CostumerEntity> getAll() {
        return costumerService.getAll();
    }
}
