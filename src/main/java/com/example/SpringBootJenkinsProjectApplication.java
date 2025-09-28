package com.example;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootJenkinsProjectApplication {

	 @GetMapping("/hello")
	    public List<String> hello() {
	        return Arrays.asList("shubham","ramesh","amit");
	    }
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootJenkinsProjectApplication.class, args);
	}

}
