package com.example.chibbank.service.card;

import com.example.chibbank.domain.model.Card;
import com.example.chibbank.service.CommandService;
import com.example.chibbank.service.QueryService;

import java.util.UUID;

public interface CardService
        extends QueryService<Card>, CommandService<Card> {

    void createByClientId(UUID clientId);

    boolean existsByNumberAndDate(String number, String date);
}
