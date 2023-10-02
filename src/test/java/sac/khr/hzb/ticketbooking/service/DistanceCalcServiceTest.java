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
class DistanceCalcServiceTest {

	@Autowired
	DistanceCalcService distCalcSvc;

	@BeforeAll
	static void init() {
		TicketBookingApplication.populateStn();
		TicketBookingApplication.populateRedRouteData();
		TicketBookingApplication.populateYellowRouteData();
	}

	@Test
	void testGetDistance() {
		Integer[] tuple = distCalcSvc.getDistance("RED", "stn-1", "stn-20");
		assertEquals(23,  tuple[0]);
		assertEquals(19, tuple[1]);
	}

}
