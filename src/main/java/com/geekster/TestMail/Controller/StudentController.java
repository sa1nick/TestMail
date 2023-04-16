package com.geekster.TestMail.Controller;

import com.geekster.TestMail.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {

    @Autowired
    Student std;

    public StudentController() {
    }

    @GetMapping(value = "/student")
    @ResponseBody
    public Student getStudent(){
        return std;
    }
}
