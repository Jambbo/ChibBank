package com.example.chibbank.service.transaction;

import com.example.chibbank.domain.model.Transaction;
import com.example.chibbank.service.card.CardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class TransactionServiceImpl implements TransactionService{

    private final TransactionCommandService commandService;
    private final TransactionQueryService queryService;
    private final CardService cardService;

    @Override
    public void create(Transaction transaction) {
        if(!cardService.existsByNumberAndDate(
                transaction.getTo().getNumber(),
                transaction.getTo().getDate()
        )){
            throw new IllegalStateException("Card doesn't exist.");
        }
        commandService.create(transaction);
    }

    @Override
    public Transaction getById(UUID id) {
        return queryService.getById(id);
    }
}
