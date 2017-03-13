package com.springboot.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryService 
{
	public static void main(String[] args) 
	{
		System.setProperty("spring.config.name", "registration-server");
		System.out.println("inside Disco-service and this from abhi");
		System.out.println("Hi this is Pranav");
		System.out.println("Hi this is Pranav");
		SpringApplication.run( DiscoveryService.class, args);
	}

}
