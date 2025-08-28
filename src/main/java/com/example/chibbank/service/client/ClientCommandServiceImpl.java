package com.example.chibbank.service.client;

import com.example.chibbank.domain.model.Client;
import com.example.chibbank.events.ClientCreateEvent;
import com.example.chibbank.service.event.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClientCommandServiceImpl implements ClientCommandService{

    private final EventService eventService;

    @Override
    public void create(Client object) {
        ClientCreateEvent event = new ClientCreateEvent(object);
        eventService.create(event);
    }

}
