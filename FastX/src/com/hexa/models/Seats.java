package com.hexa.models;


public class Seats {
    private int id;
    private int routeId;
    private String seatNumber;
    private boolean isBooked;

    public Seats() {}

    public Seats(int id, int routeId, String seatNumber, boolean isBooked) {
        this.id = id;
        this.routeId = routeId;
        this.seatNumber = seatNumber;
        this.isBooked = isBooked;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getRouteId() { return routeId; }
    public void setRouteId(int routeId) { this.routeId = routeId; }

    public String getSeatNumber() { return seatNumber; }
    public void setSeatNumber(String seatNumber) { this.seatNumber = seatNumber; }

    public boolean isBooked() { return isBooked; }
    public void setBooked(boolean isBooked) { this.isBooked = isBooked; }
}
