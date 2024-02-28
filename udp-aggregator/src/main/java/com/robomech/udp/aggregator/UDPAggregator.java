package com.robomech.udp.aggregator;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class UDPAggregator {

	@Value("${udp.listen.port}")
	private int listenPort;

	@PostConstruct
	public void startListening() {
		new Thread(udpListener).start();
	}

	final Runnable udpListener = new Runnable() {

		@Override
		public void run() {
			try (DatagramSocket socket = new DatagramSocket(listenPort)) {
				System.out.println("Listening for UDP packet on " + listenPort);
				final byte[] received = new byte[1024];

				while(true) {
					final DatagramPacket packet = new DatagramPacket(received, received.length);
					socket.receive(packet);
					final String message = new String(packet.getData(), 0, packet.getLength());
					System.out.println("Received : " + message);
				}
			}
			catch (Exception e) {
				e.printStackTrace();
			}

		}
	};

}
