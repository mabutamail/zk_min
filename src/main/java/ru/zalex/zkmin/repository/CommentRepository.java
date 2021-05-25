package ru.zalex.zkmin.repository;

import ru.zalex.zkmin.model.Comment;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.repository.CrudRepository;
//import ru.simplex_software.mailform2.model.Comment;

import java.util.List;

public interface CommentRepository extends CrudRepository<Comment, Long> {

    @Query("FROM Comment ORDER BY id DESC")
    List<Comment> findAllComment();
}