package project.swa.ProductService.domain;

import lombok.Data;

@Data
public class Stock {
    private int numberInStock;

    public Stock(int numberInStock) {
        this.numberInStock = numberInStock;
    }
}
