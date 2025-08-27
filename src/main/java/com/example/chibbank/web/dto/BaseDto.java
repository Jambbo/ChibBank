package com.example.chibbank.web.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public abstract class BaseDto {

    @NotNull(
            message = "Id must be not null.",
            groups = OnUpdate.class //checked only when updating account, notnull is ignored on create
    )
    @Null(
            message = "Id must be null.",
            groups = OnCreate.class //lets hibernate to generate id for account record
    )
    private UUID id;

}
