package com.example.nixlecture26.service;

import com.example.nixlecture26.repository.UserRepository;
import com.example.nixlecture26.repository.entity.UserEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void createUserEntity(String name, String email, String phoneNumber){
        UserEntity userEntity = new UserEntity();
        userEntity.setName(name);
        userEntity.setEmail(email);
        userEntity.setPhoneNumber(phoneNumber);
        userRepository.save(userEntity);
    }

    public List<UserEntity> getAll(){
        return userRepository.findAll();
    }

}
