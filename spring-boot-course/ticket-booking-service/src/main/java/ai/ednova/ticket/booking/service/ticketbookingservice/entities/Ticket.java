package ai.ednova.ticket.booking.service.ticketbookingservice.entities;


import ai.ednova.ticket.booking.service.ticketbookingservice.enums.SeatStatus;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;


@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Ticket extends BaseEntity{
    private UUID eventId;
    private UUID userId;
    private Integer seatCount;
    private SeatStatus currentStatus;
}
