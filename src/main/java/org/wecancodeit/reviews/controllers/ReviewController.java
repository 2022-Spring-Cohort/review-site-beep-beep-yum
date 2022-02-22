package org.wecancodeit.reviews.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.wecancodeit.reviews.entities.FoodTruck;
import org.wecancodeit.reviews.entities.Hashtag;
import org.wecancodeit.reviews.entities.Review;
import org.wecancodeit.reviews.repos.FoodTruckRepository;
import org.wecancodeit.reviews.repos.ReviewRepository;

@Controller
public class ReviewController {

    private ReviewRepository reviewRepo;
    private FoodTruckRepository foodTruckRepo;

    public ReviewController(ReviewRepository reviewRepo, FoodTruckRepository foodTruckRepo) {
        this.reviewRepo = reviewRepo;
        this.foodTruckRepo = foodTruckRepo;
    }

//in order to finish this we need to make the form
    @PostMapping("/FoodTruckTemplate/{foodTruckId}")
    public String showSubmitReviewTemplate( @PathVariable long foodTruckId, @RequestParam String review, @RequestParam int starRating){

        FoodTruck theFoodTruck = foodTruckRepo.findById(foodTruckId).get();
        float sum =0;
        for(Review currentReview:theFoodTruck.getReviews()){
            sum += currentReview.getStarRating();
        }
        theFoodTruck.setAverageRating(Math.round(sum/theFoodTruck.getReviews().size()));
        Review theReview = new Review(review, starRating, theFoodTruck);
        reviewRepo.save(theReview);

        return "redirect:/FoodTruckTemplate/" + foodTruckId;
    }
}
