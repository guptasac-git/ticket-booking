package sac.khr.hzb.ticketbooking.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import sac.khr.hzb.ticketbooking.TicketBookingApplication;
import sac.khr.hzb.ticketbooking.entity.MetroStation;

@Service
public class MetroStationService {

	public MetroStation getStationDetail(String metroStnId) {
		
		Optional<MetroStation> stnOpt = TicketBookingApplication.stns.stream().filter(stn -> stn.getStnId().equals(metroStnId)).findAny();
		if(stnOpt.isPresent())
			return stnOpt.get();
		
		return null;
	}
	

}
