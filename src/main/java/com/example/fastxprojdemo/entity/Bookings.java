package com.example.fastxprojdemo.entity;


import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Bookings{
	@Id
    private int id;
    private int userId;
    private int routeId;
    private LocalDateTime bookingDate;
    private double totalAmount;
    private String status; // CONFIRMED or CANCELLED

    public Bookings() {}

    public Bookings(int id, int userId, int routeId, LocalDateTime bookingDate, double totalAmount, String status) {
        this.id = id;
        this.userId = userId;
        this.routeId = routeId;
        this.bookingDate = bookingDate;
        this.totalAmount = totalAmount;
        this.status = status;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getRouteId() {
		return routeId;
	}

	public void setRouteId(int routeId) {
		this.routeId = routeId;
	}

	public LocalDateTime getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(LocalDateTime bookingDate) {
		this.bookingDate = bookingDate;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Bookings [id=" + id + ", userId=" + userId + ", routeId=" + routeId + ", bookingDate=" + bookingDate
				+ ", totalAmount=" + totalAmount + ", status=" + status + "]";
	}


}
