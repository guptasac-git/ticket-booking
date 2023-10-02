package sac.khr.hzb.ticketbooking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import sac.khr.hzb.ticketbooking.entity.MetroRoute;
import sac.khr.hzb.ticketbooking.entity.MetroStation;
import sac.khr.hzb.ticketbooking.entity.RouteDetail;

@EnableWebMvc
@SpringBootApplication
public class TicketBookingApplication {

	public static List<MetroStation> stns = new ArrayList<>();
	public static List<MetroRoute> metroRouteList = new ArrayList<>();

	public static void main(String[] args) {
		SpringApplication.run(TicketBookingApplication.class, args);
		populateStn();
		populateRedRouteData();
		populateYellowRouteData();
		
		
	}

	public static void populateStn() {

		stns.add(new MetroStation("stn-1", "Shaheed Sthal(New Bus Adda)", null, null, "RED"));
		stns.add(new MetroStation("stn-2", "Hindon River", null, null, "RED"));
		stns.add(new MetroStation("stn-3", "Arthala", null, null, "RED"));
		stns.add(new MetroStation("stn-4", "Mohan Nagar", null, null, "RED"));
		stns.add(new MetroStation("stn-5", "Shyam park", null, null, "RED"));
		stns.add(new MetroStation("stn-6", "Major Mohit Sharma", null, null, "RED"));
		stns.add(new MetroStation("stn-7", "Raj Bagh", null, null, "RED"));
		stns.add(new MetroStation("stn-8", "Shaheed Nagar", null, null, "RED"));
		stns.add(new MetroStation("stn-9", "Dilshad Garden", null, null, "RED"));
		stns.add(new MetroStation("stn-10", "Jhil Mil", "8800793101", null, "RED"));
		stns.add(new MetroStation("stn-11", "Mansarovar Park", null, null, "RED"));
		stns.add(new MetroStation("stn-12", "Shahdara", null, null, "RED"));
		stns.add(new MetroStation("stn-13", "Welcome", null, null, new HashSet<>(Arrays.asList("RED", "Pink")),
				Boolean.TRUE));
		stns.add(new MetroStation("stn-14", "Seelampur", null, null, "RED"));
		stns.add(new MetroStation("stn-15", "Shastri Park", null, null, "RED"));
		stns.add(new MetroStation("stn-16", "Kashmere Gate", null, null, new HashSet<>(Arrays.asList("RED", "Violet")),
				Boolean.TRUE));
		stns.add(new MetroStation("stn-17", "Tis Hazari", null, null, "RED"));
		stns.add(new MetroStation("stn-18", "Pul Bangash", null, null, "RED"));
		stns.add(new MetroStation("stn-19", "Pratap Nagar", null, null, "RED"));
		stns.add(new MetroStation("stn-20", "Shastri Nagar", null, null, "RED"));
		stns.add(new MetroStation("stn-21", "Inderlok", null, null, new HashSet<>(Arrays.asList("RED", "Green")),
				Boolean.TRUE));
		stns.add(new MetroStation("stn-22", "Kanhaiya Nagar", null, null, "RED"));
		stns.add(new MetroStation("stn-23", "Keshav Puram", null, null, "RED"));
		stns.add(new MetroStation("stn-24", "Netaji Subash Place", null, null,
				new HashSet<>(Arrays.asList("RED", "Pink")), Boolean.TRUE));
		stns.add(new MetroStation("stn-25", "Kohat Enclave", null, null, "RED"));
		stns.add(new MetroStation("stn-26", "Pitam Pura", null, null, "RED"));
		stns.add(new MetroStation("stn-27", "Rohini East", null, null, "RED"));
		stns.add(new MetroStation("stn-28", "Rohini West", null, null, "RED"));
		stns.add(new MetroStation("stn-29", "Rithala", null, null, "RED"));

		stns.add(new MetroStation("stn-30", "Samaypur Badli", null, null, "YELLOW"));
		stns.add(new MetroStation("stn-31", "Rohini Sector 18-19", null, null, "YELLOW"));
		stns.add(new MetroStation("stn-32", "Haiderpur Badli Mor", null, null, "YELLOW"));
		stns.add(new MetroStation("stn-33", "Jahangirpuri", null, null, "YELLOW"));
		stns.add(new MetroStation("stn-34", "Adarsh Nagar", null, null, "YELLOW"));
		stns.add(new MetroStation("stn-35", "Azadpur", null, null, "YELLOW"));
		stns.add(new MetroStation("stn-36", "Model Town", null, null, "YELLOW"));
		stns.add(new MetroStation("stn-37", "Guru Tegh Bahadur Nagar", null, null, "YELLOW"));
		stns.add(new MetroStation("stn-38", "Vishwavidyalaya", null, null, "YELLOW"));
		stns.add(new MetroStation("stn-39", "Vidhan Sabha", "8800793101", null, "YELLOW"));
		stns.add(new MetroStation("stn-40", "Civil Lines", null, null, "YELLOW"));
		stns.add(new MetroStation("stn-41", "Chandni Chowk", null, null, "YELLOW"));
		stns.add(new MetroStation("stn-42", "Chawri Bazar", null, null, "YELLOW"));
		stns.add(new MetroStation("stn-43", "New Delhi", null, null, new HashSet<>(Arrays.asList("YELLOW", "ORANGE")),
				Boolean.TRUE));
		stns.add(new MetroStation("stn-44", "Rajiv Chowk", null, null, new HashSet<>(Arrays.asList("YELLOW", "BLUE")),
				Boolean.TRUE));
		stns.add(new MetroStation("stn-45", "Patel Chowk", null, null, "YELLOW"));
		stns.add(new MetroStation("stn-46", "Central Secretariat", null, null,
				new HashSet<>(Arrays.asList("YELLOW", "VIOLET")), Boolean.TRUE));
		stns.add(new MetroStation("stn-47", "Udyog Bhawan", null, null, "YELLOW"));
		stns.add(new MetroStation("stn-48", "Lok Kalyan Marg", null, Arrays.asList("Lodhi Gardens"), "YELLOW"));
		stns.add(new MetroStation("stn-49", "Jorbagh", null, Arrays.asList("Safdarjung Tomb"), "YELLOW"));
		stns.add(new MetroStation("stn-50", "Dilli Haat INA", null, null,
				new HashSet<>(Arrays.asList("YELLOW", "PINK")), Boolean.TRUE));
		stns.add(new MetroStation("stn-51", "AIIMS", null, null, "YELLOW"));
		stns.add(new MetroStation("stn-52", "Green Park", null, null, "YELLOW"));
		stns.add(new MetroStation("stn-53", "Hauz Khas", null, null, new HashSet<>(Arrays.asList("YELLOW", "MAGENTA")),
				Boolean.TRUE));
		stns.add(new MetroStation("stn-54", "Malviya Nagar", null, null, "YELLOW"));
		stns.add(new MetroStation("stn-55", "Saket", null, null, "YELLOW"));
		stns.add(new MetroStation("stn-56", "Qutab Minar", null, Arrays.asList("Qutab Minar"), "YELLOW"));
		stns.add(new MetroStation("stn-57", "Chhattarpur", null, Arrays.asList("Chhattarpur Temple"), "YELLOW"));
		stns.add(new MetroStation("stn-58", "Sultanpur", null, null, "YELLOW"));
		stns.add(new MetroStation("stn-59", "Ghitorni", null, null, "YELLOW"));
		stns.add(new MetroStation("stn-60", "Arjan Garh", null, null, "YELLOW"));
		stns.add(new MetroStation("stn-61", "Guru Dronacharya", null, null, "YELLOW"));
		stns.add(new MetroStation("stn-62", "Sikandarpur", null, null, new HashSet<>(Arrays.asList("YELLOW", "RAPID")),
				Boolean.TRUE));
		stns.add(new MetroStation("stn-63", "MG Road", null, null, "YELLOW"));
		stns.add(new MetroStation("stn-64", "IFFCO Chowk", null, null, "YELLOW"));
		stns.add(new MetroStation("stn-65", "Huda City Centre", null, null, "YELLOW"));
	}

