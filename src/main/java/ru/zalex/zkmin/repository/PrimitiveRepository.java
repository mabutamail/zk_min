package ru.zalex.zkmin.repository;

import org.springframework.data.repository.CrudRepository;
import ru.zalex.zkmin.model.Primitive;

public interface PrimitiveRepository extends CrudRepository<Primitive, Long> {
}