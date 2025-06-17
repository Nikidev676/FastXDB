package com.example.FastXprojdemo.entity;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.fastxprojdemo.entity.Bookings;
import com.example.fastxprojdemo.jpa.BookingsRegRepo;

@SpringBootTest
public class BookingsTest {
	@Autowired
	BookingsRegRepo bookingsRegRepo;

	@Test
	public void testConstructorAndGetters() {
		LocalDateTime bookingDate = LocalDateTime.of(2025, 6, 16, 10, 30);
		Bookings booking = new Bookings(1, 101, 301, bookingDate, 750.0, "CONFIRMED");

		assertEquals(1, booking.getId());
		assertEquals(101, booking.getUserId());
		assertEquals(301, booking.getRouteId());
		assertEquals(bookingDate, booking.getBookingDate());
		assertEquals(750.0, booking.getTotalAmount());
		assertEquals("CONFIRMED", booking.getStatus());
	}

	@Test
	public void testSetters() {
		Bookings booking = new Bookings();

		LocalDateTime now = LocalDateTime.now();

		booking.setId(2);
		booking.setUserId(202);
		booking.setRouteId(402);
		booking.setBookingDate(now);
		booking.setTotalAmount(1200.50);
		booking.setStatus("CANCELLED");

		assertEquals(2, booking.getId());
		assertEquals(202, booking.getUserId());
		assertEquals(402, booking.getRouteId());
		assertEquals(now, booking.getBookingDate());
		assertEquals(1200.50, booking.getTotalAmount());
		assertEquals("CANCELLED", booking.getStatus());
	}

	@Test
	public void testToString() {
		LocalDateTime time = LocalDateTime.of(2025, 6, 16, 9, 0);
		Bookings booking = new Bookings(3, 103, 303, time, 999.99, "CONFIRMED");

		String expected = "Bookings [id=3, userId=103, routeId=303, bookingDate=" + time
				+ ", totalAmount=999.99, status=CONFIRMED]";

		assertEquals(expected, booking.toString());
	}
}
