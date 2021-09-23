package com.user.hotel.reservation.system;
import org.junit.Test;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import static org.junit.Assert.assertEquals;
public class HotelReservationSystemTest {
    HotelReservationSystem hotelSystem=new HotelReservationSystem();
    @Test
    public void CheckIfHotelIsAdded() throws ParseException
    {
        hotelSystem.addHotel("Lakewood",110,90,3,80,80);
        hotelSystem.addHotel("Ridgewood",220,150,5,100,40);
        hotelSystem.addHotel("Bridgewood",150,50,4,110,50);
        int entry=hotelSystem.countHotels();
        assertEquals(3,entry);    
        SimpleDateFormat formatter = new SimpleDateFormat("ddMMMyyyy", Locale.ENGLISH);
        String entryHotel=hotelSystem.cheapestBestHotel(formatter.parse("11Sep2020"),formatter.parse("12Sep2020"));
        assertEquals("Bridgewood",entryHotel);
        String bestHotel=hotelSystem.getBestRatedHotel(formatter.parse("11Sep2020"),formatter.parse("12Sep2020"));
        assertEquals("Ridgewood",bestHotel);
    }
    
}
