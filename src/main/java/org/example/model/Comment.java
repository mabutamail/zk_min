package org.example.model;

import org.springframework.data.jpa.domain.AbstractPersistable;

//import javax.persistence.Entity;
//import javax.persistence.ManyToOne;
import java.time.Instant;


/**
 * Модель нашего комментария по клиенту
 */

public class Comment extends AbstractPersistable<Long> {



    private Client client;

    /**
     * Наш комментарий
     */
    private String comment;
    private Instant commentDate = Instant.now();


    public Comment() {
    }

    public Comment(Client client, String comment) {
        this.client = client;
        this.comment = comment;
    }


    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Instant getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Instant commentDate) {
        this.commentDate = commentDate;
    }
}