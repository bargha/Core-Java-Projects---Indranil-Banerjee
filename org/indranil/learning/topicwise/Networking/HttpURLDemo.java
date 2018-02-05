package org.indranil.learning.topicwise.Networking;

import java.net.*;
import java.util.*;

public class HttpURLDemo {
	public static void main(String[] args) throws Exception {
	
		URL hp = new URL("http://www.google.com");
		
		HttpURLConnection hpCon = (HttpURLConnection)hp.openConnection();
		
		System.out.println("Request method is " + hpCon.getRequestMethod());
		System.out.println("Response code is " + hpCon.getResponseCode());
		System.out.println("Response message is " + hpCon.getResponseMessage());
		
		Map<String, List<String>> hdrMap = hpCon.getHeaderFields();
		Set<String> hdrField = hdrMap.keySet();
		
		System.out.println("\nHere is the header: ");
		
		for(String k : hdrField) {
			System.out.println("Key: " + k + " Value: " + hdrMap.get(k));
		}
		
	}
}
