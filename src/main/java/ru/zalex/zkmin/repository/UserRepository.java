package ru.zalex.zkmin.repository;


import ru.zalex.zkmin.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Integer> {

    @Query("FROM User")
    List<User> findAll();

    @Query("FROM User WHERE login = :login")
    Optional<User> findByLogin(@Param("login") String login);
}
