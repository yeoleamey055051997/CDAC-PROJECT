package com.example.demo;

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
		String str = "/After_login.jsp";
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
			str = "/After_login.jsp";
		} else {
			Exception e = null;
			e.printStackTrace();
		}
		return str;
	}
	
	@GetMapping("/checkin")
	public String checkin_function(Map<String, Object> m) {
		
		
		return "/Checkin.jsp";
	}
	
	@GetMapping("/checkout")
	public String checkout_function(Map<String, Object> m) {
		
		
		return "/Checkout.jsp";
	}
	
	@PostMapping("/submitcheckin")
	public String submitcheckin_function(Map<String, Object> m) {
		
		
		return "/index.jsp";
	}
	
	@PostMapping("/submitcheckout")
	public String submitcheckout_function(Map<String, Object> m) {
		
		
		return "/Bill.jsp";
	}
}
