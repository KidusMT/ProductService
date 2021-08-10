package project.swa.ProductService.service;

import project.swa.ProductService.domain.Product;

public class ProductAdapter {
    public static Product getProduct(ProductDTO productDTO) {
        return new Product(
                productDTO.getProductNumber(),
                productDTO.getName(),
                productDTO.getPrice(),
                productDTO.getDescription(),
                productDTO.getStock());
    }

    public static ProductDTO getProductDTO(Product product) {
        return new ProductDTO(product.getProductNumber(),
                product.getName(),
                product.getPrice(),
                product.getDescription(),
                product.getStock());
    }
}
