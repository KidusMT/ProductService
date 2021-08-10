package project.swa.ProductService.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "PRODUCT")
public class Product {
    @Id
    private String productNumber;
    private String name;
    private Double price;
    private String description;
    private Stock stock;

    public Product(String productNumber, String name, Double price, String description, Stock stock) {
        this.productNumber = productNumber;
        this.name = name;
        this.price = price;
        this.description = description;
        this.stock = stock;
    }
}
