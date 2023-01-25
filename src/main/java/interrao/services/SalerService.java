package interrao.services;

import interrao.entities.SalerEntity;

import java.util.List;

public interface SalerService {
    SalerEntity getById(Integer id);

    List<SalerEntity> getAll();
}
