package com.pt.mapper;

import com.pt.domain.Article;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ArticleMapper {


    //类型   方法名
    Article getArticleById(int id);

}
