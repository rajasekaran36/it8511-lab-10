package com.mytrip;

import java.util.List;

import com.airline.Flight;

public interface TicketSearch {
	List<Flight> getFlightsByDate(String date,String from, String to);
	Flight getLowestFareByDate(String date,String from,String to);
}
