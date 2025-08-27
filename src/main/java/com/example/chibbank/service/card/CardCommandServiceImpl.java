package com.example.chibbank.service.card;

import com.example.chibbank.domain.model.Card;
import com.example.chibbank.events.CardCreateEvent;
import com.example.chibbank.service.event.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CardCommandServiceImpl implements CardCommandService{

    private final EventService eventService;

    @Override
    public void create(Card object) {
        CardCreateEvent event = new CardCreateEvent(object);
        eventService.create(event);
    }
}
