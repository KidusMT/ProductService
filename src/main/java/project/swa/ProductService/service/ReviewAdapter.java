package project.swa.ProductService.service;

import project.swa.ProductService.domain.Review;

public class ReviewAdapter {
    public static Review getReview(ReviewDTO productDTO) {
        return new Review(
                productDTO.getTitle(),
                productDTO.getDescription(),
                productDTO.getScore());
    }

    public static ReviewDTO getReviewDTO(Review product) {
        return new ReviewDTO(product.getTitle(),
                product.getDescription(),
                product.getScore());
    }
}
