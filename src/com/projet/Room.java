package com.projet;

import java.util.ArrayList;
import java.util.List;

public class Room {
    private String number;
    private int amountPerNight;
    private List<Review> reviewList = new ArrayList<>();

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getAmountPerNight() {
        return amountPerNight;
    }

    public void setAmountPerNight(int amountPerNight) {
        this.amountPerNight = amountPerNight;
    }

    public List<Review> getReviewList() {
        return reviewList;
    }

    public void setReviewList(List<Review> reviewList) {
        this.reviewList = reviewList;
    }

    public void addReview(List<Review> reviewList){
        this.reviewList.addAll(reviewList);
    }
}

