package com.example.chibbank.service.client;

import com.example.chibbank.domain.exception.ResourceNotFoundException;
import com.example.chibbank.domain.model.Client;
import com.example.chibbank.respository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ClientQueryServiceImpl implements ClientQueryService{

    private final ClientRepository clientRepository;

    @Override
    public Client getById(final UUID id) {
        return clientRepository.findById(id)
                .orElseThrow(ResourceNotFoundException::new);
    }

    @Override
    public boolean existsByUsername(final String username) {
        return clientRepository.existsByUsername(username);
    }
}
