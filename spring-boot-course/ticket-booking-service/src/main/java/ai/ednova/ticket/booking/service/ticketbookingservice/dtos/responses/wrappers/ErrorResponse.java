package ai.ednova.ticket.booking.service.ticketbookingservice.dtos.responses.wrappers;

import ai.ednova.ticket.booking.service.ticketbookingservice.enums.ErrorCode;
import lombok.*;

import java.io.Serializable;



@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class ErrorResponse implements Serializable {
    private String errorCode;
    private String errorMessage;
    private String detail;
    private String help;

    public static ErrorResponse from(ErrorCode errorCode) {
        return from(errorCode, null, null);
    }

    public static ErrorResponse from(ErrorCode errorCode, String detail) {
        return from(errorCode, detail, null);
    }

    public static ErrorResponse from(ErrorCode errorCode, String detail, String help) {
        return from(errorCode.getCode(), errorCode.getMessage(), detail, help);
    }

    public static ErrorResponse from(String errorCode, String message, String detail, String help) {
        return new ErrorResponse(errorCode, message, detail, help);
    }
}
