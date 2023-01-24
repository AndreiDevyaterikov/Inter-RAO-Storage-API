package interrao.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "storages")
public class StorageEntity {
    @Id
    @Column(name = "storage_id")
    private Integer id;
    @Column(name = "name")
    private String name;
}
