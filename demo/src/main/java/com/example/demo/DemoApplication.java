package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@Bean
	CommandLineRunner runner(StudentRepository repository){
		return args -> {
			Address address = new Address("zimbabwe","bulawayo","bulawayo");
			Student student = new Student("muziwandile","Nkomo","muziwandilenko@gmail.com",
					Gender.MALE, address, List.of("bible_study"), BigDecimal.TEN, LocalDateTime.now());

			repository.insert(student);
		};
	}
}
