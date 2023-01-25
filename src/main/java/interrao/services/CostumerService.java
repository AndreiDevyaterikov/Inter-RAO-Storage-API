package interrao.services;

import interrao.entities.CostumerEntity;

import java.util.List;

public interface CostumerService {
    CostumerEntity getById(Integer id);

    List<CostumerEntity> getAll();
}
