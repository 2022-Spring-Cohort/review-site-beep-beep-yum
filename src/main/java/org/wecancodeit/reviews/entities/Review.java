package org.wecancodeit.reviews.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Review {
    @Id
    @GeneratedValue

    private long reviewId;
    private String review;
    private int starRating;
    private String reviewTitle;
    private String reviewAuthor;
    @ManyToOne
    private FoodTruck foodTruck;

    public Review(long reviewId, String review, int starRating, FoodTruck foodTruck, String reviewTitle, String reviewAuthor) {
        this.reviewId = reviewId;
        this.review = review;
        this.starRating = starRating;
        this.foodTruck = foodTruck;
        this.reviewTitle = reviewTitle;
        this.reviewAuthor = reviewAuthor;
    }

    public Review() {
    }

    public long getReviewId() {
        return reviewId;
    }

    public String getReview() {
        return review;
    }

    public int getStarRating() {
        return starRating;
    }

    public String getReviewTitle() {
        return reviewTitle;
    }

    public String getReviewAuthor() {
        return reviewAuthor;
    }

    public FoodTruck getFoodTruck() {
        return foodTruck;
    }
}





