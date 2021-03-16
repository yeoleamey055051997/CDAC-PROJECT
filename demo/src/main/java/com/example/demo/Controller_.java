package com.example.demo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Controller_ {

	@Autowired // if problem happned remove this static word
	private Service_interface service_interface;

	@GetMapping("/login")
	public String login_function(@RequestParam("username") String username, @RequestParam("password") String password,
			@RequestParam("por") String x, Map<String, Object> m) {
		String str = "/login.jsp";
		Owner owner = new Owner(username, password);
		boolean result = service_interface.login_function(owner);
		if (result == true) {
			// str = "/After_login.jsp";
			str = list_function(m);
			System.out.println(str);
		} else {
			m.put("key1", "User not found");
		}

		return str;

	}

	private String list_function(Map<String, Object> m) {

		// String str = "/vakanda.jsp";
		String str = "/WEB-INF/After_login.jsp";
		List<Parking_details> listall = service_interface.selectall();
		m.put("listall", listall);

		return str;
	}

	@PostMapping("/insert")
	public String insert_function(@RequestParam("id") String id, @RequestParam("floar") String floar,
			@RequestParam("vehicle_type") String vehicle_type, @RequestParam("capacity") String capacity,
			@RequestParam("por") String x, Map<String, Object> m) {
		String str = "/vakanda.html";
		Parking_details parking_details = new Parking_details(Integer.parseInt(id), Integer.parseInt(floar),
				vehicle_type, Integer.parseInt(capacity));
		boolean result = service_interface.insert_function(parking_details);
		System.out.println(result);
		if (result == true) {
			str = "/confermation_page.jsp";
		} else {
			str = "/Failure_page.jsp";
		}

		return str;
	}

	@GetMapping("/delete")
	public String delete_function(@RequestParam("id") String id, Map<String, Object> m) {
		System.out.println("delete coing");
		String str = "/vakanda.jsp";
		Parking_details parking_details = new Parking_details(Integer.parseInt(id));
		// Parking_details parking_details = new Parking_details(id);
		boolean result = service_interface.delete_function(parking_details);
		if (result == true) {
			str = list_function(m);
			str = "/WEB-INF/After_login.jsp";
		} else {
			Exception e = null;
			e.printStackTrace();
		}
		return str;
	}

	@GetMapping("/checkin")
	public String checkin_function(@RequestParam("id") String id1, @RequestParam("floar") String floar1,
			Map<String, Object> m) {

		Parking_details parking_details = new Parking_details(0, 0);
		parking_details = new Parking_details(Integer.parseInt(id1), Integer.parseInt(floar1));
		m.put("parking_details", parking_details);
		return "/WEB-INF/Booking/Checkin.jsp";
	}

	@GetMapping("/checkout")
	public String checkout_function(@RequestParam("id") String id1, @RequestParam("floar") String floar1,
			Map<String, Object> m) {
		Parking_details parking_details = new Parking_details(0, 0);
		parking_details = new Parking_details(Integer.parseInt(id1), Integer.parseInt(floar1));
		m.put("parking_details", parking_details);
		return "/WEB-INF/Booking/Checkout.jsp";
	}

	@PostMapping("/submitcheckin")
	public String submitcheckin_function(@RequestParam("id") String id1, @RequestParam("floar") String floar1,
			@RequestParam("name") String name, @RequestParam("email") String email, Map<String, Object> m) {
		// Parking_details parking_details = new Parking_details(0, 0);
		// parking_details = new Parking_details(Integer.parseInt(id1),
		// Integer.parseInt(floar1));
		LocalDate date = java.time.LocalDate.now();
		String date1 = date.toString();
		LocalTime time = java.time.LocalTime.now();
		String time1 = time.toString();
		Conferm_two_wheeler conferm_two_wheeler = new Conferm_two_wheeler(Integer.parseInt(id1),
				Integer.parseInt(floar1), name, email, date1, time1);
		service_interface.booking_conferm(conferm_two_wheeler);
		Two_w two_w = new Two_w(Integer.parseInt(id1), Integer.parseInt(floar1), false);
		service_interface.change_status(two_w);
		return "/index.jsp";
	}

	@PostMapping("/submitcheckout")
	public String submitcheckout_function(Map<String, Object> m) {

		return "/WEB-INF/Bill/Bill.jsp";
	}

	@GetMapping("/Two_w_book")
	public String two_w_booking_function(Map<String, Object> m) {

		List<Two_w> listall1 = service_interface.selectall1();
		System.out.println("Two_w_booking");
		m.put("listall1", listall1);
		return "/Two_w_booking.jsp";
	}
}
