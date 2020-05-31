package com.toman.homeproject;

import com.toman.homeproject.messagebus.MessagebusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HomeprojectApplication implements CommandLineRunner
{

	@Autowired
	private MessagebusService messagebusService;

	public static void main(String[] args) {
		SpringApplication.run(HomeprojectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		messagebusService.send("Je to tam !!!");
	}
}
