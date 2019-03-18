package design_pattern.facade;

public class TrainBooking implements BookingInterface {
    @Override
    public void book(BookingInfo bookingInfo) {
        System.out.println("Train booked");
    }
}
