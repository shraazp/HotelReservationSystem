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
        hotelSystem.addHotel("Lakewood",110,90);
        hotelSystem.addHotel("Ridgewood",220,150);
        hotelSystem.addHotel("Bridgewood",150,50);
        int entry=hotelSystem.countHotels();
        assertEquals(3,entry);    
        SimpleDateFormat formatter = new SimpleDateFormat("ddMMMyyyy", Locale.ENGLISH);
        String entryHotel=hotelSystem.cheapHotel(formatter.parse("11Sep2020"),formatter.parse("17Sep2020"));
        assertEquals("Lakewood",entryHotel);
    }
    
}
