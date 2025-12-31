package com.eazybytes.accounts.dtos;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data @AllArgsConstructor
@NoArgsConstructor
@Schema(
        name="ErrorResponse",
        description = "Schema to hold error response details"
)
public class ErrorResponseDto {
    @Schema(
            description = "API path invoked by client"
    )
    private String apiPath;
    @Schema(
            description = "HTTP error code"
    )
    private HttpStatus errorCode;
    @Schema(
            description = "Error message describing the cause of error"
    )
    private String errorMessage;
    @Schema(
            description = "Timestamp at which error occurred"
    )
    private LocalDateTime errorTime;

}
