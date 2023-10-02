package sac.khr.hzb.ticketbooking.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sac.khr.hzb.ticketbooking.TicketBookingApplication;
import sac.khr.hzb.ticketbooking.entity.MetroRoute;
import sac.khr.hzb.ticketbooking.entity.RouteDetail;
import sac.khr.hzb.ticketbooking.service.BookingService;
import sac.khr.hzb.ticketbooking.valueobj.Ticket;

/**
 * 
 * @author sachin gupta
 *
 */
@RestController
@RequestMapping("/api/v1/metro")
public class BookingController {

	@Autowired
	BookingService bookingSvc;
	
	@GetMapping("/ticket")
	public Ticket bookTicket(
			@Param(value = "fromStnId") String fromStnId,
			@Param(value = "toStnId") String toStnId,
			@Param(value = "numberOfTickets") int numberOfTickets,
			@Param(value = "contactNumber") String contactNumber) {
		
		Ticket ticket = bookingSvc.bookTicket(fromStnId, toStnId, numberOfTickets);
		if(contactNumber != null)
			ticket.setContactNumber(contactNumber);
		
		return ticket;
	}
	
	@GetMapping("/routes")
	public List<MetroRoute> getRouteList(){
		return TicketBookingApplication.metroRouteList;
	}
	
	@GetMapping("/routes/{routeId}/stations")
	public List<RouteDetail> getStations(@PathVariable String routeId){
		
		Optional<MetroRoute> metroRouteOpt = getRouteList().stream().filter(metroRoute -> metroRoute.getRouteId().equals(routeId)).findAny();
		if(metroRouteOpt.isPresent()) {
			return metroRouteOpt.get().getRouteDetails();
		}
		return null;
	}
	
	@GetMapping("/info")
	public Ticket showFareDetails(
			@Param(value = "fromStnId") String fromStnId,
			@Param(value = "toStnId") String toStnId,
			@Param(value = "numberOfTickets") int numberOfTickets) {
		
		return bookingSvc.bookTicket(fromStnId, toStnId, numberOfTickets);
	}
}

