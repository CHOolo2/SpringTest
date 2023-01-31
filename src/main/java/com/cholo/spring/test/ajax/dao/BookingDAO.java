package com.cholo.spring.test.ajax.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cholo.spring.test.ajax.model.Booking;

@Repository
public interface BookingDAO {

	public List<Booking> selectBooking();
}