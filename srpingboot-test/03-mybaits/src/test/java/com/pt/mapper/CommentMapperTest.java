package com.pt.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CommentMapperTest {

    @Autowired
    private CommentMapper commentMapper;

    @Test
    public void findById() {

        System.out.println(commentMapper.findById(1));

    }

    @Test
    public void insertComment() {
    }

    @Test
    public void updateComment() {
    }

    @Test
    public void deleteComment() {
    }
}