package main;

import javax.xml.ws.Endpoint;

import service.RandomQuoteImpl;

public class Main {

	public static void main(String[] args) {
		
			try {
				Endpoint.publish("http://localhost:8888/quote", new RandomQuoteImpl());
			}
			catch (Exception e)
			{
			System.out.println(e.getMessage());	
			
			}
	}
}


