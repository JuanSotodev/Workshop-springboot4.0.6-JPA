package com.educandoweb.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educandoweb.course.entities.Order;
import com.educandoweb.course.entities.User;
import com.educandoweb.course.enums.OrderStatus;
import com.educandoweb.course.repositories.OrderRepository;
import com.educandoweb.course.repositories.UserRepository;

@Configuration
@Profile("teste")
public class TesteConfig implements CommandLineRunner{

	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Thomas Waine", "Twaine@email.com", "1199999999", "12345");
		User u2 = new User(null, "Martha Waine", "Mwaine@email.com", "1199999999", "12345");
		
		Order o1 = new Order(null, Instant.parse("2026-04-17T19:55:05Z"),OrderStatus.PAID , u1);
		Order o2 = new Order(null, Instant.parse("2026-05-18T20:15:10Z"),OrderStatus.WAITING_PAYMENT , u2);
		Order o3 = new Order(null, Instant.parse("2026-05-19T15:31:07Z"), OrderStatus.WAITING_PAYMENT, u1);
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
		
	}
	
}
