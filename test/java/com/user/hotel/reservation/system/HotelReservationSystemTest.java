package com.user.hotel.reservation.system;
import org.junit.Test;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import static org.junit.Assert.assertEquals;
public class HotelReservationSystemTest {
    @Test
    public void CheckIfHotelIsAdded() throws ParseException
    {
        HotelReservationSystem hotelSystem=new HotelReservationSystem();
        hotelSystem.addHotel("Lakewood",110);
        hotelSystem.addHotel("Ridgewood",220);
        hotelSystem.addHotel("Bridgewood",160);
        int entry=hotelSystem.countHotels();
        SimpleDateFormat formatter = new SimpleDateFormat("ddMMMyyyy", Locale.ENGLISH);
        String entryHotel=hotelSystem.cheapHotel(formatter.parse("10Sep2020"),formatter.parse("19Sep2020"));
        assertEquals(3,entry);
        assertEquals("Lakewood",entryHotel);
    }
}
