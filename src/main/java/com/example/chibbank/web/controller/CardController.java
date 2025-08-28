package com.example.chibbank.web.controller;

import com.example.chibbank.domain.model.Card;
import com.example.chibbank.domain.model.Transaction;
import com.example.chibbank.service.card.CardService;
import com.example.chibbank.web.dto.CardDto;
import com.example.chibbank.web.dto.TransactionDto;
import com.example.chibbank.web.dto.mapper.CardMapper;
import com.example.chibbank.web.dto.mapper.TransactionMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/cards")
@RequiredArgsConstructor
public class CardController {

    private final CardService cardService;
    private final CardMapper cardMapper;
    private final TransactionMapper transactionMapper;

    @PostMapping
    public void create(){
        //TODO implement id
        UUID id = UUID.randomUUID();
        cardService.createByClientId(id);
    }

    @GetMapping("/{id}")
    public CardDto getById(@PathVariable final UUID id){
        Card card = cardService.getById(id);
        return cardMapper.toDto(card);
    }

    @GetMapping("/{id}/transactions")
    public List<TransactionDto> getTransactionsByCardId(@PathVariable final UUID id){
        Card card = cardService.getById(id);
        return transactionMapper.toDto(card.getTransactions());
    }


}
