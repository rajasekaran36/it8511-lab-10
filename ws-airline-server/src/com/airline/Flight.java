package com.airline;


public class Flight {
	private String flightNumber;
	private int totalNumberOfSeats;
	private int seatsAvailable;
	private String date;
	private String source;
	private String destination;
	private int fare;
	public Flight(String flightNumber, int totalNumberOfSeats,
			int seatsAvailable, String date, String source, String destination,
			int fare) {
		this.flightNumber = flightNumber;
		this.totalNumberOfSeats = totalNumberOfSeats;
		this.seatsAvailable = seatsAvailable;
		this.date = date;
		this.source = source;
		this.destination = destination;
		this.fare = fare;
	}
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public int getTotalNumberOfSeats() {
		return totalNumberOfSeats;
	}
	public void setTotalNumberOfSeats(int totalNumberOfSeats) {
		this.totalNumberOfSeats = totalNumberOfSeats;
	}
	public int getSeatsAvailable() {
		return seatsAvailable;
	}
	public void setSeatsAvailable(int seatsAvailable) {
		this.seatsAvailable = seatsAvailable;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getFare() {
		return fare;
	}
	public void setFare(int fare) {
		this.fare = fare;
	}
	@Override
	public String toString() {
		super.toString();
		return "Flight [getFlightNumber()=" + getFlightNumber()
				+ ", getTotalNumberOfSeats()=" + getTotalNumberOfSeats()
				+ ", getSeatsAvailable()=" + getSeatsAvailable()
				+ ", getDate()=" + getDate() + ", getSource()=" + getSource()
				+ ", getDestination()=" + getDestination() + ", getFare()="
				+ getFare() + "]";
	}
	
}
