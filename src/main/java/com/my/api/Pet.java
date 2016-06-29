package com.my.api;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by isuru on 6/29/2016.
 */
public class Pet {

    private long id;
    private String name;
    private String status;
    private String type;
    private String breed;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
