package com.example.FastXprojdemo.entity;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.fastxprojdemo.entity.Routes;
import com.example.fastxprojdemo.jpa.RoutesRegRepo;

@SpringBootTest
public class RoutesTest {
	@Autowired 
	    RoutesRegRepo routesRegRepo;

	@Test
	public void testConstructorAndGetters() {
		LocalDateTime departure = LocalDateTime.of(2025, 6, 16, 10, 30);
		LocalDateTime arrival = LocalDateTime.of(2025, 6, 16, 14, 15);

		Routes route = new Routes(1, 101, "Chennai", "Bangalore", departure, arrival, 799.50);

		assertEquals(1, route.getId());
		assertEquals(101, route.getBusId());
		assertEquals("Chennai", route.getOrigin());
		assertEquals("Bangalore", route.getDestination());
		assertEquals(departure, route.getDepartureTime());
		assertEquals(arrival, route.getArrivalTime());
		assertEquals(799.50, route.getFare());
	}

	@Test
	public void testSetters() {
		Routes route = new Routes();

		LocalDateTime departure = LocalDateTime.of(2025, 7, 10, 8, 0);
		LocalDateTime arrival = LocalDateTime.of(2025, 7, 10, 12, 30);

		route.setId(2);
		route.setBusId(202);
		route.setOrigin("Hyderabad");
		route.setDestination("Pune");
		route.setDepartureTime(departure);
		route.setArrivalTime(arrival);
		route.setFare(999.00);

		assertEquals(2, route.getId());
		assertEquals(202, route.getBusId());
		assertEquals("Hyderabad", route.getOrigin());
		assertEquals("Pune", route.getDestination());
		assertEquals(departure, route.getDepartureTime());
		assertEquals(arrival, route.getArrivalTime());
		assertEquals(999.00, route.getFare());
	}

	@Test
	public void testToString() {
		LocalDateTime departure = LocalDateTime.of(2025, 8, 1, 6, 45);
		LocalDateTime arrival = LocalDateTime.of(2025, 8, 1, 10, 30);

		Routes route = new Routes(3, 303, "Delhi", "Jaipur", departure, arrival, 650.00);

		String expected = "Routes [id=3, busId=303, origin=Delhi, destination=Jaipur, departureTime=" + departure
				+ ", arrivalTime=" + arrival + ", fare=650.0]";

		assertEquals(expected, route.toString());
	}
}
