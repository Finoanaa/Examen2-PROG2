package com.projet;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class Park extends Place {
    private List<Hotel> hotelList;
    private List<CustomerOpinion> customerOpinionList = new ArrayList<>();
    public Park(String name, GeographicCoordinate geographicCoordinate, Text description, List<Hotel> hotelList,List<CustomerOpinion> customerOpinionList) {
        super(name, geographicCoordinate, description,customerOpinionList);
        this.hotelList = hotelList;
    }
    public List<Hotel> getHotelList() {
        return hotelList;
    }
    public void setHotelList(List<Hotel> hotelList) {
        this.hotelList = hotelList;

    }

    public List<CustomerOpinion> getCustomerOpinionList() {
        return customerOpinionList;
    }

    public void setCustomerOpinionList(List<CustomerOpinion> customerOpinionList) {
        this.customerOpinionList = customerOpinionList;
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

    public Park(String name, GeographicCoordinate geographicCoordinateList, Text description, List<CustomerOpinion> customerOpinionList) {
        super(name, geographicCoordinateList, description, customerOpinionList);
    }

    @Override
    public void addOpinion(List<CustomerOpinion> customerOpinionList) {
        super.addOpinion(customerOpinionList);
    }
}
