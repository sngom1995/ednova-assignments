package ai.ednova.ticket.booking.service.ticketbookingservice.controllers;


import ai.ednova.ticket.booking.service.ticketbookingservice.constants.EndpointsRegistry;
import ai.ednova.ticket.booking.service.ticketbookingservice.dtos.requests.EventRequest;
import ai.ednova.ticket.booking.service.ticketbookingservice.dtos.responses.EventResponse;
import ai.ednova.ticket.booking.service.ticketbookingservice.dtos.responses.wrappers.ResponseWrapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(EndpointsRegistry.EVENTS)
public class EventController {

    @PostMapping
    public ResponseEntity<ResponseWrapper<EventResponse>> createEvent(@RequestBody EventRequest eventRequest) {
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<ResponseWrapper<EventResponse>> getEvents() {
        return ResponseEntity.ok().build();
    }

    @GetMapping(EndpointsRegistry.EVENT_ID)
    public ResponseEntity<ResponseWrapper<EventResponse>> getEventById(@PathVariable String eventId) {
        return ResponseEntity.ok().build();
    }

    @PostMapping(EndpointsRegistry.BOOK_A_SEAT)
    public ResponseEntity<ResponseWrapper<?>> bookASeat(@PathVariable String eventId) {
        return ResponseEntity.ok().build();
    }

    @GetMapping(EndpointsRegistry.RESERVATIONS)
    public ResponseEntity<ResponseWrapper<?>> getReservations(@PathVariable String eventId) {
        return ResponseEntity.ok().build();
    }

}
