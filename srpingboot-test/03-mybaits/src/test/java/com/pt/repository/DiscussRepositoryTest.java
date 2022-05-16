package com.pt.repository;

import com.pt.domain.Discuss;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DiscussRepositoryTest {

    @Autowired
    private DiscussRepository repository;
    @Test
    public void findByAuthorNotNull() {
        List<Discuss> list = repository.findByAuthorNotNull();
        System.out.println(list);
    }

    @Test
    public void getDiscussPaged() {
    }

    @Test
    public void getDiscussPaged2() {
    }

    @Test
    public void updateDiscuss() {
    }

    @Test
    public void deleteDiscuss() {
    }
}