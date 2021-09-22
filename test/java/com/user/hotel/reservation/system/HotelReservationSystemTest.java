package com.user.hotel.reservation.system;
import org.junit.Test;
import java.util.Date;
import static org.junit.Assert.assertEquals;
public class HotelReservationSystemTest {
    @Test
    public void CheckIfHotelIsAdded()
    {
        HotelReservationSystem hotelSystem=new HotelReservationSystem();
        hotelSystem.addHotel("Lakewood",110);
        hotelSystem.addHotel("Ridgewood",220);
        hotelSystem.addHotel("Bridgewood",160);
        int entry=hotelSystem.countHotels();
        String entryHotel=hotelSystem.cheapHotel(new Date(2000,12,18),new Date(2000,12,28));
        assertEquals(3,entry);
        assertEquals("Lakewood",entryHotel);
    }
}
