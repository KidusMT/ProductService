package project.swa.ProductService.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

//@Data
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

    public Product() {
    }

    public String getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }
}
