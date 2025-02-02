package ai.ednova.ticket.booking.service.ticketbookingservice.dtos.requests;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EventRequest {
    private String name;
    private String description;
    private String location;
    private Integer totalSeats;
}
