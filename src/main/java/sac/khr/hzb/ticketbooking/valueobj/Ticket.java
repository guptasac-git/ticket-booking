package sac.khr.hzb.ticketbooking.valueobj;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class Ticket {

	String fromStation;
	String toStation;
	int numberOfTravellers;
	int ticketCost;
	int distance;
	int numberOfStations;
	String contactNumber;

	public Ticket(String fromStation, String toStation, int numberOfTravellers, int ticketCost, int distance,
			int numberOfStations) {
		super();
		this.fromStation = fromStation;
		this.toStation = toStation;
		this.numberOfTravellers = numberOfTravellers;
		this.ticketCost = ticketCost;
		this.distance = distance;
		this.numberOfStations = numberOfStations;
	}

	public String getFromStation() {
		return fromStation;
	}

	public void setFromStation(String fromStation) {
		this.fromStation = fromStation;
	}

	public String getToStation() {
		return toStation;
	}

	public void setToStation(String toStation) {
		this.toStation = toStation;
	}

	public int getNumberOfTravellers() {
		return numberOfTravellers;
	}

	public void setNumberOfTravellers(int numberOfTravellers) {
		this.numberOfTravellers = numberOfTravellers;
	}

	public int getTicketCost() {
		return ticketCost;
	}

	public void setTicketCost(int ticketCost) {
		this.ticketCost = ticketCost;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public int getNumberOfStations() {
		return numberOfStations;
	}

	public void setNumberOfStations(int numberOfStations) {
		this.numberOfStations = numberOfStations;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	@Override
	public String toString() {
		return "Ticket [fromStation=" + fromStation + ", toStation=" + toStation + ", numberOfTravellers="
				+ numberOfTravellers + ", ticketCost=" + ticketCost + ", contactNumber=" + contactNumber + "]";
	}

}
