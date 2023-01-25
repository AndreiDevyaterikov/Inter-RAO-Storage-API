package interrao.services.impl;

import interrao.constants.Messages;
import interrao.entities.CostumerEntity;
import interrao.exceptions.InterRaoStorageException;
import interrao.repositories.CostumerRepository;
import interrao.services.CostumerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CostumerServiceImpl implements CostumerService {

    private final CostumerRepository costumerRepository;

    @Override
    public CostumerEntity getById(Integer id) {
        var costumerOpt = costumerRepository.findById(id);
        if (costumerOpt.isPresent()) {
            return costumerOpt.get();
        } else {
            var message = String.format(Messages.NOT_FOUND_COSTUMER_WITH_ID, id);
            throw new InterRaoStorageException(message, 404);
        }
    }

    @Override
    public List<CostumerEntity> getAll() {
        return costumerRepository.findAll();
    }
}
