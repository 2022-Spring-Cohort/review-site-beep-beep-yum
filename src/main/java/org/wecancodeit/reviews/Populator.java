package org.wecancodeit.reviews;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancodeit.reviews.entities.Category;
import org.wecancodeit.reviews.entities.FoodTruck;
import org.wecancodeit.reviews.repos.CategoryRepository;
import org.wecancodeit.reviews.repos.FoodTruckRepository;
import org.wecancodeit.reviews.repos.HashtagRepository;
import org.wecancodeit.reviews.repos.ReviewRepository;

@Component
public class Populator implements CommandLineRunner {
    @Autowired
    FoodTruckRepository foodTruckRepo;
    @Autowired
    CategoryRepository categoryRepo;
    @Autowired
    ReviewRepository reviewRepo;
    @Autowired
    HashtagRepository hashtagRepo;
    @Override
    public void run(String... args) throws Exception {
        FoodTruck foodTruck1 = new FoodTruck("Dos Hermanos", "https://doshermanoscolumbus.com/",true,"img");
        foodTruckRepo.save(foodTruck1);
        FoodTruck foodTruck2 = new FoodTruck("Schmidt's","https://www.schmidthaus.com/sausage-truck/", false, "img2");
        foodTruckRepo.save(foodTruck2);

        Category category1 = new Category("Barbecue", foodTruck1, foodTruck2);
        categoryRepo.save(category1);
        Category category2 = new Category("Seafood");
        categoryRepo.save(category2);
        Category category3 = new Category("Mexican", foodTruck1, foodTruck2);
        categoryRepo.save(category3);
    }
}
