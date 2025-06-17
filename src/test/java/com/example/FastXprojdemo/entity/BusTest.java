package com.example.FastXprojdemo.entity;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.fastxprojdemo.entity.Bus;
import com.example.fastxprojdemo.jpa.BusRegRepo;

@SpringBootTest
public class BusTest {
	@Autowired
	BusRegRepo busRegRepo;

	@Test
	public void testConstructorAndGetters() {
		Bus bus = new Bus(1, "SRS Travels", "KA01AB1234", "Sleeper", 40, "WiFi, Charging Port");

		assertEquals(1, bus.getId());
		assertEquals("SRS Travels", bus.getBusName());
		assertEquals("KA01AB1234", bus.getBusNumber());
		assertEquals("Sleeper", bus.getType());
		assertEquals(40, bus.getTotalSeats());
		assertEquals("WiFi, Charging Port", bus.getAmenities());
	}

	@Test
	public void testSetters() {
		Bus bus = new Bus();

		bus.setId(2);
		bus.setBusName("VRL Express");
		bus.setBusNumber("MH12XY9876");
		bus.setType("AC Seater");
		bus.setTotalSeats(30);
		bus.setAmenities("AC, Recliner Seats");

		assertEquals(2, bus.getId());
		assertEquals("VRL Express", bus.getBusName());
		assertEquals("MH12XY9876", bus.getBusNumber());
		assertEquals("AC Seater", bus.getType());
		assertEquals(30, bus.getTotalSeats());
		assertEquals("AC, Recliner Seats", bus.getAmenities());
	}

	@Test
	public void testToString() {
		Bus bus = new Bus(3, "KSRTC", "KL07CD3456", "Deluxe", 50, "Toilet, Water Bottle");
		String expected = "Bus [id=3, busName=KSRTC, busNumber=KL07CD3456, type=Deluxe, totalSeats=50, amenities=Toilet, Water Bottle]";
		assertEquals(expected, bus.toString());
	}
}
