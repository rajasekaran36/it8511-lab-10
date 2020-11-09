package com.airline;


public interface AirlineOperations {
	boolean addFlight(Flight aFlight);
	boolean removeFlight(String flightNumber);
	int checkTicketAvailability(String aDate);
	int getFare(String flightNumber);
	
}
