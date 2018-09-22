package com.kiwilio.springjsonrequestvalidation.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

public class Building {
    @Min(value = 1, message = "Building needs at least 1 storey")
    private Integer stories;

    @Size(min = 5, message = "The minimum length of address should be 5 symbols")
    private String address;

    public void setStories(Integer stories) {
        this.stories = stories;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getStories() {
        return stories;
    }

    public String getAddress() {
        return address;
    }
}
