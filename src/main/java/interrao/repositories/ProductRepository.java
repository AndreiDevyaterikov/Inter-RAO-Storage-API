package interrao.repositories;

import interrao.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity , Integer> {
    Optional<ProductEntity> findByArticle(String article);
    List<ProductEntity> findAllByStorageId(Integer storageId);
    void deleteByArticle(String article);
}
