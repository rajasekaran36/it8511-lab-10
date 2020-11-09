package com.mytrip.client;

import java.util.List;

import com.airline.Flight;
import com.mytrip.TicketSearchImpl;
import com.mytrip.TicketSearchImplService;

public class TicketClientMain {

	public static void main(String[] args) {
		System.out.println("Search Starts");
		TicketSearchImpl ticketSearchService = new TicketSearchImplService().getTicketSearchImplPort();
		List<Flight> availableFlights = ticketSearchService.getFlightsByDate("14-11-2020", "CJB", "BOM");
		System.out.println("Available Flights");
		for(Flight xFlight:availableFlights){
			System.out.println(xFlight.getFlightNumber()+"--"+xFlight.getDate()+"--"+xFlight.getSource()+"--"+xFlight.getDestination()+"--"+xFlight.getFare());
		}
		Flight lowFareFlight = ticketSearchService.getLowestFareByDate("14-11-2020", "CJB", "BOM");
		System.out.println("lowestFairFlight:"+lowFareFlight.getFlightNumber()+"--"+lowFareFlight.getFare()+"--No of Available Seats:"+lowFareFlight.getSeatsAvailable());
		System.out.println("Search Ends");
	}

}
