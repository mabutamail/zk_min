package ru.zalex.zkmin.model;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.time.Instant;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Setter
@Getter
@NoArgsConstructor @AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
@Entity
public class Client extends AbstractPersistable<Long> {
    Instant creationDate = Instant.now();
    String email;
    String name;
    String phone;
    @OneToMany(mappedBy = "client")
    List<Comment> commentList;
    @OneToMany(mappedBy = "client")
    List<Car> carList;
}