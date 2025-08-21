package com.example.chibbank.respository;

import com.example.chibbank.events.AbstractEvent;
import com.example.chibbank.events.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<AbstractEvent, Long> {
}
