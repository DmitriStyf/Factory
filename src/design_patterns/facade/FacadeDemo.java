package design_patterns.facade;

public class FacadeDemo {
    public static void main(String[] args) {

        TravelFacade travelFacade = new TravelFacade();

        BookingInfo bookingInfo = new BookingInfo();
        bookingInfo.setDestination("Tallinn");
        bookingInfo.setSource("Tartu");
        PersonalInfo personalInfo = new PersonalInfo();
        personalInfo.setName("Alex");
        personalInfo.setAge(35);

        travelFacade.book(TravelFacade.BookingType.Hotel,bookingInfo);
        travelFacade.book(TravelFacade.BookingType.Train_And_Hotel,bookingInfo);
    }
}
