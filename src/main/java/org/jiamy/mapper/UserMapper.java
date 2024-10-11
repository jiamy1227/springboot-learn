package org.jiamy.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.jiamy.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @description:
 * @author: jiamy
 * @create: 2024/9/26 15:27
 **/
@Mapper
public interface UserMapper {

    @Select("select * from user where id=#{id}")
    User getById(@Param("id") String id);

    @Select("select * from user where name=#{name}")
    User getByName(@Param("name") String name);
}
