package org.wecancodeit.reviews.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.wecancodeit.reviews.entities.FoodTruck;
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
    @PostMapping("/SubmitReviewTemplate/{foodTruckId}")
    public String showSubmitReviewTemplate( @PathVariable long foodTruckId, @RequestParam String review, @RequestParam String rating){
        FoodTruck theFoodTruck = foodTruckRepo.findById(foodTruckId).get();
//        Review review = new Review()

        return "SubmitReviewTemplate";
    }
}
