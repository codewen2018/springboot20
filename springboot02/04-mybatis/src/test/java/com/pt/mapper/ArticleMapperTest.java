package com.pt.mapper;

import com.pt.domain.Article;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ArticleMapperTest {


    @Autowired
    private ArticleMapper articleMapper;

    @Test
    public void getArticleById() {


        Article article = articleMapper.getArticleById(1);

        System.out.println(article);


    }
}