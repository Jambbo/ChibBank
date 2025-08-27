package com.example.chibbank.web.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class TransactionDto extends BaseDto{

    @NotNull(
            message = "Sender card must be not null.",
            groups = OnCreate.class
    )
    @Null(
            message = "Sender card number must be null."
    )
    @Valid
    private CardDto from;

    @NotNull(
            message = "Receiver card must be not null.",
            groups = OnCreate.class
    )
    @Null(
            message = "Receiver card number must be null."
    )
    @Valid
    private CardDto to;

    @NotNull(
            message = "Amount must be not null."
    )
    @Positive(
            message = "Amount must be positive."
    )
    private BigDecimal amount;

}
