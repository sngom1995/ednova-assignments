package ai.ednova.ticket.booking.service.dtos.responses;

import ai.ednova.ticket.booking.service.enums.SeatStatus;
import lombok.*;

@AllArgsConstructor(access = AccessLevel.PROTECTED)
@NoArgsConstructor
@Builder
@Getter
@Setter
public class TicketResponse {

    private String userId;

    private String eventId;

    private Integer seatCount;

    private SeatStatus currentStatus;
}
