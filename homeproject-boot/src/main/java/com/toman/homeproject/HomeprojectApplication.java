package com.toman.homeproject;

import com.toman.homeproject.messagebus.MessagebusService;
import com.toman.homeproject.messagebus.model.BillBO;
import com.toman.homeproject.rest.HomeController;
import org.apache.kafka.clients.admin.AdminClientConfig;
import org.apache.kafka.clients.admin.KafkaAdminClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.kafka.KafkaAutoConfiguration;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.ComponentScan;

import java.math.BigDecimal;

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
		System.out.println("aaaaaaa");
		messagebusService.send(BillBO.builder().Id("id1").amouth(BigDecimal.TEN).build());
        System.out.println("bbbbbbb");

    }
}
