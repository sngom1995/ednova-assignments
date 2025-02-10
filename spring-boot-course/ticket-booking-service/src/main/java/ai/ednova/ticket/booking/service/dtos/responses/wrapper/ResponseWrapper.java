package ai.ednova.ticket.booking.service.dtos.responses.wrapper;

import ai.ednova.ticket.booking.service.enums.ResponseStatus;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class ResponseWrapper<T> {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private T data;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private PaginationResponse pagination;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<ErrorResponse> errors;

    private MetaResponse meta;

    private ResponseWrapper(
            T data,
            PaginationResponse pagination,
            List<ErrorResponse> errors,
            MetaResponse meta
    ) {
        this.data = data;
        this.pagination = pagination;
        this.errors = errors;
        this.meta = meta;
    }

    public static <T> ResponseWrapper<T> success(T data) {
        return success(data, null);
    }

    public static <T> ResponseWrapper<T> success(T data, PaginationResponse pagination) {
        MetaResponse metaResponse = MetaResponse.builder()
                .status(ResponseStatus.SUCCESS)
                .timestamp(LocalDateTime.now())
                .build();
        return new ResponseWrapper<>(data, pagination, null, metaResponse);
    }

    public static <T> ResponseWrapper<T> failure(List<ErrorResponse> errorResponses) {
        MetaResponse metaResponse = MetaResponse.builder()
                .status(ResponseStatus.FAILURE)
                .timestamp(LocalDateTime.now())
                .build();
        return new ResponseWrapper<>(null, null, errorResponses, metaResponse);
    }
}
