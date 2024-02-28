package com.robomech.udp.service;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UDPService {

	@Autowired
	Destination destination;
	
	public void sendMessageOverUDP(String message) {
		try (DatagramSocket socket = new DatagramSocket()) {
			InetAddress address = InetAddress.getByName(destination.getIp_address());
			byte[] buffer = message.getBytes();
			DatagramPacket packet = new DatagramPacket(buffer, buffer.length, address, destination.getPort());
			socket.send(packet);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
