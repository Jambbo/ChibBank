package com.example.chibbank.events;

import com.example.chibbank.domain.aggregate.Aggregate;

public interface Event {

    void apply(Aggregate aggregate);

}
