package com.java.HotelReservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HotelReservationMain {
	public static void main(String[] args) throws ParseException {
		System.out.println("Welcome to Hotel Reservation Program");
		HotelReservation hotelReservation = new HotelReservation();
		hotelReservation.addHotelDetails("Lakewood", 110, 80, 90, 80);
		hotelReservation.addHotelDetails("Bridgewood", 160, 110, 60, 50);
		hotelReservation.addHotelDetails("Ridgewood", 220, 110, 150, 40);
		String startDate = "10-09-2020";
		String endDate = "11-09-2020";
		Date sDate = new SimpleDateFormat("dd-MM-yyyy").parse(startDate);
		Date eDate = new SimpleDateFormat("dd-MM-yyyy").parse(endDate);
		System.out.println(startDate + "\t" + sDate);
		System.out.println(endDate + "\t" + eDate);
		hotelReservation.viewHotels();

	}

}
