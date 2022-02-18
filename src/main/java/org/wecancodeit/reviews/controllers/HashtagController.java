package org.wecancodeit.reviews.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.reviews.repos.HashtagRepository;

@Controller
public class HashtagController {
    private HashtagRepository hashtagRepo;

    public HashtagController(HashtagRepository hashtagRepo) {
        this.hashtagRepo = hashtagRepo;
    }
    @RequestMapping("/AllHashtagsTemplate")
    public String showAllHashtagsTemplate(Model model){
        model.addAttribute("hashtags", hashtagRepo.findAll());
        return "AllHashtagsTemplate";
    }

    //    @RequestMapping("/CategoriesTemplate/SingleCategoryTruckListTemplate/{categoryId}")
//    public String showSingleCategoryTruckListTemplate(Model model, @PathVariable long categoryId) {
////        model.addAttribute("category", categoryRepo.findById(categoryId).get());
//        return "SingleCategoryTruckListTemplate";
//    }
}