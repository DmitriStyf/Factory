package design_pattern.facade;

public class FlightBooking implements BookingInterface {


    @Override
    public void book(BookingInfo bookingInfo) {
        System.out.println("Flight Booked");
    }
}
