package org.indranil.learning.topicwise.Networking;

import java.net.*;

public class InetAddressTest {
	
	public static void main(String[] args) throws UnknownHostException {
		
		InetAddress Address = InetAddress.getLocalHost();
		System.out.println(Address);
		
		Address = InetAddress.getByName("www.HerbSchildt.com");
		System.out.println(Address);
		
		InetAddress SW[] = InetAddress.getAllByName("www.nda.com");
		for(int i=0; i<SW.length;i++) {
			System.out.println(SW[i]);
		}
		
	}
}
