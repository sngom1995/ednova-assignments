package ai.ednova.ticket.booking.service.repositories;


import ai.ednova.ticket.booking.service.entities.Event;

public interface EventRepository {
    Event save(Event event);

    Event findById(String eventId);

    void deleteById(String eventId);
}
