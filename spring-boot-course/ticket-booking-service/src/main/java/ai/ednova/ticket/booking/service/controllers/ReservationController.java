package ai.ednova.ticket.booking.service.controllers;

import ai.ednova.ticket.booking.service.dtos.requests.ReservationRequest;
import ai.ednova.ticket.booking.service.dtos.responses.ReservationResponse;
import ai.ednova.ticket.booking.service.dtos.responses.wrapper.ResponseWrapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reservations")
public class ReservationController {

    @PostMapping
    public ResponseEntity<ResponseWrapper<ReservationResponse>> create(
            @RequestBody ReservationRequest reservationRequest
    ) {
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{reservationId}")
    public ResponseEntity<ResponseWrapper<ReservationResponse>> get(@PathVariable String reservationId) {
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{reservationId}")
    public ResponseEntity<ResponseWrapper<ReservationResponse>> update(
            @PathVariable String reservationId,
            @RequestBody ReservationRequest reservationRequest
    ) {
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{reservationId}")
    public ResponseEntity<ResponseWrapper<Void>> delete(@PathVariable String reservationId) {
        return ResponseEntity.ok().build();
    }
}
