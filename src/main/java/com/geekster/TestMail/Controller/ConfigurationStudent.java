package com.geekster.TestMail.Controller;


import com.geekster.TestMail.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationStudent {

    @Bean
    public Student getStudent(){
        System.out.println("Bean is configured by Spring.");
        return new Student("Student");
    }
}
