package ai.ednova.ticket.booking.service.ticketbookingservice.controllers;


import ai.ednova.ticket.booking.service.ticketbookingservice.constants.EndpointsRegistry;
import ai.ednova.ticket.booking.service.ticketbookingservice.dtos.responses.wrappers.ResponseWrapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(EndpointsRegistry.BOOKINGS)
public class BookingController {

    @GetMapping
    public ResponseEntity<ResponseWrapper<?>> getReservations() {
        return ResponseEntity.ok().build();
    }

    @GetMapping(EndpointsRegistry.RESERVATION_ID)
    public ResponseEntity<ResponseWrapper<?>> getReservationsById(@PathVariable String reservationId) {
        return ResponseEntity.ok().build();
    }

    @PostMapping(EndpointsRegistry.CONFIRM_RESERVATION)
    public ResponseEntity<ResponseWrapper<?>> confirmReservation(@PathVariable String reservationId) {
        return ResponseEntity.ok().build();
    }
}
