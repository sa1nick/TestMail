package com.geekster.TestMail.Controller;

import com.geekster.TestMail.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    User obj ;

    @GetMapping(value = "/user")
    public User getUser(){
        return obj;
    }
}
