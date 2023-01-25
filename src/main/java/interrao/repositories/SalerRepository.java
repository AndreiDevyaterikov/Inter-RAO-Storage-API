package interrao.repositories;

import interrao.entities.SalerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalerRepository extends JpaRepository<SalerEntity, Integer> {

}