	public static void populateRedRouteData() {

		List<RouteDetail> routeDetails = new ArrayList<>();

		routeDetails.add(new RouteDetail("stn-1", 1, 0f));
		routeDetails.add(new RouteDetail("stn-2", 2, 1.0f));
		routeDetails.add(new RouteDetail("stn-3", 3, 2.5f));
		routeDetails.add(new RouteDetail("stn-4", 4, 3.2f));
		routeDetails.add(new RouteDetail("stn-5", 5, 4.5f));
		routeDetails.add(new RouteDetail("stn-6", 6, 5.7f));
		routeDetails.add(new RouteDetail("stn-7", 7, 6.9f));
		routeDetails.add(new RouteDetail("stn-8", 8, 8.2f));
		routeDetails.add(new RouteDetail("stn-9", 9, 9.4f));
		routeDetails.add(new RouteDetail("stn-10", 10, 10.3f));
		routeDetails.add(new RouteDetail("stn-11", 11, 11.4f));
		routeDetails.add(new RouteDetail("stn-12", 12, 12.5f));
		routeDetails.add(new RouteDetail("stn-13", 13, 13.7f));
		routeDetails.add(new RouteDetail("stn-14", 14, 14.8f));
		routeDetails.add(new RouteDetail("stn-15", 15, 16.4f));
		routeDetails.add(new RouteDetail("stn-16", 16, 18.5f));
		routeDetails.add(new RouteDetail("stn-17", 17, 19.7f));
		routeDetails.add(new RouteDetail("stn-18", 18, 20.6f));
		routeDetails.add(new RouteDetail("stn-19", 19, 21.4f));
		routeDetails.add(new RouteDetail("stn-20", 20, 23.1f));
		routeDetails.add(new RouteDetail("stn-21", 21, 24.3f));
		routeDetails.add(new RouteDetail("stn-22", 22, 25.5f));
		routeDetails.add(new RouteDetail("stn-23", 23, 26.2f));
		routeDetails.add(new RouteDetail("stn-24", 24, 27.4f));
		routeDetails.add(new RouteDetail("stn-25", 25, 28.6f));
		routeDetails.add(new RouteDetail("stn-26", 26, 29.6f));
		routeDetails.add(new RouteDetail("stn-27", 27, 30.4f));
		routeDetails.add(new RouteDetail("stn-28", 28, 31.7f));
		routeDetails.add(new RouteDetail("stn-29", 29, 32.7f));

		
		List<MetroStation> redStns = stns.stream().filter(stn -> stn.getColorLines().contains("RED"))
				.collect(Collectors.toList());
		metroRouteList.add(new MetroRoute("route-red-1", "RED", "stn-1", "stn-29", redStns, routeDetails));
	}

