package com.example.chibbank.events;

import com.example.chibbank.domain.aggregate.Aggregate;
import com.example.chibbank.domain.model.Account;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class AccountCreateEvent extends AbstractEvent {

    public AccountCreateEvent(Account payload) {
        super(null, payload, EventType.ACCOUNT_CREATE);
    }

    @Override
    public void apply(Aggregate aggregate) {

    }
}
