package com.example.chibbank.service.card;

import com.example.chibbank.domain.exception.ResourceNotFoundException;
import com.example.chibbank.domain.model.Card;
import com.example.chibbank.respository.CardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CardQueryServiceImpl implements CardQueryService{

    private final CardRepository cardRepository;

    @Override
    public Card getById(UUID id) {
        return cardRepository.findById(id)
                .orElseThrow(ResourceNotFoundException::new);
    }

    @Override
    public boolean existsByNumberAndDate(String number, String date) {
        return cardRepository.existsByNumberAndDate(number, date);
    }
}
