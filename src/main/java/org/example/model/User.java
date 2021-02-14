package org.example.model;

import java.time.Instant;

public class User {
    private int idUser;
    private String name;
    private final Instant registrationDay = Instant.now();

    public User(int idUser, String name) {
        this.idUser = idUser;
        this.name = name;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Instant getRegistrationDay() {
        return registrationDay;
    }

    @Override
    public String toString() {
        return "User{" +
                "idUser=" + idUser +
                ", name='" + name + '\'' +
                ", registrationDay=" + registrationDay +
                '}';
    }
}
