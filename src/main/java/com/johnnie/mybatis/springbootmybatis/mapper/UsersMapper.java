package com.johnnie.mybatis.springbootmybatis.mapper;

import com.johnnie.mybatis.springbootmybatis.model.Users;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UsersMapper {

    @Select("Select * from users")
    List<Users> findAll();

    @Insert("insert into users(name,address,sex,age,request_type) values(#{a.name}, #{a.address}, #{a.sex}, #{a.age}, #{b})")
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty="id", before = false, resultType = Integer.class)
    void insert(@Param("a") Users users, @Param("b") String request);
}
