package com.example.FastXprojdemo.entity;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.fastxprojdemo.entity.Seats;
import com.example.fastxprojdemo.jpa.SeatsRegRepo;

@SpringBootTest
public class SeatsTest {

	@Autowired
	SeatsRegRepo seatsRegRepo;

	@Test
	public void testConstructorAndGetters() {
		Seats seat = new Seats(1, 101, "A1", true);

		assertEquals(1, seat.getId());
		assertEquals(101, seat.getRouteId());
		assertEquals("A1", seat.getSeatNumber());
		assertTrue(seat.isBooked());
	}

	@Test
	public void testSettersAndGetters() {
		Seats seat = new Seats();

		seat.setId(2);
		seat.setRouteId(202);
		seat.setSeatNumber("B5");
		seat.setBooked(false);

		assertEquals(2, seat.getId());
		assertEquals(202, seat.getRouteId());
		assertEquals("B5", seat.getSeatNumber());
		assertFalse(seat.isBooked());
	}

	@Test
	public void testToString() {
		Seats seat = new Seats(3, 303, "C3", true);
		String expected = "Seats [id=3, routeId=303, seatNumber=C3, isBooked=true]";
		assertEquals(expected, seat.toString());
	}
}
