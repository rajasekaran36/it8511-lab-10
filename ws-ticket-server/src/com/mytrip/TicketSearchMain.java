package com.mytrip;

import javax.xml.ws.Endpoint;

public class TicketSearchMain {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:5002/ticketservice", new TicketSearchImpl());;
		System.out.println("ticket service published");
	}

}
