package com.example.chibbank.service.transaction;

import com.example.chibbank.domain.model.Transaction;
import com.example.chibbank.events.TransactionCreateEvent;
import com.example.chibbank.service.event.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TransactionCommandServiceImpl implements TransactionCommandService{

    private final EventService eventService;

    @Override
    public void create(Transaction object) {
        TransactionCreateEvent event = new TransactionCreateEvent(object);
        eventService.create(event);
    }
}
