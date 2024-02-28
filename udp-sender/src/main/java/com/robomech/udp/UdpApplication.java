package com.robomech.udp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.robomech.udp.service.Destination;

@SpringBootApplication
public class UdpApplication {

	public static void main(String[] args) {
		SpringApplication.run(UdpApplication.class, args);
	}

}