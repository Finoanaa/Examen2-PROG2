package com.projet;

import org.w3c.dom.Text;

import java.util.List;

public abstract class Place {
    private String name;
    private GeographicCoordinate geographicCoordinate;
    private Text description;
    private List<CustomerOpinion> customerOpinionList;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GeographicCoordinate getGeographicCoordinate() {
        return geographicCoordinate;
    }

    public void setGeographicCoordinate(GeographicCoordinate geographicCoordinate) {
        this.geographicCoordinate = geographicCoordinate;
    }

    public Text getDescription() {
        return description;
    }

    public void setDescription(Text description) {
        this.description = description;
    }

    public List<CustomerOpinion> getCustomerOpinionList() {
        return customerOpinionList;
    }

    public void setCustomerOpinionList(List<CustomerOpinion> customerOpinionList) {
        this.customerOpinionList = customerOpinionList;
    }

    public Place(String name, GeographicCoordinate geographicCoordinateList, Text description, List<CustomerOpinion> customerOpinionList) {
        this.name = name;
        this.geographicCoordinate = geographicCoordinateList;
        this.description = description;
        this.customerOpinionList = customerOpinionList;

    }
}
