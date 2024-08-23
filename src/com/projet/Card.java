package com.projet;

import java.util.ArrayList;
import java.util.List;

public class Card {
    private List<Park> parkList;

    public Card(List<Park> parkList) {
        this.parkList = parkList;
    }

    public List<Park> getParkList() {
        return parkList;
    }

    public void setParkList(List<Park> parkList) {
        this.parkList = parkList;
    }
    public void showCard(){
        for (Park park : parkList) {
            System.out.println(park);
        }
    }

    @Override
    public String toString() {
        return "Card{" +
                "parkList=" + parkList +
                '}';
    }
}
