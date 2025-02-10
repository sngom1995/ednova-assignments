package ai.ednova.ticket.booking.service.services;

import ai.ednova.ticket.booking.service.dtos.responses.TicketResponse;

import java.util.Set;
import java.util.UUID;

public interface BookingService {
    Set<TicketResponse> getBookings();

    TicketResponse bookASeat(UUID eventId);

    TicketResponse cancelASeat(UUID eventId);

    TicketResponse getReservation(UUID eventId);

    Set<TicketResponse> getReservations();

    TicketResponse confirmReservation(UUID eventId);
}
