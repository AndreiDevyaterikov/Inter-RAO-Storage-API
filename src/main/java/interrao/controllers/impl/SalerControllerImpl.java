package interrao.controllers.impl;

import interrao.controllers.SalerController;
import interrao.entities.SalerEntity;
import interrao.services.SalerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/saler")
@RequiredArgsConstructor
public class SalerControllerImpl implements SalerController {

    private final SalerService salerService;

    @Override
    public SalerEntity getById(Integer id) {
        return salerService.getById(id);
    }

    @Override
    public List<SalerEntity> getAll() {
        return salerService.getAll();
    }
}
