package org.wecancodeit.reviews.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.reviews.repos.FoodTruckRepository;

@Controller
public class FoodTruckController {
    private FoodTruckRepository foodTruckRepo;

    public FoodTruckController(FoodTruckRepository foodTruckRepo) {
        this.foodTruckRepo = foodTruckRepo;
    }
    @RequestMapping("/SingleCategoryTruckList/{categoryId}")
    public String showFoodTruckTemplate(Model model, @PathVariable long categoryId) {
        model.addAttribute("foodTruck", foodTruckRepo.findById(categoryId).get());
        return "SingleCategoryTruckListTemplate";
    }
}
