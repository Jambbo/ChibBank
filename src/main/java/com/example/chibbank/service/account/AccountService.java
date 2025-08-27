package com.example.chibbank.service.account;

import com.example.chibbank.domain.model.Account;
import com.example.chibbank.service.CommandService;
import com.example.chibbank.service.QueryService;

public interface AccountService
        extends QueryService<Account>, CommandService<Account> {



}
