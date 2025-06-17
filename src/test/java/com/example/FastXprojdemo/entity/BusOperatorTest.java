package com.example.FastXprojdemo.entity;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.fastxprojdemo.entity.BusOperator;

@SpringBootTest
public class BusOperatorTest {
	@Autowired
	BusOperator busOperatorRegRepo;

	@Test
	public void testConstructorAndGetters() {
		BusOperator operator = new BusOperator(1, 101, "RedBus Travels");

		assertEquals(1, operator.getId());
		assertEquals(101, operator.getUserId());
		assertEquals("RedBus Travels", operator.getCompanyName());
	}

	@Test
	public void testSetters() {
		BusOperator operator = new BusOperator();

		operator.setId(2);
		operator.setUserId(202);
		operator.setCompanyName("VRL Logistics");

		assertEquals(2, operator.getId());
		assertEquals(202, operator.getUserId());
		assertEquals("VRL Logistics", operator.getCompanyName());
	}

	@Test
	public void testToString() {
		BusOperator operator = new BusOperator(3, 303, "KSRTC");
		String expected = "BusOperator [id=3, userId=303, companyName=KSRTC]";
		assertEquals(expected, operator.toString());
	}
}
