package com.user.hotel.reservation.system;
/**
 * A hotel class consisting of name of the hotel,different rates and ratings
 * @author Shravya P
 */
public class Hotel {
    private String hotelName;
    private double weekdayRateRegular;
    private double weekendRateRegular;
    private double ratings;
    /*
     * constructor to initialize the hotel parameters 
     */
    public Hotel(String hotelName,double weekdayRateRegular,double weekendRateRegular,double ratings)
    {
        this.setHotelName(hotelName);
        this.setWeekdayRateRegular(weekdayRateRegular);
        this.setWeekendRateRegular(weekendRateRegular);
        this.setRatings(ratings);
    }
    /*
     * getter method to get name of the hotel
     */
    public String getHotelName() {
        return hotelName;
    }
    /*
     * setter method to initialize the name of the hotel
     */
    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }
    /*
     * getter method to get rate of regular weekday
     */
    public double getWeekdayRateRegular() {
        return weekdayRateRegular;
    }
    /*
     * setter method to set the rate of regular weekday
     */
    public void setWeekdayRateRegular(double weekdayRateRegular) {
        this.weekdayRateRegular = weekdayRateRegular;
    }
    /*
     * getter method to get rate of regular weekend
     */
    public double getWeekendRateRegular() {
        return weekendRateRegular;
    }
    /*
     * setter method to set the rate of regular weekend
     */
    public void setWeekendRateRegular(double weekendRateRegular) {
        this.weekendRateRegular = weekendRateRegular;
    }
    /*
     * getter method to get ratings of the hotel
     */
    public double getRatings() {
        return ratings;
    }
    /*
     * setter method to set the ratings of a hotel
     */
    public void setRatings(double ratings) {
        this.ratings = ratings;
    }
}
