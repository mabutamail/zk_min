import org.example.model.User;

import java.util.ArrayList;
import java.util.List;

public class Start {
    public static void main(String[] args) {
        User user1 = new User(1,"Zalex1");
        User user2 = new User(2,"Zalex2");
        User user3 = new User(3,"Zalex3");
        List<User> listUser = new ArrayList<>();
        listUser.add(user1);
        listUser.add(user2);
        listUser.add(user3);
        System.out.println(listUser);
    }
}