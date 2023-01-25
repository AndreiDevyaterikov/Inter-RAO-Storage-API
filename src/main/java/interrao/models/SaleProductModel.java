package interrao.models;

import lombok.Data;

import java.util.List;

@Data
public class SaleProductModel {
    private Integer salerId;
    private Integer costumerId;
    private Integer storageId;
    private List<ProductModel> products;
}
