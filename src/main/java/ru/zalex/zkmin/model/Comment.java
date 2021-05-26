package ru.zalex.zkmin.model;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.time.Instant;

@EqualsAndHashCode(callSuper = true)
@Setter
@Getter
@NoArgsConstructor @AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
@Entity
public class Comment extends AbstractPersistable<Long> {
    Instant commentDate = Instant.now();
    String comment;
    @ManyToOne
    Client client;
}