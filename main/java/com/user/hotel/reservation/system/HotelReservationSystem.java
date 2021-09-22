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
    /**
     * A method to get the hotel whose cost is cheap
     * @param checkIn date when you checkin the hotel
     * @param checkOut date when you want to checkout from hotel
     * @return hotel name
     */
    public String cheapHotel(Date checkIn,Date checkOut)
    {
        int days = (int)( (checkOut.getTime() - checkIn.getTime()) / (1000 * 60 * 60 * 24));
        if(days==0)
            days=1;
        double cost=hotelReservation.get(0).getRateRegular()*days;
        String hotelName=hotelReservation.get(0).getHotelName();
        for(int i=1;i<hotelReservation.size();i++)
        {
            if(cost>hotelReservation.get(i).getRateRegular()*days)
            {
                cost=hotelReservation.get(i).getRateRegular()*days;
                hotelName=hotelReservation.get(i).getHotelName();
            }                    
        }
        System.out.println("you can stay at hotel "+hotelName+" at a cost "+cost);
        return hotelName;
    }   
}
