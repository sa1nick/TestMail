package com.geekster.TestMail;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class User {

    String userName;


    public User(){}

    public User(String userName){
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }



}
