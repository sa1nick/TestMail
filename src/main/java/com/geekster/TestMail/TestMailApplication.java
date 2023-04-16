package com.geekster.TestMail;

import com.geekster.TestMail.Controller.StudentController;
import com.geekster.TestMail.JavaMail.HandleMail;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestMailApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestMailApplication.class, args);

		HandleMail emailer = new HandleMail();
		emailer.sendMail();
	}

}
