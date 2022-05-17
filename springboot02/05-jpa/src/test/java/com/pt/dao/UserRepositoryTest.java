package com.pt.dao;


import com.pt.pojo.User;
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

    @Test
    public void all() {

        List<User> users = userRepository.findAll();

        System.out.println(users);


    }

    @Test
    public void insert() {


        User user = new User();
        user.setUsername("li莉");
        user.setPassword("123456");
        user.setMyAge(18);


        //saveAndFlush  如对象中有id就修改，如果没有id就添加
        User user1 = userRepository.saveAndFlush(user);
        System.out.println(user1);

    }


    @Test
    public void update() {

        User user = new User();
        user.setId(2);
        user.setUsername("肖洁");
        user.setPassword("123456");
        user.setMyAge(18);

        //saveAndFlush  如对象中有id就修改，如果没有id就添加
        User user1 = userRepository.saveAndFlush(user);
        System.out.println(user1);
    }

    @Test
    public void delete() {
        User user = new User();
        user.setId(3);
        userRepository.delete(user);

    }

    //通过ID找对应的用户
    @Test
    public void findUserById() {

        Optional<User> byId = userRepository.findById(3);

        System.out.println(byId.isPresent());

        if (byId.isPresent()){

            System.out.println(byId.get());
        }else {
            System.out.println("没有值");
        }

    }
}