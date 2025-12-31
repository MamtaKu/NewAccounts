package com.eazybytes.accounts.dtos;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(
        name = "Account",
        description = "Schema to hold Account details"
)
public class AccountDto {

    @NotEmpty(message = "Account number cannot be empty")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Account number must be 10 digits")
    @Schema(
            description = "Account Number"
    )
    private Long accountNumber;
    @NotEmpty(message = "Account type cannot be empty")
    @Schema(
            description = "Account Type",
            example = "Savings"
    )
    private String accountType;
    @NotEmpty(message = "Branch address cannot be empty")
    @Schema(
            description = "Branch Address"
    )
    private String branchAddress;
}
