package com.educandoweb.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;

@Configuration
@Profile("teste")
public class TesteConfig implements CommandLineRunner{

	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Thomas Waine", "Twaine@email.com", "1199999999", "12345");
		User u2 = new User(null, "Martha Waine", "Mwaine@email.com", "1199999999", "12345");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		
	}
	
}
