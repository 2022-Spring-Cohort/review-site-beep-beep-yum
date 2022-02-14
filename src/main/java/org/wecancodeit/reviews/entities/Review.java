package org.wecancodeit.reviews.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Review {
    @Id
    @GeneratedValue

    private long reviewId;
    private String review;
    private int starRating;
    private long truckId;

    public Review(long reviewId, String review, int starRating, long truckId) {
        this.reviewId = reviewId;
        this.review = review;
        this.starRating = starRating;
        this.truckId = truckId;
    }

    public Review(){

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

    public long getTruckId() {
        return truckId;
    }
}


