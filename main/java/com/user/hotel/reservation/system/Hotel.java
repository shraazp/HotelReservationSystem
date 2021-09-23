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
    private double weekendRateReward;
    private double weekdayRateReward;
    /*
     * constructor to initialize the hotel parameters 
     */
    public Hotel(String hotelName,double weekdayRateRegular,double weekendRateRegular,double ratings,double weekdayRateReward,double weekendRateReward)
    {
        this.setHotelName(hotelName);
        this.setWeekdayRateRegular(weekdayRateRegular);
        this.setWeekendRateRegular(weekendRateRegular);
        this.setRatings(ratings);
        this.setWeekdayRateReward(weekdayRateReward);
        this.setWeekendRateReward(weekendRateReward);
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
    /*
     * getter method  to get weekend reward for customer
     */
    public double getWeekendRateReward() {
        return weekendRateReward;
    }
    /*
     * setter method  to set weekend reward for customer
     */
    public void setWeekendRateReward(double weekendRateReward) {
        this.weekendRateReward = weekendRateReward;
    }
    /*
     * getter method  to get weekday reward for customer
     */
    public double getWeekdayRateReward() {
        return weekdayRateReward;
    }
    /*
     * setter method  to set weekday reward for customer
     */
    public void setWeekdayRateReward(double weekdayRateReward) {
        this.weekdayRateReward = weekdayRateReward;
    }
}
