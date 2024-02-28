package com.robomech.udp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.robomech.udp.service.UDPService;

@RestController
public class SendController {

	@Autowired
	UDPService service;
	
	@GetMapping("/send")
	public String sendUdpMessage(@RequestParam("message") String message) {
		service.sendMessageOverUDP(message);
		return "Message trigged";
	}
	
	@GetMapping("/trigger")
	public String sendUdpMessageWithOutParam() {
		service.sendMessageOverUDP("hello brother");
		return "Message trigged";
	}
}
