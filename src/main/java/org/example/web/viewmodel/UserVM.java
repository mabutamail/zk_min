package org.example.web.viewmodel;

import org.example.model.User;
import org.example.repository.UserRepository;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;

import java.util.ArrayList;
import java.util.List;

public class UserVM {
    private int count;
    private User user;
    private final List<User> listUser = new ArrayList<>();

    private UserRepository userRepository;

    @Init
    public void init() {
        count = 100;
        User user1 = new User(1,"Zalex1");
        User user2 = new User(2,"Zalex2");
        User user3 = new User(3,"Zalex3");

        listUser.add(user1);
        listUser.add(user2);
        listUser.add(user3);
    }

    @Command
    @NotifyChange("inituser")
    public void initUser() {
        System.out.println("Запуск метода UserVM initUser");
        System.out.println(getListUser());
        System.out.println("Запуск метода UserVM initUser end");
    }

    @Command
    @NotifyChange("count")
    public void cmd() {
        ++count;
    }

    @Command
    @NotifyChange("method")
    public void method(){
        System.out.println("Запуск метода VM");
    }


    public int getCount() {
        return count;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<User> getListUser() {
        return listUser;
    }

    public UserRepository getUserRepository() {
        return userRepository;
    }

    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}