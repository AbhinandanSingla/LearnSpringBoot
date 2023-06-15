package com.learnspringboot.learnspringboot;

import com.learnspringboot.learnspringboot.dao.UserRepository;
import com.learnspringboot.learnspringboot.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class LearnSpringBootApplication {

    public static void main(String[] args) {
        ApplicationContext run = SpringApplication.run(LearnSpringBootApplication.class, args);
        UserRepository userRepository = run.getBean(UserRepository.class);

       /*

       Above code is for making table and add data to the table

        UserRepository userRepository = run.getBean(UserRepository.class);
        User user = new User();
        user.setName("Abhinandan");
        user.setCity("Patran");
        user.setStatus("Theek");


        // For storing single data
        User user1 = userRepository.save(user);
        System.out.println(user1);

        // for storing multiple data
        User user1 = new User();
        user1.setName("HSK");
        user1.setCity("F");
        user1.setStatus("Theek");


        User user2 = new User();
        user2.setName("Abhinandan");
        user2.setCity("Patran");
        user2.setStatus("Theek");

        List<User> users = List.of(user1, user2);
        Iterable<User> result = userRepository.saveAll(users);
        result.forEach(user->{
             //  user-> lambda function
            System.out.println(user);
        });

        */
        /*
        // update the user
        Optional<User> user = userRepository.findById(1);
        if (user.isPresent()){
            System.out.println(user.get());
            User username = user.get();
            username.setName("Binodd");
            User result = userRepository.save(username);
            System.out.println(result);
        }
        */

        /*
        // Get all data
        // same can be done with for loop
        Iterable<User> data = userRepository.findAll();
        Iterator<User> iterator = data.iterator();

        while (iterator.hasNext()) {
            User user = iterator.next();
            System.out.println(user);
        }
         */

/*
        // Making custom methods
        List<User> data = userRepository.findByName("Abhinandan");
        data.forEach(System.out::println);
        List<User> data1 = userRepository.findByNameAndCity("Abhinandan", "Patran");
        data1.forEach(System.out::println);

 */
        List<User> d = userRepository.getAllUser();
        d.forEach(System.out::println);
    }
}
