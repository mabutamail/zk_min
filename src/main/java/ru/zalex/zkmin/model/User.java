package ru.zalex.zkmin.model;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import java.time.Instant;

@Data
//@NoArgsConstructor @RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class User extends AbstractPersistable<Long> {
    Instant registrationDay = Instant.now();
    @NotNull
    String name;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }
}