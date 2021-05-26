package ru.zalex.zkmin.repository;

import org.springframework.data.repository.CrudRepository;
import ru.zalex.zkmin.model.Car;

public interface CarRepository extends CrudRepository<Car, Long> {
}