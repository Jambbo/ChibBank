package com.example.chibbank.web.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class AccountDto extends BaseDto {

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private String number;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @PositiveOrZero(
            message = "Balance must be positive or zero."
    )
    private BigDecimal balance;


}
