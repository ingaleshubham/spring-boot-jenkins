package com.example;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootJenkinsProjectApplication extends SpringBootServletInitializer {

	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringBootJenkinsProjectApplication.class);
    }

	@GetMapping("/hello")
	public List<String> hello() {
		return Arrays.asList("shubham", "ramesh", "amit");
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJenkinsProjectApplication.class, args);
	}

}
