package com.pt.dao;

import com.pt.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private User user;

    @Test
    public void all(){

        List<User> users = userRepository.findAll();
        System.out.println(users);
    }


    @Test
    public void insert(){

        user.setUsername("code文家");
        user.setPassword("123456");
        user.setMyAge(11);
        User user = userRepository.saveAndFlush(this.user);
        System.out.println(user);
        all();

    }

    @Test
    public void update(){

        user.setId(1);
        user.setUsername("code文家");
        user.setMyAge(12);
        User user = userRepository.saveAndFlush(this.user);
        System.out.println(user);
        all();

    }

    @Test
    public void del(){

        user.setId(1);

        userRepository.delete(user);
        all();

    }

    @Test
    public void findById(){

        Optional<User> byId = userRepository.findById(2);
      System.out.println(byId.get());




    }
}

