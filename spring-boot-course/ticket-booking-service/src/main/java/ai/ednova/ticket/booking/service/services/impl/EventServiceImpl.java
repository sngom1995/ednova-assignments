package ai.ednova.ticket.booking.service.services.impl;

import ai.ednova.ticket.booking.service.dtos.requests.EventRequest;
import ai.ednova.ticket.booking.service.dtos.responses.EventResponse;
import ai.ednova.ticket.booking.service.entities.Event;
import ai.ednova.ticket.booking.service.repositories.EventRepository;
import ai.ednova.ticket.booking.service.services.EventService;
import ai.ednova.ticket.booking.service.transformers.EventTransformer;
import org.springframework.stereotype.Service;

@Service
public class EventServiceImpl implements EventService {

    private final EventTransformer eventTransformer;
    private final EventRepository eventRepository;
    public EventServiceImpl(EventTransformer eventTransformer, EventRepository eventRepository) {
        this.eventTransformer = eventTransformer;
        this.eventRepository = eventRepository;
    }

    @Override
    public EventResponse create(EventRequest eventRequest) {
        Event event = eventTransformer.convertRequestToModel(eventRequest);
        Event   savedEvent= eventRepository.save(event);
        return eventTransformer.convertModelToResponse(savedEvent);
    }

    @Override
    public EventResponse get(String eventId) {
        Event event = eventRepository.findById(eventId);
        return eventTransformer.convertModelToResponse(event);
    }

    @Override
    public EventResponse update(String eventId, EventRequest eventRequest) {
        Event event = eventRepository.findById(eventId);
        eventTransformer.updateModelFromRequest(eventRequest, event);
        Event savedEvent = eventRepository.save(event);
        return eventTransformer.convertModelToResponse(savedEvent);
    }

    @Override
    public void delete(String eventId) {
        eventRepository.deleteById(eventId);
    }
}
