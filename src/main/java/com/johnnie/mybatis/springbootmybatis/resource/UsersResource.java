package com.johnnie.mybatis.springbootmybatis.resource;

import com.johnnie.mybatis.springbootmybatis.mapper.UsersMapper;
import com.johnnie.mybatis.springbootmybatis.model.Users;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/users")
public class UsersResource {

    public UsersResource(UsersMapper usersMapper) {
        this.usersMapper = usersMapper;
    }

    private UsersMapper usersMapper;



    @GetMapping("/all")
    public List<Users> getAll(){
        return usersMapper.findAll();
    }

    @GetMapping("/update")
    private List<Users> update(){

        Users users = new Users();
        users.setName("Bobby");
        users.setAddress("123 Elm Street");
        users.setAge(42);
        users.setSex("m");

        usersMapper.insert(users,"black");

        return usersMapper.findAll();

    }
}
