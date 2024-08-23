package com.projet;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class Park extends Place {
    private List<Hotel> hotelList;
    private List<Review> reviewList = new ArrayList<>();
    public Park(String name, GeographicCoordinate geographicCoordinate, Text description, List<Hotel> hotelList,List<Review> reviewList) {
        super(name, geographicCoordinate, description,reviewList);
        this.hotelList = hotelList;
    }
    public List<Hotel> getHotelList() {
        return hotelList;
    }
    public void setHotelList(List<Hotel> hotelList) {
        this.hotelList = hotelList;

    }

    public List<Review> getCustomerOpinionList() {
        return reviewList;
    }

    public void setCustomerOpinionList(List<Review> reviewList) {
        this.reviewList = reviewList;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public GeographicCoordinate getGeographicCoordinate() {
        return super.getGeographicCoordinate();
    }

    @Override
    public void setGeographicCoordinate(GeographicCoordinate geographicCoordinate) {
        super.setGeographicCoordinate(geographicCoordinate);
    }

    @Override
    public Text getDescription() {
        return super.getDescription();
    }

    @Override
    public void setDescription(Text description) {
        super.setDescription(description);
    }

    public Park(String name, GeographicCoordinate geographicCoordinateList, Text description, List<Review> reviewList) {
        super(name, geographicCoordinateList, description, reviewList);
    }

    @Override
    public void addReview(List<Review> reviewList) {
        super.addReview(reviewList);
    }
}
