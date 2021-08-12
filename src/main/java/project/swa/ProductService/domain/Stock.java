package project.swa.ProductService.domain;

import lombok.Data;

//@Data
public class Stock {
    private int numberInStock;
    private String locationCode;

    public Stock(int numberInStock, String locationCode) {
        this.numberInStock = numberInStock;
        this.locationCode = locationCode;
    }

    public int getNumberInStock() {
        return numberInStock;
    }

    public void setNumberInStock(int numberInStock) {
        this.numberInStock = numberInStock;
    }

    public String getLocationCode() {
        return locationCode;
    }

    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode;
    }
}
