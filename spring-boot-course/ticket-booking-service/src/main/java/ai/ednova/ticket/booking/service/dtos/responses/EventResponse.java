package ai.ednova.ticket.booking.service.dtos.responses;

import ai.ednova.ticket.booking.service.constants.Constants;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
public class EventResponse {
    private String id;

    private String name;

    private String description;

    private String location;

    @JsonFormat(pattern = Constants.RESPONSE_DATE_FORMAT, shape = JsonFormat.Shape.STRING)
    private LocalDate date;

    private Integer totalSeats;

    private Integer availableSeats;
}
