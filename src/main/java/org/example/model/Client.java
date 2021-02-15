package org.example.model;

import org.springframework.data.jpa.domain.AbstractPersistable;

//import javax.persistence.Entity;
//import javax.persistence.OneToMany;
import java.time.Instant;
import java.util.List;

/**
 * Модель потенциального клиента
 */

public class Client extends AbstractPersistable<Long> {

    /**
     * Адрес электронной почты
     */
    private String email;

    /**
     * Имя
     */
    private String name;

    /**
     * Телефон
     */
    private String phone;

    /**
     * Комментарий
     */

    private List<String> comment;

    /**
     * Дата создания
     */
    private Instant creationDate = Instant.now();

    public Client() {
    }

    public Client(String email, String name, String phone) {
        this.email = email;
        this.name = name;
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<String> getComment() {
        return comment;
    }

    public void setComment(List<String> comment) {
        this.comment = comment;
    }

    public Instant getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Instant creationDate) {
        this.creationDate = creationDate;
    }
}
