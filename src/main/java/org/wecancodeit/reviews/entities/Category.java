package org.wecancodeit.reviews.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Category {
    @Id
    @GeneratedValue

    private long categoryId;
    private String category;
    private long truckId;

    public Category(long id, String category, long truckId) {
        this.categoryId = id;
        this.category = category;
        this.truckId = truckId;
    }
    public Category(){

    }

    public long getId() {
        return categoryId;
    }

    public String getCategory() {
        return category;
    }

    public long getTruckId() {
        return truckId;
    }
}
