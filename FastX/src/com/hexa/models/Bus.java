package com.hexa.models;

public class Bus {
    private int id;
    private String busName;
    private String busNumber;
    private String type;
    private int totalSeats;
    private String amenities;

    public Bus() {}

    public Bus(int id, String busName, String busNumber, String type, int totalSeats, String amenities) {
        this.id = id;
        this.busName = busName;
        this.busNumber = busNumber;
        this.type = type;
        this.totalSeats = totalSeats;
        this.amenities = amenities;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getBusName() { return busName; }
    public void setBusName(String busName) { this.busName = busName; }

    public String getBusNumber() { return busNumber; }
    public void setBusNumber(String busNumber) { this.busNumber = busNumber; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public int getTotalSeats() { return totalSeats; }
    public void setTotalSeats(int totalSeats) { this.totalSeats = totalSeats; }

    public String getAmenities() { return amenities; }
    public void setAmenities(String amenities) { this.amenities = amenities; }
}
