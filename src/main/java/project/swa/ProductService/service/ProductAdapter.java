package project.swa.ProductService.service;

import project.swa.ProductService.domain.Product;

public class ProductAdapter {
    public static Product getProduct(ProductDTO productDTO) {
        return new Product(
                productDTO.getProductNumber(),
                productDTO.getName(),
                productDTO.getPrice(),
                productDTO.getDescription(),
                StockAdapter.getStock(productDTO.getStockDTO()),
                productDTO.getReviewDTOS().stream().map(ReviewAdapter::getReview).toList());
    }

    public static ProductDTO getProductDTO(Product product) {
        return new ProductDTO(product.getProductNumber(),
                product.getName(),
                product.getPrice(),
                product.getDescription(),
                StockAdapter.getStockDTO(product.getStock()),
                product.getReviews().stream().map(ReviewAdapter::getReviewDTO).toList());
    }
}
