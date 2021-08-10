package project.swa.ProductService.service;

import lombok.Data;

@Data
public class StockDTO {
    private int numberInStock;

    public StockDTO(int numberInStock) {
        this.numberInStock = numberInStock;
    }
}
