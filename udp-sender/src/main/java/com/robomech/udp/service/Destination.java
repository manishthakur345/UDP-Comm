package com.robomech.udp.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Destination {

	@Value("${destination.ip_address}")
	private String ip_address;
	
	@Value("${destination.port}")
	private int port;
	
	
	public String getIp_address() {
		return ip_address;
	}
	
	public int getPort() {
		return port;
	}
	
}
