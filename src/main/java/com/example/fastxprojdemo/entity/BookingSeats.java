package com.example.fastxprojdemo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class BookingSeats {
	@Id
    private int id;
    private int bookingId;
    private int seatId;

    public BookingSeats() {}

    public BookingSeats(int id, int bookingId, int seatId) {
        this.id = id;
        this.bookingId = bookingId;
        this.seatId = seatId;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public int getSeatId() {
		return seatId;
	}

	public void setSeatId(int seatId) {
		this.seatId = seatId;
	}

	@Override
	public String toString() {
		return "BookingSeats [id=" + id + ", bookingId=" + bookingId + ", seatId=" + seatId + "]";
	}


}
