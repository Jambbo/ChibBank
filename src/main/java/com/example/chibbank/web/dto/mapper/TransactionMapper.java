package com.example.chibbank.web.dto.mapper;

import com.example.chibbank.domain.model.Transaction;
import com.example.chibbank.web.dto.TransactionDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TransactionMapper extends Mappable<Transaction, TransactionDto> {
}
