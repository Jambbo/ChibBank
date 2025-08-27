package com.example.chibbank.service.card;

import com.example.chibbank.domain.model.Card;
import com.example.chibbank.service.CommandService;
import com.example.chibbank.service.QueryService;

public interface CardService
        extends QueryService<Card>, CommandService<Card> {


}
