package com.example.chibbank.service.client;

import com.example.chibbank.domain.model.Client;
import com.example.chibbank.service.CommandService;
import com.example.chibbank.service.QueryService;

public interface ClientService
        extends QueryService<Client>, CommandService<Client> {

    boolean existsByUsername(String username);
}
