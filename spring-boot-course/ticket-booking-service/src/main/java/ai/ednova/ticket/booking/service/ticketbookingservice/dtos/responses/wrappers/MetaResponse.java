package ai.ednova.ticket.booking.service.ticketbookingservice.dtos.responses.wrappers;

import ai.ednova.ticket.booking.service.ticketbookingservice.constants.Constants;
import ai.ednova.ticket.booking.service.ticketbookingservice.enums.ResponseStatus;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;


import java.time.LocalDateTime;


@AllArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter
@Builder
public class MetaResponse {
    private ResponseStatus status;

    @JsonFormat(pattern = Constants.RESPONSE_DATE_TIME_FORMAT, shape = JsonFormat.Shape.STRING)
    private LocalDateTime timestamp;
}
