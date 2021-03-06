package ru.zalex.zkmin.repository;

import ru.zalex.zkmin.model.Client;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ClientRepository extends CrudRepository<Client, Long> {

    @Query("FROM Client ORDER BY id DESC")
    List<Client> findAllClient();
}