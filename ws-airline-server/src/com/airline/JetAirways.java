package com.airline;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

@WebService
public class JetAirways implements AirlineOperations{
	private String airlineName = "JetAirWays";
	private List<Flight> flights = new ArrayList<Flight>();
	public String getAirlineName() {
		return airlineName;
	}
	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}
	public List<Flight> getFlights() {
		return flights;
	}
	public void setFlights(List<Flight> flights) {
		this.flights = flights;
	}
	@Override
	public boolean addFlight(Flight aFlight) {
		flights.add(aFlight);
		return true;
	}
	@Override
	public boolean removeFlight(String flightNumber) {
		for(Flight aFlight:flights){
			if(aFlight.getFlightNumber().equals(flightNumber)){
				flights.remove(aFlight);
				return true;
			}
		}
		return false;
	}
	public int checkTicketAvailability(String aDate) {
		for(Flight aFlight:flights){
			if(aFlight.getDate().equals(aDate)){
				return aFlight.getSeatsAvailable();
			}
		}
		return 0;
	}
	@Override
	public int getFare(String flightNumber) {
		// TODO Auto-generated method stub
		for(Flight aFlight:flights){
			if(aFlight.getFlightNumber().equals(flightNumber)){
				return aFlight.getFare();
			}
		}
		return 0;
	}
}
