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
    public void all(){

        List<User> users = userRepository.findAll();

        System.out.println(users);

    }



    @Test
    public void insert(){


        User user = new User();
        user.setUsername("曹雪琼");
        user.setPassword("123456");
        user.setMyAge(20);

        //save和saveAndFlush(
        User user1 = userRepository.saveAndFlush(user);
        System.out.println(user1);
    }


    @Test
    public void update(){


        User user = new User();
        user.setId(1);
        user.setUsername("许莉");
        user.setPassword("654321");
        user.setMyAge(18);

        //save和saveAndFlush  如果有ID就执行修改，如果没有ID就添加
        User user1 = userRepository.saveAndFlush(user);
        System.out.println(user1);
    }

    @Test
    public void delete(){

        User user = new User();
        user.setId(2);

        userRepository.delete(user);
    }


    //通过ID找出对应的用户

    @Test
    public void findUserById(){

        Optional<User> byId = userRepository.findById(1);

        if (byId.isPresent()){
            System.out.println(byId.get());
        }else {
            System.out.println(byId.isPresent());
            System.out.println("没有值");
        }

    }

}