package com.example.chibbank.service.transaction;

import com.example.chibbank.domain.model.Transaction;
import com.example.chibbank.service.CommandService;
import com.example.chibbank.service.QueryService;

public interface TransactionService
        extends QueryService<Transaction>, CommandService<Transaction> {


}
