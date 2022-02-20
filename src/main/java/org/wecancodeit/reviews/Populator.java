package org.wecancodeit.reviews;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancodeit.reviews.entities.Category;
import org.wecancodeit.reviews.entities.FoodTruck;
import org.wecancodeit.reviews.entities.Hashtag;
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

        Category category1 = new Category("Barbecue", "/img/barbecue.jpg", foodTruck1, foodTruck2);
        categoryRepo.save(category1);
        Category category2 = new Category("Seafood", "/img/seafood.jpg");
        categoryRepo.save(category2);
        Category category3 = new Category("Mexican", "/img/Mexican.jpg", foodTruck1, foodTruck2);
        categoryRepo.save(category3);
        Category category4 = new Category("Mediterranean", "/img/Mediterranean.jpg", foodTruck1, foodTruck2);
        categoryRepo.save(category4);
        Category category5 = new Category("Sweet Treats", "/img/SweetTreats.jpg", foodTruck1, foodTruck2);
        categoryRepo.save(category5);
        Category category6 = new Category("American", "/img/American.jpg", foodTruck1, foodTruck2);
        categoryRepo.save(category6);
        Category category7 = new Category("European", "/img/european.jpg", foodTruck1, foodTruck2);
        categoryRepo.save(category7);
        Category category8 = new Category("Breakfast", "/img/breakfast.jpg", foodTruck1, foodTruck2);
        categoryRepo.save(category8);
        Category category9 = new Category("Asian", "/img/asian.jpg", foodTruck1, foodTruck2);
        categoryRepo.save(category9);
        Category category10 = new Category("Middle Eastern", "/img/middleEastern.jpg", foodTruck1, foodTruck2);
        categoryRepo.save(category10);
        Category category11 = new Category("Soul Food", "/img/soulFood.jpg", foodTruck1, foodTruck2);
        categoryRepo.save(category11);

        Hashtag hashtag1 = new Hashtag("#ooeygooeyinmytummy", foodTruck1,foodTruck2);
        hashtagRepo.save(hashtag1);
        Hashtag hashtag2 = new Hashtag("#GoodFoodGoodGood", foodTruck1,foodTruck2);
        hashtagRepo.save(hashtag2);
        Hashtag hashtag3 = new Hashtag("#GoodSeafood", foodTruck1,foodTruck2);
        hashtagRepo.save(hashtag3);
        Hashtag hashtag4 = new Hashtag("#badseafoodbadbad", foodTruck1,foodTruck2);
        hashtagRepo.save(hashtag4);


    }





}
