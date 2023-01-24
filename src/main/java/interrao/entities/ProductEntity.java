package interrao.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

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

    @Column(name = "price")
    private BigDecimal price;
    @OneToOne
    @JoinColumn(name = "storage_id")
    private StorageEntity storageId;
}
