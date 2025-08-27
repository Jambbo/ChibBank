package com.example.chibbank.web.dto.mapper;

import com.example.chibbank.domain.model.Client;
import com.example.chibbank.web.dto.ClientDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClientMapper extends Mappable<Client, ClientDto> {
}
