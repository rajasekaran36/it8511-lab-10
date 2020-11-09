
package com.airline;

import javax.xml.ws.Endpoint;

public class JetAirwaysMain {
	public static void main(String[] args) {
		JetAirways jetairways = new JetAirways();
		jetairways.addFlight(new Flight("JA443", 112, 100, "12-11-2020", "CJB", "MAS", 4125));
		jetairways.addFlight(new Flight("JA689", 130, 45, "14-11-2020", "CJB", "BOM", 6234));
		Endpoint.publish("http://localhost:5001/jetairways", jetairways);
		System.out.println("jetairways service published");
	}
}
