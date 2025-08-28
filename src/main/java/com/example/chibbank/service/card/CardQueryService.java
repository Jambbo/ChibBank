package com.example.chibbank.service.card;

import com.example.chibbank.domain.model.Card;
import com.example.chibbank.service.QueryService;

public interface CardQueryService extends QueryService<Card> {

    boolean existsByNumberAndDate(String number, String date);


}
