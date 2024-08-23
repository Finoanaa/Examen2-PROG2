package com.projet;

import java.util.ArrayList;
import java.util.List;

public class Room {
    private String number;
    private int amountPerNight;
    private List<CustomerOpinion> customerOpinionList = new ArrayList<>();

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

    public List<CustomerOpinion> getCustomerOpinionList() {
        return customerOpinionList;
    }

    public void setCustomerOpinionList(List<CustomerOpinion> customerOpinionList) {
        this.customerOpinionList = customerOpinionList;
    }

    public Room(String number, int amountPerNight) {
        this.number = number;
        this.amountPerNight = amountPerNight;

    }
    public void addOpinion(List<CustomerOpinion> customerOpinionList){
        this.customerOpinionList.addAll(customerOpinionList);
    }

}

