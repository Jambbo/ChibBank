package com.example.chibbank.events;

import com.example.chibbank.domain.model.ObjectConverter;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.time.LocalDateTime;
import java.util.UUID;

@Table(name = "events")
@Entity
@Getter
@Setter
@NoArgsConstructor
public abstract class AbstractEvent implements Event{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JdbcTypeCode(SqlTypes.VARCHAR)
    private UUID aggregateId;

    @Enumerated(EnumType.STRING)
    private EventType type;

    @CreationTimestamp
    private LocalDateTime timestamp;

    @JdbcTypeCode(SqlTypes.JSON)
    @Convert(converter = ObjectConverter.class)//telling postgres how to persist it in db
    private Object payload;

    public AbstractEvent(UUID aggregateId, Object payload, EventType type) {
        this.aggregateId = aggregateId;
        this.payload = payload;
        this.type = type;
    }
}
