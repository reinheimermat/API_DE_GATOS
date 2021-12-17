package br.com.matheusreinheimer.projectn2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.yawintutor.controller"})
public class Projectn2Application {

	public static void main(String[] args) {
		SpringApplication.run(Projectn2Application.class, args);
	}

}
