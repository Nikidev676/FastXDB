package com.hexa.models;


public class BusOperator {
    private int id;
    private int userId;
    private String companyName;

    public BusOperator() {}

    public BusOperator(int id, int userId, String companyName) {
        this.id = id;
        this.userId = userId;
        this.companyName = companyName;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }

    public String getCompanyName() { return companyName; }
    public void setCompanyName(String companyName) { this.companyName = companyName; }
}
