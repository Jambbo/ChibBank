package com.example.chibbank.events;

import com.example.chibbank.domain.aggregate.Aggregate;
import com.example.chibbank.domain.model.Card;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class CardCreateEvent extends AbstractEvent {

    public CardCreateEvent(Card payload) {
        super(null, payload, EventType.CARD_CREATE);
    }

    @Override
    public void apply(Aggregate aggregate) {

    }
}
