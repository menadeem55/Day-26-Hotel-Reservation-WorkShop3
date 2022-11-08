package com.java.HotelReservation;

import org.junit.Assert;
import org.junit.Test;

public class HotelReservationTest {

	@Test
	public void givenHotelNameShouldBePassed() {
		HotelReservation hotelReservation = new HotelReservation();

		boolean lakewoodHotel = hotelReservation.checkHotelDetails(new Hotel("LakeWoods", 110, 80, 90, 80, 3));
		Assert.assertTrue(lakewoodHotel);
		boolean bridgewoodHotel = hotelReservation.checkHotelDetails(new Hotel("Bridgewood", 110, 110, 60, 50, 4));
		Assert.assertTrue(lakewoodHotel);
		boolean ridgewoodHotel = hotelReservation.checkHotelDetails(new Hotel("RidgeWoods", 100, 110, 150, 40, 5));
		Assert.assertTrue(ridgewoodHotel);
	}

	@Test
	public void toFindTheCheapestHotels() {
		HotelReservation hotelReservation = new HotelReservation();
		hotelReservation.getCheapestHotel();
	}

}
