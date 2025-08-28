package com.example.chibbank.web.controller;

import com.example.chibbank.domain.model.Client;
import com.example.chibbank.service.client.ClientService;
import com.example.chibbank.web.dto.AccountDto;
import com.example.chibbank.web.dto.CardDto;
import com.example.chibbank.web.dto.ClientDto;
import com.example.chibbank.web.dto.mapper.AccountMapper;
import com.example.chibbank.web.dto.mapper.CardMapper;
import com.example.chibbank.web.dto.mapper.ClientMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/clients")
@RequiredArgsConstructor
public class ClientController {

    private final ClientService clientService;
    private final ClientMapper clientMapper;
    private final CardMapper cardMapper;
    private final AccountMapper accountMapper;


    @GetMapping("/{id}")
    public ClientDto getById(@PathVariable final UUID id) {
        return clientMapper.toDto(clientService.getById(id));
    }

    @GetMapping("/{id}/cards")
    public List<CardDto> getCardsByClientId(@PathVariable("id") final UUID clientId) {
        Client client = clientService.getById(clientId);
        return cardMapper.toDto(client.getCards());
    }

    @GetMapping("/{id}/account")
    public AccountDto getAccountByClientId(@PathVariable("id") final UUID clientId){
        Client client = clientService.getById(clientId);
        return accountMapper.toDto(client.getAccount());
    }

}
