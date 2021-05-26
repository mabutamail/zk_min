package ru.zalex.zkmin.model;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.time.Instant;

@EqualsAndHashCode(callSuper = true)
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
/*
 * Ключевое слово USER в SQL, либо ставить аннотацию либо называть класс по другому
 */
@Table(name = "programUser")
public class User extends AbstractPersistable<Long> {
    Instant registrationDay = Instant.now();
    @NotNull
    String name;

    public User(String name) {
        this.registrationDay = Instant.now();
        this.name = name;
    }

}