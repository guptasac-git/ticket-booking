package sac.khr.hzb.ticketbooking.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import sac.khr.hzb.ticketbooking.TicketBookingApplication;
import sac.khr.hzb.ticketbooking.entity.MetroRoute;
import sac.khr.hzb.ticketbooking.entity.RouteDetail;
import sac.khr.hzb.ticketbooking.service.BookingService;
import sac.khr.hzb.ticketbooking.valueobj.Ticket;

@RunWith(SpringRunner.class)
@SpringBootTest
class BookingControllerTest {

	@Autowired
	BookingService bookingSvc;

	@Autowired
	BookingController bookingController;

	@BeforeAll
	static void init() {
		TicketBookingApplication.populateStn();
		TicketBookingApplication.populateRedRouteData();
		TicketBookingApplication.populateYellowRouteData();
	}

	@Test
	void testBookTicket() {

		Ticket ticket = bookingController.bookTicket("stn-1", "stn-20", 5, null);
		commonAssertion(ticket);
	}

	@Test
	void testGetRouteList() {
		List<MetroRoute> routeList = bookingController.getRouteList();
		assertEquals(2, routeList.size());
	}

	@Test
	void testGetStations() {
		List<RouteDetail> routeDetails = bookingController.getStations("route-yellow-1");
		assertEquals(36, routeDetails.size());
	}

	@Test
	void testShowFareDetails() {

		Ticket ticket = bookingController.showFareDetails("stn-1", "stn-20", 5);
		commonAssertion(ticket);
	}
	
	void commonAssertion(Ticket ticket) {
		assertEquals(250, ticket.getTicketCost());
		assertEquals(23, ticket.getDistance());
		assertEquals(19, ticket.getNumberOfStations());
	}
}
