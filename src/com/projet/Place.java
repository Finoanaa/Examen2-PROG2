package com.projet;

import org.w3c.dom.Text;

import java.util.List;

public abstract class Place {
    private String name;
    private GeographicCoordinate geographicCoordinate;
    private Text description;

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

    public Place(String name, GeographicCoordinate geographicCoordinateList, Text description) {
        this.name = name;
        this.geographicCoordinate = geographicCoordinateList;
        this.description = description;

    }
}
