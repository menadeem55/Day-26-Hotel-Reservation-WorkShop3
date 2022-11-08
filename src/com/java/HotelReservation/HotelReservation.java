package com.java.HotelReservation;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class HotelReservation {
	List<Hotel> hotelDetails = new ArrayList<>();

	public void addHotelDetails(String hotelName, int weekdayRateForRegular, int weekendRateForRegular,
			int weekdayRateForRewarder, int weekendRateForRewarder, int hotelRatings) {

		Hotel hotel = new Hotel(hotelName, weekdayRateForRegular, weekendRateForRegular, weekdayRateForRewarder,
				weekendRateForRewarder, hotelRatings);
		hotelDetails.add(hotel);

	}

	public void getHotelDetails() {
		System.out.println(hotelDetails);
	}

	public boolean checkHotelDetails(Hotel hotel) {
		return hotelDetails.add(hotel);
	}

	public void getMinPriceHotel() {
		Hotel cheapestHotel = hotelDetails.stream().min(Comparator.comparing(Hotel::getWeekdayRateForRegularCustomer))
				.orElseThrow();
		System.out.println(cheapestHotel);
	}

	public void getCheapestHotel() {
		int LakewoodRate = 110;
		int BridgewoodRate = 160;
		int Ridgewood = 220;
		int cheapestHotel = (LakewoodRate > BridgewoodRate) ? (Math.max(LakewoodRate, Ridgewood)) : (Ridgewood);
		System.out.println("The cheapest Hotel Rate is " + cheapestHotel);

	}

	public void getCheapestHotelForGivenDate() {
		String hotel = null;
		int totalLakeWoodCost = 0, totalBridgeWoodCost = 0, totalRidgeWoodCost = 0;
		int LakeWood_Rate = 3, BridgeWood_Rate = 4, RidgeWood_Rate = 5;
		if (Objects.equals(hotel, "LakeWood")) {
			int weekday_rate = 110;
			int weekend_rate = 90;
			totalLakeWoodCost = (totalLakeWoodCost + weekday_rate + weekend_rate);

		}
		if (Objects.equals(hotel, "BridgeWood")) {
			int weekday_rate = 150;
			int weekend_rate = 50;
			totalBridgeWoodCost = (totalBridgeWoodCost + weekday_rate + weekend_rate);
		}
		if (Objects.equals(hotel, "RidgeWood")) {
			int weekday_rate = 220;
			int weekend_rate = 150;
			totalRidgeWoodCost = (totalRidgeWoodCost + weekday_rate + weekend_rate);

		}
		if ((totalBridgeWoodCost <= totalLakeWoodCost && totalBridgeWoodCost < totalBridgeWoodCost)
				&& (totalLakeWoodCost < totalBridgeWoodCost && totalBridgeWoodCost < totalBridgeWoodCost)) {
			System.out.println("BridgeWood");
			System.out.println("Rating:" + BridgeWood_Rate);
			System.out.println("Total Rates: $" + totalBridgeWoodCost);

		}

	}

	public void viewHotels() {
		getCheapestHotelForGivenDate();
	}

}
