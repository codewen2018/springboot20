package com.pt.repository;

import com.pt.domain.Discuss;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DiscussRepositoryTest {

    @Autowired
    private DiscussRepository repository;
    @Test
    public void findByAuthorNotNull() {
       ;

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        System.out.println(repository.findAllById(integers));
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