	public static void populateYellowRouteData() {

		List<RouteDetail> routeDetails = new ArrayList<>();

		routeDetails.add(new RouteDetail("stn-30", 1, 0f));
		routeDetails.add(new RouteDetail("stn-31", 2, 0.8f));
		routeDetails.add(new RouteDetail("stn-32", 3, 2.1f));
		routeDetails.add(new RouteDetail("stn-33", 4, 3.4f));
		routeDetails.add(new RouteDetail("stn-34", 5, 4.7f));
		routeDetails.add(new RouteDetail("stn-35", 6, 6.2f));
		routeDetails.add(new RouteDetail("stn-36", 7, 7.6f));
		routeDetails.add(new RouteDetail("stn-37", 8, 9f));
		routeDetails.add(new RouteDetail("stn-38", 9, 9.8f));
		routeDetails.add(new RouteDetail("stn-39", 10, 10.8f));
		routeDetails.add(new RouteDetail("stn-40", 11, 12.1f));
		routeDetails.add(new RouteDetail("stn-41", 12, 13.2f));
		routeDetails.add(new RouteDetail("stn-42", 13, 14.3f));
		routeDetails.add(new RouteDetail("stn-43", 14, 15.3f));
		routeDetails.add(new RouteDetail("stn-44", 15, 16.1f));
		routeDetails.add(new RouteDetail("stn-45", 16, 17.2f));
		routeDetails.add(new RouteDetail("stn-46", 17, 18.5f));
		routeDetails.add(new RouteDetail("stn-47", 18, 19.4f));
		routeDetails.add(new RouteDetail("stn-48", 19, 19.7f));
		routeDetails.add(new RouteDetail("stn-49", 21, 21.3f));
		routeDetails.add(new RouteDetail("stn-50", 22, 22.5f));
		routeDetails.add(new RouteDetail("stn-51", 23, 23.8f));
		routeDetails.add(new RouteDetail("stn-52", 24, 24.6f));
		routeDetails.add(new RouteDetail("stn-53", 25, 25.6f));
		routeDetails.add(new RouteDetail("stn-54", 26, 27.4f));
		routeDetails.add(new RouteDetail("stn-55", 27, 29.1f));
		routeDetails.add(new RouteDetail("stn-56", 28, 30f));
		routeDetails.add(new RouteDetail("stn-57", 29, 31.7f));
		routeDetails.add(new RouteDetail("stn-58", 30, 33f));
		routeDetails.add(new RouteDetail("stn-59", 31, 34.6f));
		routeDetails.add(new RouteDetail("stn-60", 32, 35.9f));
		routeDetails.add(new RouteDetail("stn-61", 33, 38.6f));
		routeDetails.add(new RouteDetail("stn-62", 34, 40.9f));
		routeDetails.add(new RouteDetail("stn-63", 35, 41.9f));
		routeDetails.add(new RouteDetail("stn-64", 36, 44.2f));
		routeDetails.add(new RouteDetail("stn-65", 37, 45.7f));

		List<MetroStation> yellowStns = stns.stream().filter(stn -> stn.getColorLines().contains("YELLOW"))
				.collect(Collectors.toList());
		metroRouteList
				.add(new MetroRoute("route-yellow-1", "Yellow", "stn-30", "stn-65", yellowStns, routeDetails));
	}
}
