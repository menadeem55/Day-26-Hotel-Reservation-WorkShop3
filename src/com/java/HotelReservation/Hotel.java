package com.java.HotelReservation;

public class Hotel {

	public String hotelName;
	public int weekdayRateForRegular;
	public int weekendRateForRegular;
	public int weekdayRateForRewarder;
	public int weekendRateForRewarder;
	public Hotel(String hotelName, int weekdayRateForRegular, int weekendRateForRegular, int weekdayRateForRewarder,
			int weekendRateForRewarder) {
		super();
		this.hotelName = hotelName;
		this.weekdayRateForRegular = weekdayRateForRegular;
		this.weekendRateForRegular = weekendRateForRegular;
		this.weekdayRateForRewarder = weekdayRateForRewarder;
		this.weekendRateForRewarder = weekendRateForRewarder;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public int getWeekdayRateForRegular() {
		return weekdayRateForRegular;
	}
	public void setWeekdayRateForRegular(int weekdayRateForRegular) {
		this.weekdayRateForRegular = weekdayRateForRegular;
	}
	public int getWeekendRateForRegular() {
		return weekendRateForRegular;
	}
	public void setWeekendRateForRegular(int weekendRateForRegular) {
		this.weekendRateForRegular = weekendRateForRegular;
	}
	public int getWeekdayRateForRewarder() {
		return weekdayRateForRewarder;
	}
	public void setWeekdayRateForRewarder(int weekdayRateForRewarder) {
		this.weekdayRateForRewarder = weekdayRateForRewarder;
	}
	public int getWeekendRateForRewarder() {
		return weekendRateForRewarder;
	}
	public void setWeekendRateForRewarder(int weekendRateForRewarder) {
		this.weekendRateForRewarder = weekendRateForRewarder;
	}
	
	@Override
	public String toString() {
		return "Hotel [hotelName=" + hotelName + ", weekdayRateForRegular=" + weekdayRateForRegular
				+ ", weekendRateForRegular=" + weekendRateForRegular + ", weekdayRateForRewarder="
				+ weekdayRateForRewarder + ", weekendRateForRewarder=" + weekendRateForRewarder + ", getHotelName()="
				+ getHotelName() + ", getWeekdayRateForRegular()=" + getWeekdayRateForRegular()
				+ ", getWeekendRateForRegular()=" + getWeekendRateForRegular() + ", getWeekdayRateForRewarder()="
				+ getWeekdayRateForRewarder() + ", getWeekendRateForRewarder()=" + getWeekendRateForRewarder()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	

}