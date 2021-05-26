package ru.zalex.zkmin.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.zalex.zkmin.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {
    @Query("FROM User WHERE login = :login")
    Optional<User> findByLogin(@Param("login") String login);
}