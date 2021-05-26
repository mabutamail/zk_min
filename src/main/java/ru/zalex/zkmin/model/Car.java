package ru.zalex.zkmin.model;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@EqualsAndHashCode(callSuper = true)
@Setter
@Getter
@NoArgsConstructor @AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
@Entity
public class Car extends AbstractPersistable<Long> {
    String model;
    String make;
    String preview;
    String description;
    Long price;
    @ManyToOne
    Client client;
}