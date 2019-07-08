package br.com.spring.camel.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages="br.com.spring.*")
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

}
