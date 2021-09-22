package com.user.hotel.reservation.system;
import org.junit.Test;

import com.user.hotel.reservation.system.HotelReservationSystem;

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
        assertEquals(3,entry);

    }
}
