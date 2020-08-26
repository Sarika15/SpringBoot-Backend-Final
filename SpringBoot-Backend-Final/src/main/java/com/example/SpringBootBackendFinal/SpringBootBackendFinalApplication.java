package com.example.SpringBootBackendFinal;

import com.example.SpringBootBackendFinal.model.User;
import com.example.SpringBootBackendFinal.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootBackendFinalApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBackendFinalApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;
	@Override
	public void run(String... args) throws Exception {
		this.userRepository.save(new User("Varad","Karkhanis","varad.karkhanis@gmail.com"));
		this.userRepository.save(new User("Sarika","Karkhanis","sarikadighe15@gmail.com"));
		this.userRepository.save(new User("Vinayak","Karkhanis","vinayak.karkhanis@gmail.com"));

	}
}
