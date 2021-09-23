package com.user.hotel.reservation.system;
import java.util.*;
/**
 * class to store the hotels in a list
 * @author Shravya P
 */
public class HotelReservationSystem {
    private List<Hotel> hotelReservation=new ArrayList<>();
    public HotelReservationSystem() {
        System.out.println("Welcome to hotel reservation program!!!!");
    }
    /**
     * method to add hotel to the system
     * usecase1
     * @param hotelName name of the hotel
     * @param weekdayRateRegular price on a week day for a regular customer
     * @return nothing
     */
    public void addHotel(String hotelName,double weekdayRateRegular,double weekendRateRegular,double ratings)
    {
        hotelReservation.add(new Hotel(hotelName,weekdayRateRegular,weekendRateRegular,ratings));
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
     * @param checkIn date when you check in the hotel
     * @param checkOut date when you want to checkout from hotel
     * @return hotel name
     * @throws ParseException 
     */
    public String cheapHotel(Date checkIn,Date checkOut)
    {
        List<Integer> days=new ArrayList<>();
        Date i=checkIn;
        while(i.compareTo(checkOut)!=1)
        {
            Calendar cal=Calendar.getInstance();
            cal.setTime(i);
            days.add(cal.get(Calendar.DAY_OF_WEEK));
            cal.add( Calendar.DATE, 1 );
            i=cal.getTime();
        }
        double cost;
        double temp;
        Hotel cheapHotel=hotelReservation.get(0);
        cost=getCost(days,cheapHotel);
        for(Hotel hotel:hotelReservation)
        {
            temp=getCost(days,hotel);
            if(cost>temp)
            {
                cost=temp;
                cheapHotel=hotel;
            }
        } 
        System.out.println("The cheapest hotel is "+cheapHotel.getHotelName()+" for a cost $"+cost);
        return cheapHotel.getHotelName();   
    } 
    /**
     * this method to calculate cost of stay for each hotel
     * @param checkin day when you check in
     * @param checkout day when you check out
     * @param hotel hotel for which you want to calculate
     * @return cost at that particular hotel
     */
    public double getCost(List<Integer>days,Hotel hotel)
    {
        double temp=0;
        for(int j:days)
        {
            if(j>1&&j<7)
            { 
                temp+=hotel.getWeekdayRateRegular();
            }
            else
                temp+=hotel.getWeekendRateRegular();  
        }
        return temp;
    }
}
