package sac.khr.hzb.ticketbooking.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import sac.khr.hzb.ticketbooking.TicketBookingApplication;
import sac.khr.hzb.ticketbooking.entity.MetroRoute;
import sac.khr.hzb.ticketbooking.entity.RouteDetail;

@Service
public class DistanceCalcService {

	public Integer[] getDistance(String fromColorLine, String fromStnId, String toStnId) {
		
		Optional<MetroRoute> routeOpt = TicketBookingApplication.metroRouteList.stream().filter(metroRoute -> metroRoute.getRouteName().equals(fromColorLine)).findAny();
				
		if(routeOpt.isPresent()) {
			MetroRoute metroRoute = routeOpt.get();
			Optional<RouteDetail> fromRouteDetail = metroRoute.getRouteDetails().stream().filter(routeDetail -> routeDetail.getStnId().equals(fromStnId)).findAny();
			Optional<RouteDetail> toRouteDetail = metroRoute.getRouteDetails().stream().filter(routeDetail -> routeDetail.getStnId().equals(toStnId)).findAny();
			
			if(fromRouteDetail.isPresent()) {
				float from_distanceFromOrigin = fromRouteDetail.get().getDistFromOriginStn();
				if(toRouteDetail.isPresent()) {
					Integer[] result = new Integer[2];
					float to_distanceFromOrigin = toRouteDetail.get().getDistFromOriginStn();
					result[0] = Math.round(to_distanceFromOrigin-from_distanceFromOrigin);
					result[1] = toRouteDetail.get().getStoppagFromOrigin()-fromRouteDetail.get().getStoppagFromOrigin();
					return result;
				}
			}
		}
		
		return null;
	}
}
