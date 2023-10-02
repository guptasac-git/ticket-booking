package sac.khr.hzb.ticketbooking.service;

import org.springframework.stereotype.Service;

@Service
public class PriceService {


	/**
	 up to 2 km -- Rs 10, 2 to 5 km -- Rs 20, 
	 5 to 12 km -- Rs 30, 12 to 21 km -- Rs 40, 
	 21 to 32 km -- Rs 50 and for journeys beyond 32 km -- Rs 60.
	 * 
	 * @param distance
	 * @return
	 */
	public int calculatePrice(int distance, int numberOfTickets) {

		int p;
		
		if(distance <= 2)
			p=10;
		else if(distance>2 && distance<=5)
			p=20;
		else if(distance>5 && distance<=12)
			p=30;
		else if(distance>12 && distance<=21)
			p=40;
		else if(distance>21 && distance<=32)
			p=50;
		else
			p=60;
			
		return p*numberOfTickets;
	}

	}
