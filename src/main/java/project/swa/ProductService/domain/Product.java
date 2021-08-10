package project.swa.ProductService.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "PRODUCT")
public class Product {
    @Id
    private String productNumber;
    private String name;
    private Double price;
    private String description;
    private Stock stock;
    private List<Review> reviews;

    public Product(String productNumber, String name, Double price, String description, Stock stock, List<Review> reviews) {
        this.productNumber = productNumber;
        this.name = name;
        this.price = price;
        this.description = description;
        this.stock = stock;
        this.reviews = reviews;
    }
}
