package sac.khr.hzb.ticketbooking.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class MetroRoute {

	String routeId;
	String routeName;
	String originStnId;
	String destStnId;
	List<MetroStation> stations;
	List<RouteDetail> routeDetails;
	
	public MetroRoute(String routeId, String routeName, 
			String originStnId, String destStnId,
			List<MetroStation> stations, List<RouteDetail> routeDetails) {
		super();
		this.routeId = routeId;
		this.routeName = routeName;
		this.originStnId = originStnId;
		this.destStnId = destStnId;
		this.stations = stations;
		this.routeDetails = routeDetails;
	}

	public String getRouteId() {
		return routeId;
	}

	public String getRouteName() {
		return routeName;
	}

	public String getOriginStnId() {
		return originStnId;
	}

	public String getDestStnId() {
		return destStnId;
	}

	public List<MetroStation> getStations() {
		return stations;
	}

	public List<RouteDetail> getRouteDetails() {
		return routeDetails;
	}

	@Override
	public String toString() {
		return "MetroRoute [routeId=" + routeId + ", routeName=" + routeName + ", originStnId=" + originStnId
				+ ", destStnId=" + destStnId + ", stations=" + stations + ", routeDetails=" + routeDetails + "]";
	} 
	
	
}
