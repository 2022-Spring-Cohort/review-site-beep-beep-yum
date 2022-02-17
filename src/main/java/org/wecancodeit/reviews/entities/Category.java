package org.wecancodeit.reviews.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

@Entity
public class Category {
    @Id
    @GeneratedValue

    private long categoryId;
    private String category;

    @ManyToMany
    private Collection<FoodTruck> foodTrucks;

    public Category(String category, FoodTruck...foodTrucks) {
        this.category = category;
        this.foodTrucks = Arrays.asList(foodTrucks);
    }

    public Category() {
    }

    public long getCategoryId() {
        return categoryId;
    }

    public String getCategory() {
        return category;
    }

    public Collection<FoodTruck> getFoodTrucks() {
        return foodTrucks;
    }
}


