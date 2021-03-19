package com.example.demo;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.HashMap;
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
		} else {
			m.put("key1", "User not found");
		}

		return str;

	}

	private String list_function(Map<String, Object> m) {

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
		if (result == true) {
			str = list_function(m);
		} else {
			str = "/Error.jsp";
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

	@GetMapping("/checkinfor4")
	public String checkinfor4_function(@RequestParam("id") String id1, @RequestParam("floar") String floar1,
			Map<String, Object> m) {

		Parking_details parking_details = new Parking_details(0, 0);
		parking_details = new Parking_details(Integer.parseInt(id1), Integer.parseInt(floar1));
		m.put("parking_details", parking_details);
		return "/WEB-INF/Booking/Checkinfor4.jsp";
	}

	@GetMapping("/checkout")
	public String checkout_function(@RequestParam("id") String id1, @RequestParam("floar") String floar1,
			Map<String, Object> m) {
		Parking_details parking_details = new Parking_details(0, 0);
		parking_details = new Parking_details(Integer.parseInt(id1), Integer.parseInt(floar1));
		m.put("parking_details", parking_details);
		return "/WEB-INF/Booking/Checkout.jsp";
	}

	@GetMapping("/checkoutfor4")
	public String checkoutfor4_function(@RequestParam("id") String id1, @RequestParam("floar") String floar1,
			Map<String, Object> m) {
		Parking_details parking_details = new Parking_details(0, 0);
		parking_details = new Parking_details(Integer.parseInt(id1), Integer.parseInt(floar1));
		m.put("parking_details", parking_details);
		return "/WEB-INF/Booking/Checkoutfor4.jsp";
	}

	@PostMapping("/submitcheckin")
	public String submitcheckin_function(@RequestParam("id") String id1, @RequestParam("floar") String floar1,
			@RequestParam("name") String name, @RequestParam("email") String email, Map<String, Object> m) {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		String dat = formatter.format(date);
		String date1 = dat.toString();
		Conferm_two_wheeler conferm_two_wheeler = new Conferm_two_wheeler(Integer.parseInt(id1),
				Integer.parseInt(floar1), name, email, date1);
		service_interface.booking_conferm(conferm_two_wheeler);
		Two_w two_w = new Two_w(Integer.parseInt(id1), Integer.parseInt(floar1), false);
		service_interface.change_status(two_w);
		return "/index.jsp";
	}

	@PostMapping("/submitcheckinfor4")
	public String submitcheckinfor4_function(@RequestParam("id") String id1, @RequestParam("floar") String floar1,
			@RequestParam("name") String name, @RequestParam("email") String email, Map<String, Object> m) {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		String dat = formatter.format(date);
		String date1 = dat.toString();
		Conferm_four_wheeler conferm_four_wheeler = new Conferm_four_wheeler(Integer.parseInt(id1),
				Integer.parseInt(floar1), name, email, date1);
		service_interface.booking_confermfor4(conferm_four_wheeler);
		Four_w four_w = new Four_w(Integer.parseInt(id1), Integer.parseInt(floar1), false);
		service_interface.change_statusfor4(four_w);
		return "/index.jsp";
	}

	@PostMapping("/submitcheckout")
	public String submitcheckout_function(@RequestParam("id") String id1, @RequestParam("floar") String floar1,
			@RequestParam("name") String name, @RequestParam("email") String email, Map<String, Object> m) {
		Conferm_two_wheeler conferm_two_wheeler = new Conferm_two_wheeler(Integer.parseInt(id1),
				Integer.parseInt(floar1), name, email);
		boolean result = false;
		String str = "/WEB-INF/Error.jsp";
		result = service_interface.checkout_function(conferm_two_wheeler);
		if (result == true) {
			HashMap<String, String> hm = new HashMap<String, String>();
			hm = service_interface.billing_function(conferm_two_wheeler);
			String date1 = hm.get("date1");
			String date2 = hm.get("date2");
			String bill = hm.get("bill");
			m.put("date1", date1);
			m.put("date2", date2);
			m.put("bill", bill);
			str = "/WEB-INF/Bill/Bill.jsp";
		}
		Two_w two_w = new Two_w(Integer.parseInt(id1), Integer.parseInt(floar1), true);
		service_interface.change_status(two_w);
		return str;
	}

	@PostMapping("/submitcheckoutfor4")
	public String submitcheckoutfor4_function(@RequestParam("id") String id1, @RequestParam("floar") String floar1,
			@RequestParam("name") String name, @RequestParam("email") String email, Map<String, Object> m) {
		Conferm_four_wheeler conferm_four_wheeler = new Conferm_four_wheeler(Integer.parseInt(id1),
				Integer.parseInt(floar1), name, email);
		boolean result = false;
		String str = "/WEB-INF/Error.jsp";
		result = service_interface.checkoutfor4_function(conferm_four_wheeler);
		if (result == true) {
			HashMap<String, String> hm = new HashMap<String, String>();
			hm = service_interface.billing_functionfor4(conferm_four_wheeler);
			String date1 = hm.get("date1");
			String date2 = hm.get("date2");
			String bill = hm.get("bill");
			m.put("date1", date1);
			m.put("date2", date2);
			m.put("bill", bill);
			str = "/WEB-INF/Bill/Bill.jsp";
		}
		Four_w four_w = new Four_w(Integer.parseInt(id1), Integer.parseInt(floar1), true);
		service_interface.change_statusfor4(four_w);
		return str;
	}

	@GetMapping("/Two_w_book")
	public String two_w_booking_function(Map<String, Object> m) {

		List<Two_w> listall1 = service_interface.selectall1();
		m.put("listall1", listall1);
		// return "/Two_w_booking.jsp";
		return "/WEB-INF/Booking_view_page/Two_w_booking.jsp";
	}

	@GetMapping("/Four_w_booking")
	public String four_w_booking_function(Map<String, Object> m) {

		List<Four_w> listall2 = service_interface.selectall2();
		System.out.println("Four_w_booking");
		m.put("listall2", listall2);
		return "/WEB-INF/Booking_view_page/Four_w_booking.jsp";
	}

}
