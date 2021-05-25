package ru.zalex.zkmin.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Data
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Car extends AbstractPersistable<Long> {
    String model;
    String make;
    String preview;
    String description;
    Integer price;
    @ManyToOne
    Client client;
}