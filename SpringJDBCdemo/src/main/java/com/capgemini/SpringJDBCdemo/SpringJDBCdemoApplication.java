package com.capgemini.SpringJDBCdemo;

import com.capgemini.SpringJDBCdemo.model.Alien;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJDBCdemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJDBCdemoApplication.class, args);

		Alien alien1 = (Alien) context.getBean("alien");
		alien1.setId(101);
		alien1.setName("Arjun");
		alien1.setTech("Java");

		AlienRepository repo = context.getBean(AlienRepository.class);
		repo.save(alien1);
		System.out.println(repo.findAll());
	}

}
