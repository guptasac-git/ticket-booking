package sac.khr.hzb.ticketbooking.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import sac.khr.hzb.ticketbooking.TicketBookingApplication;
import sac.khr.hzb.ticketbooking.valueobj.Ticket;

@RunWith(SpringRunner.class)
@SpringBootTest
class BookingServiceTest {

	@Autowired
	BookingService bookingSvc;

	@BeforeAll
	static void init() {
		TicketBookingApplication.populateStn();
		TicketBookingApplication.populateRedRouteData();
		TicketBookingApplication.populateYellowRouteData();
	}

	@Test
	void testBookTicket() {
		Ticket ticket = bookingSvc.bookTicket("stn-1", "stn-20", 5);
		commonAssertion(ticket);
	}

	void commonAssertion(Ticket ticket) {
		assertEquals(250, ticket.getTicketCost());
		assertEquals(23, ticket.getDistance());
		assertEquals(19, ticket.getNumberOfStations());
	}

}
