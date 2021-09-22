package com.user.hotel.reservation.system;
/**
 * A hotel class consisting of name of the hotel,different rates and ratings
 * @author Shravya P
 */
public class Hotel {
    private String hotelName;
    private double rateRegular;
    public Hotel(String hotelName,double rateRegular)
    {
        this.setHotelName(hotelName);
        this.setRateRegular(rateRegular);
    }
    public String getHotelName() {
        return hotelName;
    }
    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }
    public double getRateRegular() {
        return rateRegular;
    }
    public void setRateRegular(double rateRegular) {
        this.rateRegular = rateRegular;
    }
    
}
