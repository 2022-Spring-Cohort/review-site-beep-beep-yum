package org.wecancodeit.reviews.entities;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Arrays;
import java.util.Collection;

@Entity
public class Hashtag {
    @Id
    @GeneratedValue

    private long hashtagId;
    private String hashtag;

    @ManyToMany
    private Collection<FoodTruck> foodTrucks;

    public Hashtag( String hashTag, FoodTruck...foodTrucks) {
        this.hashtag = hashtag;
        this.foodTrucks = Arrays.asList(foodTrucks);

    }

    public Hashtag(){

    }

    public long getHashtagId() {
        return hashtagId;
    }

    public String getHashtag() {
        return hashtag;
    }

    public Collection<FoodTruck> getFoodTrucks() {
        return foodTrucks;
    }
}
