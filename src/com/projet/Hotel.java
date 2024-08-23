package com.projet;

import org.w3c.dom.Text;

import java.util.List;

public class Hotel extends Place{
    private Contact contact;
    private List<Room> roomList;
    public Hotel(String name, GeographicCoordinate geographicCoordinate, Text description,List<Review> reviewList, Contact contact, List<Room> roomList) {
        super(name, geographicCoordinate, description, reviewList);
        this.contact = contact;
        this.roomList = roomList;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public List<Room> getRoomList() {
        return roomList;
    }

    public void setRoomList(List<Room> roomList) {
        this.roomList = roomList;
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

    @Override
    public void addReview(List<Review> reviewList) {
        super.addReview(reviewList);
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "contact=" + contact +
                ", roomList=" + roomList +
                '}';
    }
}
