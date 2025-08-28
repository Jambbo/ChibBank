package com.example.chibbank.web.controller;

import com.example.chibbank.domain.model.Transaction;
import com.example.chibbank.service.transaction.TransactionService;
import com.example.chibbank.web.dto.OnCreate;
import com.example.chibbank.web.dto.TransactionDto;
import com.example.chibbank.web.dto.mapper.TransactionMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/transactions")
@RequiredArgsConstructor
public class TransactionController {

    private final TransactionService transactionService;
    private final TransactionMapper transactionMapper;

    @PostMapping
    public void create(
            @RequestBody @Validated(OnCreate.class) final TransactionDto transactionDto
    ) {
        Transaction transaction = transactionMapper.fromDto(transactionDto);
        transactionService.create(transaction);
    }

    @GetMapping("/{id}")
    public TransactionDto getById(@PathVariable final UUID id){
        Transaction transaction = transactionService.getById(id);
        return transactionMapper.toDto(transaction);
    }

}
