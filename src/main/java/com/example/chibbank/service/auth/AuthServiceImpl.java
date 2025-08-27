package com.example.chibbank.service.auth;

import com.example.chibbank.domain.exception.ResourceAlreadyExistsException;
import com.example.chibbank.domain.model.Client;
import com.example.chibbank.service.client.ClientService;
import com.example.chibbank.web.dto.LoginRequestDto;
import com.example.chibbank.web.dto.LoginResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService{

    private final ClientService clientService;

    @Override
    public void register(final Client client) {
        if(clientService.existsByUsername(client.getUsername())){
            throw new ResourceAlreadyExistsException();
        }
        //TODO hash password
        client.setPassword(client.getPassword());
        clientService.create(client);
    }

    @Override
    public LoginResponseDto login(final LoginRequestDto dto) {
        //TODO
        return null;
    }
}
