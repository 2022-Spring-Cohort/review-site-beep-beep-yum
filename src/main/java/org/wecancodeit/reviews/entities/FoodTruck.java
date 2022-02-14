package org.wecancodeit.reviews.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class FoodTruck {
    @Id
    @GeneratedValue

    private long truckId;
    private String name;
    private String website;
    private String category;
    private boolean orderAhead;

    public FoodTruck(long id, String name, String website, String category, boolean orderAhead) {
        this.truckId = id;
        this.name = name;
        this.website = website;
        this.category = category;
        this.orderAhead = orderAhead;
    }

    private FoodTruck(){

    }

    public long getId() {
        return truckId;
    }

    public String getName() {
        return name;
    }

    public String getWebsite() {
        return website;
    }

    public String getCategory() {
        return category;
    }

    public boolean isOrderAhead() {
        return orderAhead;
    }
}
