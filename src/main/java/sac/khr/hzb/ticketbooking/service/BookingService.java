package sac.khr.hzb.ticketbooking.service;

import java.util.Iterator;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sac.khr.hzb.ticketbooking.entity.MetroStation;
import sac.khr.hzb.ticketbooking.valueobj.Ticket;

@Service
public class BookingService {

	@Autowired
	MetroStationService stnSvc;

	@Autowired
	DistanceCalcService distanceCalcSvc;

	@Autowired
	PriceService priceSvc;

	public Ticket bookTicket(String fromStnId, String toStnId, int numberOfTravellers) {

		MetroStation from = stnSvc.getStationDetail(fromStnId);
		MetroStation to = stnSvc.getStationDetail(toStnId);

		Integer[] distance = getDistance(from, to, numberOfTravellers);
		int price = priceSvc.calculatePrice(distance[0], numberOfTravellers);

		return new Ticket(from.getStnName(), to.getStnName(), numberOfTravellers, price, distance[0], distance[1]);
	}

	private Integer[] getDistance(MetroStation from, MetroStation to, int numberOfTickets) {

		Set<String> fromColorLines = from.getColorLines();
		Set<String> toColorLines = to.getColorLines();
		Integer[] distance = null;

		if (fromColorLines.size() == 1) {
			distance = callDistanceSvc(fromColorLines, from, to);

		} else if (toColorLines.size() == 1) {
			distance = callDistanceSvc(toColorLines, from, to);
		} else {
			// TODO:- edge condition, where both the stations are connecting station
		}

		// this is added to support edge condition
		if (null == distance) {
			// defaulting to 5 km
			distance = new Integer[2];
			distance[0] = 5;
			distance[1] = 1;
		}

		return distance;
	}

	private Integer[] callDistanceSvc(Set<String> fromColorLines, MetroStation from, MetroStation to) {

		for (Iterator<String> iterator = fromColorLines.iterator(); iterator.hasNext();) {
			String fromColorLine = iterator.next();

			return distanceCalcSvc.getDistance(fromColorLine, from.getStnId(), to.getStnId());
		}
		return null;
	}

}
