package design_pattern.facade;

public class HotelBooking implements BookingInterface {
    @Override
    public void book(BookingInfo bookingInfo) {
        System.out.println("Hotel booked");
    }
}
