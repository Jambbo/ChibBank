package com.example.chibbank.service.auth;

import com.example.chibbank.domain.model.Client;
import com.example.chibbank.web.dto.LoginRequestDto;
import com.example.chibbank.web.dto.LoginResponseDto;

public interface AuthService {

    void register(Client client);

    LoginResponseDto login(LoginRequestDto dto);
}
