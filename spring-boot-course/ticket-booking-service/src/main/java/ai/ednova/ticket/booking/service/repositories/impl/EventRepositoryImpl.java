package ai.ednova.ticket.booking.service.repositories.impl;

import ai.ednova.ticket.booking.service.entities.Event;
import ai.ednova.ticket.booking.service.repositories.EventRepository;
import org.springframework.stereotype.Repository;

@Repository
public class EventRepositoryImpl implements EventRepository  {
    @Override
    public Event save(Event event) {
        return null;
    }

    @Override
    public Event findById(String eventId) {
        return null;
    }

    @Override
    public void deleteById(String eventId) {
    }
}
