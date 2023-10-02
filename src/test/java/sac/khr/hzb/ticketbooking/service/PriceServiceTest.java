package sac.khr.hzb.ticketbooking.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import sac.khr.hzb.ticketbooking.TicketBookingApplication;

@RunWith(SpringRunner.class)
@SpringBootTest
class PriceServiceTest {

	@Autowired
	PriceService priceSvc;

	@BeforeAll
	static void init() {
		TicketBookingApplication.populateStn();
		TicketBookingApplication.populateRedRouteData();
		TicketBookingApplication.populateYellowRouteData();
	}

	@Test
	void testBookTicket() {
		int price = priceSvc.calculatePrice(23, 5);
		assertEquals(250, price);
	}

}
