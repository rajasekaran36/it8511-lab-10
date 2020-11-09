package com.airline;

import javax.xml.ws.Endpoint;

public class SpiceJetMain {

	public static void main(String[] args) {
		SpiceJet spicejet = new SpiceJet();
		spicejet.addFlight(new Flight("SJ501", 87, 87, "12-11-2020", "CJB", "MAS", 4589));
		spicejet.addFlight(new Flight("SJ889", 119, 92, "14-11-2020", "CJB", "BOM", 7823));
		Endpoint.publish("http://localhost:5000/spicejet", spicejet);
		System.out.println("spicejet service published");
	}

}
