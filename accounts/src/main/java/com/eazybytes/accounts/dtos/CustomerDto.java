package com.eazybytes.accounts.dtos;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(
        name = "Customer",
        description = "Schema to hold customer and account details"
)
public class CustomerDto {
    @Schema(
            description = "Name of the Customer",
            example = "John Doe"
    )
    @NotEmpty(message = "Customer name cannot be a null or empty")
    @Size(min = 5, max = 30,  message = "Customer name should be between 5 and 30 characters")
    private String name;

    @Schema(
            description = "Email address of the Customer",
            example = "john@gmail.com"
    )
    @NotEmpty(message = "Email cannot be null or empty")
    @Email(message = "Please provide a valid email address")
    private String email;
    @Schema(
            description = "Mobile number of the Customer",
            example = "9876543210"
    )
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be 10 digits")
    private String mobileNumber;
    @Schema(
            description = "Account details of the Customer"
    )
    private AccountDto accountDto;

}
