package com.example.nixlecture26;

import com.example.nixlecture26.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class NixLecture26Application {

    @Autowired
    private UserService service;


    public static void main(String[] args) {
        SpringApplication.run(NixLecture26Application.class, args);
    }

    @Bean
    public CommandLineRunner run(ApplicationContext ctx){

        return (args -> {
			//service.createUserEntity("nikita", "nikita@gmail.com", "0987653422");

            service.getAll().forEach(user -> System.out.println(user));

        });
    }

}
