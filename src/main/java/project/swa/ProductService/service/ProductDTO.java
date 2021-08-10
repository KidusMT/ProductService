package project.swa.ProductService.service;

import lombok.Data;
import project.swa.ProductService.domain.Stock;

@Data
public class ProductDTO {
    private String productNumber;
    private String name;
    private Double price;
    private String description;
    private Stock stock;

    public ProductDTO(String productNumber, String name, Double price, String description, Stock stock) {
        this.productNumber = productNumber;
        this.name = name;
        this.price = price;
        this.description = description;
        this.stock = stock;
    }
}
