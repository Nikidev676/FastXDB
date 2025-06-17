package com.example.FastXprojdemo.entity;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.example.fastxprojdemo.entity.BookingSeats;

public class BookingSeatsTest {

    @Test
    public void testConstructorAndGetters() {
        BookingSeats bookingSeat = new BookingSeats(1, 101, 501);

        assertEquals(1, bookingSeat.getId());
        assertEquals(101, bookingSeat.getBookingId());
        assertEquals(501, bookingSeat.getSeatId());
    }

    @Test
    public void testSetters() {
        BookingSeats bookingSeat = new BookingSeats();

        bookingSeat.setId(2);
        bookingSeat.setBookingId(202);
        bookingSeat.setSeatId(502);

        assertEquals(2, bookingSeat.getId());
        assertEquals(202, bookingSeat.getBookingId());
        assertEquals(502, bookingSeat.getSeatId());
    }

    @Test
    public void testToString() {
        BookingSeats bookingSeat = new BookingSeats(3, 303, 503);

        String expected = "BookingSeats [id=3, bookingId=303, seatId=503]";
        assertEquals(expected, bookingSeat.toString());
    }
}
