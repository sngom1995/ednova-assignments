package ai.ednova.ticket.booking.service.ticketbookingservice.constants;

public class EndpointsRegistry {
    public static final String BASE_PATH = "/api/v1";
    public static final String EVENTS = BASE_PATH + "/events";
    public static final String BOOKINGS = BASE_PATH +  "/bookings";
    public static final String EVENT_ID = "/{eventId}";
    public static final String RESERVATION_ID = "/{reservationId}";
    public static final String RESERVATIONS = EVENTS + EVENT_ID + "/reservations";
    public static final String CONFIRM_RESERVATION = BOOKINGS + RESERVATION_ID + "/confirm";
    public static  final String BOOK_A_SEAT  = EVENTS + EVENT_ID + "/booK";

}
