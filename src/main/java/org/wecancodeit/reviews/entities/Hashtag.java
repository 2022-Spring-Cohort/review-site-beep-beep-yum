package org.wecancodeit.reviews.entities;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Hashtag {
    @Id
    @GeneratedValue

    private long hashtagId;
    private String hashtag;
    private long truckId;

    public Hashtag(long id, String hashTag, long truckId) {
        this.hashtagId = id;
        this.hashtag = hashtag;
        this.truckId = truckId;
    }

    public Hashtag(){

    }

    public long getId() {
        return hashtagId;
    }

    public String getHashtag() {
        return hashtag;
    }

    public long getTruckId() {
        return truckId;
    }
}
