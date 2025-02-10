package ai.ednova.ticket.booking.service.controllers;

import ai.ednova.ticket.booking.service.dtos.responses.wrapper.ResponseWrapper;
import ai.ednova.ticket.booking.service.dtos.requests.EventRequest;
import ai.ednova.ticket.booking.service.dtos.responses.EventResponse;
import ai.ednova.ticket.booking.service.services.EventService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/events")
public class EventController {
    private final EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @PostMapping
    public ResponseEntity<ResponseWrapper<EventResponse>> create(@Valid @RequestBody EventRequest eventRequest) {
        EventResponse eventResponse = eventService.create(eventRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(ResponseWrapper.success(eventResponse));
    }


    @GetMapping("/{eventId}")
    public ResponseEntity<ResponseWrapper<EventResponse>> get(@PathVariable String eventId) {
        EventResponse eventResponse = eventService.get(eventId);
        return ResponseEntity.status(HttpStatus.OK).body(ResponseWrapper.success(eventResponse));
    }

    @PutMapping("/{eventId}")
    public ResponseEntity<ResponseWrapper<EventResponse>> update(
            @PathVariable String eventId,
            @Valid @RequestBody EventRequest eventRequest
    ) {
        EventResponse eventResponse = eventService.update(eventId, eventRequest);
        return ResponseEntity.status(HttpStatus.OK).body(ResponseWrapper.success(eventResponse));
    }

    @DeleteMapping("/{eventId}")
    public ResponseEntity<ResponseWrapper<Void>> delete(@PathVariable String eventId) {
        eventService.delete(eventId);
        return ResponseEntity.status(HttpStatus.OK).body(ResponseWrapper.success(null));
    }

}
