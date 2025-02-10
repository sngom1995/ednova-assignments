package ai.ednova.ticket.booking.service.services.impl;

import ai.ednova.ticket.booking.service.dtos.responses.TicketResponse;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.UUID;

@Service
public class BookingServiceImpl implements ai.ednova.ticket.booking.service.services.BookingService {
    @Override
    public Set<TicketResponse> getBookings() {
        return Set.of();
    }

    @Override
    public TicketResponse bookASeat(UUID eventId) {
        return null;
    }

    @Override
    public TicketResponse cancelASeat(UUID eventId) {
        return null;
    }

    @Override
    public TicketResponse getReservation(UUID eventId) {
        return null;
    }

    @Override
    public Set<TicketResponse> getReservations() {
        return Set.of();
    }

    @Override
    public TicketResponse confirmReservation(UUID eventId) {
        return null;
    }
}
