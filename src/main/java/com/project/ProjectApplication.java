package com.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class ProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(ProjectApplication.class, args);

	}
}
