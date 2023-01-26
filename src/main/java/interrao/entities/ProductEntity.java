package interrao.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "products")
public class ProductEntity {

    @Id
    @Column(name = "product_id")
    private Integer id;

    @Column(name = "article")
    private String article;

    @Column(name = "name")
    private String name;

    @OneToOne
    @JoinColumn(name = "storage_id")
    private StorageEntity storage;
}
