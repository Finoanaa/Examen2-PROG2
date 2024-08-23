package com.projet;

import org.w3c.dom.Text;

import java.util.List;

public class Park extends Place {
    private List<Hotel> hotelList;
    public Park(String name, GeographicCoordinate geographicCoordinate, Text description, List<Hotel> hotelList) {
        super(name, geographicCoordinate, description);
        this.hotelList = hotelList;
    }
    public List<Hotel> getHotelList() {
        return hotelList;
    }
    public void setHotelList(List<Hotel> hotelList) {
        this.hotelList = hotelList;

    }
}
