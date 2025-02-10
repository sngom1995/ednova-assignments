package ai.ednova.ticket.booking.service.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import ai.ednova.ticket.booking.service.enums.DocumentStatus;
import org.springframework.data.annotation.*;

public class BaseEntity {
    private String _id;

    private UUID id;

    @Version
    private Integer version;

    private DocumentStatus status;

    @CreatedDate
    private LocalDateTime createdAt;

    @LastModifiedDate
    private LocalDateTime updatedAt;

    @CreatedBy
    private UUID createdBy;

    @LastModifiedBy
    private UUID updatedBy;
}
