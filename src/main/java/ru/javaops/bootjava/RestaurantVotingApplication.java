package ru.javaops.bootjava;

import lombok.AllArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.javaops.bootjava.model.Role;
import ru.javaops.bootjava.model.User;
import ru.javaops.bootjava.repository.UserRepository;

import java.util.Set;

@SpringBootApplication
@AllArgsConstructor
public class RestaurantVotingApplication implements ApplicationRunner {

    private final UserRepository userRepo;

    public static void main(String[] args) {
        SpringApplication.run(RestaurantVotingApplication.class, args);
    }


    @Override
    public void run(ApplicationArguments args) {
//        userRepo.save(new User("user@gmail.com", "Имя User", "Фамилия User",
//                "password", Set.of(Role.ROLE_USER)));
//        userRepo.save(new User("admin@javaops.ru", "Имя Admin", "Фамилия Admin",
//                "admin", Set.of(Role.ROLE_USER, Role.ROLE_ADMIN)));

        System.out.println(userRepo.findAll());

    }
}
