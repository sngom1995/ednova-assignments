package ai.ednova.ticket.booking.service.ticketbookingservice.dtos.responses;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class EventResponse {
    private UUID id;
    private String name;
    private String description;
    private String location;
    private LocalDateTime date;
    private Integer totalSeats;
    private Integer availableSeats;
}
