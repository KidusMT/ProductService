package project.swa.ProductService.domain;

import lombok.Data;

//@Data
public class Review {
    private String title;
    private String description;
    private double score;

    public Review(String title, String description, double score) {
        this.title = title;
        this.description = description;
        this.score = score;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
