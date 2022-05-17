package com.pt.mapper;

import com.pt.domain.Article;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ArticleMapper {


//    @Select("select * from t_article where id=#{id} ")
    //返回类型  方法名
    Article getArticleById(int id);
}
