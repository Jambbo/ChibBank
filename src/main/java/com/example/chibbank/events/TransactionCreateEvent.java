package com.example.chibbank.events;

import com.example.chibbank.domain.aggregate.Aggregate;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class TransactionCreateEvent extends AbstractEvent {

    public TransactionCreateEvent(Object payload) {
        super(null, payload, EventType.TRANSACTION_CREATE);
    }

    @Override
    public void apply(Aggregate aggregate) {

    }
}
