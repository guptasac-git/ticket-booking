package sac.khr.hzb.ticketbooking.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class RouteDetail {

	String stnId;
	int stoppagFromOrigin;
	float distFromOriginStn;
	
	public RouteDetail(String stnId, int stoppagFromOrigin, float distFromOriginStn) {
		super();
		this.stnId = stnId;
		this.stoppagFromOrigin = stoppagFromOrigin;
		this.distFromOriginStn = distFromOriginStn;
	}

	public String getStnId() {
		return stnId;
	}

	public int getStoppagFromOrigin() {
		return stoppagFromOrigin;
	}

	public float getDistFromOriginStn() {
		return distFromOriginStn;
	}

	@Override
	public String toString() {
		return "RouteDetail [stnId=" + stnId + ", stoppagFromOrigin=" + stoppagFromOrigin + ", distFromOriginStn="
				+ distFromOriginStn + "]";
	}
	
	
	
}
