package sac.khr.hzb.ticketbooking.entity;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class MetroStation {

	String stnId;
	String stnName;
	String contactNo;
	Set<String> colorLines;
	boolean isConnectingStn;
	List<String> toursitPlaces;

	public MetroStation(String stnId, String stnName, String contactNo, List<String> toursitPlaces, String colorLine) {
		
		this(stnId, stnName, contactNo, toursitPlaces, new HashSet<>(Arrays.asList(colorLine)), Boolean.FALSE);
	}
	
	public MetroStation(String stnId, String stnName, String contactNo, List<String> toursitPlaces, Set<String> colorLines,
			boolean isConnectingColorLine) {
		this.stnId = stnId;
		this.stnName = stnName;
		this.contactNo = contactNo;
		this.toursitPlaces = toursitPlaces;
		this.colorLines = colorLines;
		this.isConnectingStn = isConnectingColorLine;
	}

	public String getStnId() {
		return stnId;
	}

	public String getStnName() {
		return stnName;
	}

	public String getContactNo() {
		return contactNo;
	}

	public Set<String> getColorLines() {
		return colorLines;
	}

	public boolean isConnectingStn() {
		return isConnectingStn;
	}

	public List<String> getToursitPlaces() {
		return toursitPlaces;
	}

	@Override
	public String toString() {
		return "MetroStation [stnId=" + stnId + ", stnName=" + stnName + ", contactNo=" + contactNo + ", colorLines="
				+ colorLines + ", isConnectingStn=" + isConnectingStn + ", toursitPlaces=" + toursitPlaces + "]";
	}

}
