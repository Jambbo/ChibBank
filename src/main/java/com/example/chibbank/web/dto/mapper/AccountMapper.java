package com.example.chibbank.web.dto.mapper;

import com.example.chibbank.domain.model.Account;
import com.example.chibbank.domain.model.Card;
import com.example.chibbank.web.dto.AccountDto;
import com.example.chibbank.web.dto.CardDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AccountMapper extends Mappable<Account, AccountDto> {
}
