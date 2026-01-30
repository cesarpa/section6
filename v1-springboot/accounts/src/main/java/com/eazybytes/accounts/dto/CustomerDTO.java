package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(
    name = "CustomerDTO",
    description = "Customer Data Transfer Object"
)
public class CustomerDTO {


    @NotEmpty(message = "Name cannot be empty or null")
    @Size(min = 5, max= 30, message = "the length should be between 5 and 30 characters")
    private String name;

    @NotEmpty(message = "Email cannot be empty or null")
    @Email(message = "Email address should be valid")
    private String email;

    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be 10 digits")
    private String mobileNumber;

    private AccountsDTO accountDTO;
}
