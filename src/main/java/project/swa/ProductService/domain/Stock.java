package project.swa.ProductService.domain;

import lombok.Data;

@Data
public class Stock {
    private int numberInStock;
    private String locationCode;

    public Stock(int numberInStock, String locationCode) {
        this.numberInStock = numberInStock;
        this.locationCode = locationCode;
    }
}
