package ru.zalex.zkmin.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.time.Instant;
import java.util.List;

@Data
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Client extends AbstractPersistable<Long> {
    Instant creationDate = Instant.now();
    String email;
    String name;
    String phone;
    @OneToMany(mappedBy = "client")
    List<String> comment;
    @OneToMany(mappedBy = "client")
    List<Car> carList;
}