package com.java.HotelReservation;

import java.util.ArrayList;
import java.util.List;

public class HotelReservation {
	List<Hotel> hotelDetails = new ArrayList<>();

	public void addHotelDetails(String hotelName, int weekdayRateForRegular, int weekendRateForRegular,
			int weekdayRateForRewarder, int weekendRateForRewarder) {

		Hotel hotel = new Hotel(hotelName, weekdayRateForRegular, weekendRateForRegular, weekdayRateForRewarder,
				weekendRateForRewarder);
		hotelDetails.add(hotel);

	}
	public void getHotelDetails() {
		System.out.println(hotelDetails);
	}

	public boolean checkHotelDetails(Hotel hotel) {
		return hotelDetails.add(hotel);

	}

}
