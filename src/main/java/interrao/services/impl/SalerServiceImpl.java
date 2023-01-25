package interrao.services.impl;

import interrao.constants.Messages;
import interrao.entities.SalerEntity;
import interrao.exceptions.InterRaoStorageException;
import interrao.repositories.SalerRepository;
import interrao.services.SalerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SalerServiceImpl implements SalerService {

    private final SalerRepository salerRepository;

    @Override
    public SalerEntity getById(Integer id) {
        var salerOpt = salerRepository.findById(id);
        if (salerOpt.isPresent()) {
            return salerOpt.get();
        } else {
            var message = String.format(Messages.NOT_FOUND_SALER_WITH_ID, id);
            throw new InterRaoStorageException(message, 404);
        }
    }

    @Override
    public List<SalerEntity> getAll() {
        return salerRepository.findAll();
    }
}
