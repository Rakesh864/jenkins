package com.example.jenkinsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsdemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(JenkinsdemoApplication.class, args);
		System.out.println("jenkins demo started");
		System.out.println("jenkins demo commit 2 to check poll scm");
	}

}
