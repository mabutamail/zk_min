package ru.zalex.zkmin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import ru.zalex.zkmin.model.*;
import ru.zalex.zkmin.repository.*;

import javax.annotation.Resource;
import java.time.Instant;

public class DataLoader implements InitializingBean {
    private static final Logger LOG = LoggerFactory.getLogger(DataLoader.class);

    @Resource
    UserRepository userRepository;
    @Resource
    ClientRepository clientRepository;
    @Resource
    CarRepository carRepository;
    @Resource
    CommentRepository commentRepository;
    @Resource
    PrimitiveRepository primitiveRepository;

    @Override
    public void afterPropertiesSet() throws Exception {
        Primitive primitive1 = Primitive.builder()
                .aChar('c')
                .aBoolean(true)
                .aByte((byte) 127)
                .aShort((short) 32767)
                .anInt(1234567890)
                .aLong(123_456_789_12L)
                .aFloat(123.456f)
                .aDouble(123456.789)
                .build();
        primitiveRepository.save(primitive1);

        Client client1 = Client.builder()
                .creationDate(Instant.now())
                .email("email@email.ru")
                .name("Name")
                .phone("(890)123-45-67")
                .build();
        clientRepository.save(client1);

        Car car1 = Car.builder()
                .model("model")
                .make("maker")
                .preview("preview")
                .description("description")
                .price(1L)
                .client(client1)
                .build();
        carRepository.save(car1);

        Comment comment1 = Comment.builder()
                .commentDate(Instant.now())
                .comment("comment")
                .client(client1)
                .build();
        commentRepository.save(comment1);

        User user1 = new User("Zalex1");
        User user2 = new User("Zalex2");
        User user3 = new User("Zalex3");

        userRepository.save(user1);
        userRepository.save(user2);
        userRepository.save(user3);
    }
}