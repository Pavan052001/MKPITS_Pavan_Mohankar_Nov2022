package com.mkpits.SpringBootCurdOpration;

import com.mkpits.SpringBootCurdOpration.entity.Student;
import com.mkpits.SpringBootCurdOpration.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootCurdOprationApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCurdOprationApplication.class, args);
	}
	@Autowired
	StudentRepo studentRepo;
	@Override
	public void run(String... args) throws Exception {


	}
}
