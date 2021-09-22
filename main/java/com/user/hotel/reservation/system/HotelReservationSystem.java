package com.user.hotel.reservation.system;
import java.util.*;
/**
 * class to store the hotels in a list
 * @author Shravya P
 */
public class HotelReservationSystem {
    private List<Hotel> hotelReservation=new ArrayList<>();
    /**
     * method to add hotel to the system
     * @param hotelName name of the hotel
     * @param weekdayRateRegular price on a week day for a regular customer
     * @return nothing
     */
    public HotelReservationSystem() {
        System.out.println("Welcome to hotel reservation program!!!!");
    }
    public void addHotel(String hotelName,double rateRegular)
    {
        hotelReservation.add(new Hotel(hotelName,rateRegular));
    }
    /**
     * to get the number of hotels in the reservation system
     * @return number of hotels
     */
    public int countHotels() {
        return hotelReservation.size();
    }
   
}
