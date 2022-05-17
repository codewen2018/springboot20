package com.pt.mapper;

import com.pt.domain.Comment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface CommentMapper {


    //类型    方法名
    @Select("select * from t_comment where id=#{id} ")
    Comment findById(int id);

}
