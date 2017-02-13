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
		
		
		// comment for git changes
		// new changes
		System.setProperty("spring.config.name", "registration-server");
		SpringApplication.run( DiscoveryService.class, args);
		
	}

}
