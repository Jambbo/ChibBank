package com.example.chibbank.web.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class CardDto extends BaseDto{

    @NotNull(
            message = "Card number must be not null.",
            groups = OnCreate.class
    )
    @Null(
            message = "Card number must be null."
    )
    private String number;

    @NotNull(
            message = "Card date must be not null.",
            groups = OnCreate.class
    )
    @Null(
            message = "Card date must be null."
    )
    private String date;

    @NotNull(
            message = "Card cvv must be not null.",
            groups = OnCreate.class
    )
    @Null(
            message = "Card cvv must be null."
    )
    private String cvv;

}
