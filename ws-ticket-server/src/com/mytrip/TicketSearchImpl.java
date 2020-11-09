package com.mytrip;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import com.airline.Flight;
import com.airline.JetAirways;
import com.airline.JetAirwaysService;
import com.airline.SpiceJet;
import com.airline.SpiceJetService;

@WebService
public class TicketSearchImpl implements TicketSearch{
	
	@Override
	public List<Flight> getFlightsByDate(String date,String from,String to) {
		List<Flight> fligthsAvailable = new ArrayList<Flight>();
		
		SpiceJet spicejetservice = new SpiceJetService().getSpiceJetPort();
		for(Flight aSpiceJetFlight:spicejetservice.getFlights()){
			if(aSpiceJetFlight.getDate().equals(date)&&aSpiceJetFlight.getSource().equals(from)&&aSpiceJetFlight.getDestination().equals(to)){
				fligthsAvailable.add(aSpiceJetFlight);
			}
		}
		
		JetAirways jetairwaysservice = new JetAirwaysService().getJetAirwaysPort();
		for(Flight aJetAirWaysFlight:jetairwaysservice.getFlights()){
			if(aJetAirWaysFlight.getDate().equals(date)&&aJetAirWaysFlight.getSource().equals(from)&&aJetAirWaysFlight.getDestination().equals(to)){
				fligthsAvailable.add(aJetAirWaysFlight);
			}
		}
		
		
		return fligthsAvailable;
	}

	@Override
	public Flight getLowestFareByDate(String date,String from,String to) {
		Flight lowFareFlight=null;
		List<Flight> fligthsAvailable = getFlightsByDate(date, from, to);
		lowFareFlight = fligthsAvailable.get(0);
		int minfare = lowFareFlight.getFare();
		for(Flight xFlight:fligthsAvailable){
			if(xFlight.getFare()<minfare){
				lowFareFlight = xFlight;
				minfare = xFlight.getFare();
			}
		}
		return lowFareFlight;
	}
}
