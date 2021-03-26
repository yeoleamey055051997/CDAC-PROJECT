package com.example.demo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Controller_ {

	@Autowired // if problem happned remove this static word
	private Service_interface service_interface;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
//////////////////////////////////////////////////////////////////////////

	@RequestMapping("/addslots")
	public String addslots(Map<String, Object> m) {
		return "/WEB-INF/Messages/showpage.jsp";

	}

/////////////////////////////////////////////////////////////////////////// Controllers for two wheeler booking

	// from /WEB-INF/Messages/showpage.jsp
	@RequestMapping("/show2")
	public String show2(Map<String, Object> m) {
		String str = "/WEB-INF/Messages/Error.jsp";
		str = list_function_for_2(m);
		return str;

	}

	private String list_function_for_2(Map<String, Object> m) {

		String str = "/WEB-INF/Slot_addition_view_page/slot_add_2.jsp";
		List<Two_w> listall = service_interface.selectall1();
		m.put("listall", listall);
		return str;
	}

	// from /WEB-INF/Slot_addition_view_page/slot_add_2.jsp
	@PostMapping("/insert_2")
	public String insert_function_2(@RequestParam("id") String id, @RequestParam("floar") String floar,
			@RequestParam("por") String x, Map<String, Object> m) {
		String str = "/WEB-INF/Messages/Error.jsp";
		Two_w two_w = new Two_w(Integer.parseInt(id), Integer.parseInt(floar), true);
		boolean result = service_interface.insert_function_2(two_w);
		if (result == true)
			str = list_function_for_2(m);
		return str;
	}

	// from /WEB-INF/Slot_addition_view_page/slot_add_2.jsp
	@GetMapping("/delete_2")
	public String delete_function_2(@RequestParam("id") String id, Map<String, Object> m) {
		String str = "/WEB-INF/Messages/Error.jsp";
		Two_w two_w = new Two_w(Integer.parseInt(id));
		boolean result = service_interface.delete_function_2(two_w);
		if (result == true) {
			str = list_function_for_2(m);
		}
		return "/message";
	}

	@RequestMapping("/message")
	public String message() {
		return "/WEB-INF/Messages/delete_message_2.jsp";
	}

	// From index.jsp
	@GetMapping("/Two_w_book")
	public String two_w_booking_function(Map<String, Object> m) {

		List<Two_w> listall1 = service_interface.selectall1();
		m.put("listall1", listall1);
		return "/WEB-INF/Booking_view_page/Two_w_booking.jsp";
	}

	// From "/WEB-INF/Booking_view_page/Two_w_booking.jsp";
	@GetMapping("/checkin")
	public String checkin_function(@RequestParam("id") String id1, @RequestParam("floar") String floar1,
			Map<String, Object> m) {

		Two_w two_w = new Two_w(0, 0);
		two_w = new Two_w(Integer.parseInt(id1), Integer.parseInt(floar1));
		m.put("two_w", two_w);
		return "/WEB-INF/Booking/Checkin.jsp";
	}

	// From "/WEB-INF/Booking/Checkin.jsp";
	@PostMapping("/submitcheckin")
	public String submitcheckin_function(@RequestParam("id") String id1, @RequestParam("floar") String floar1,
			@RequestParam("name") String name, @RequestParam("email") String email, Map<String, Object> m) {
		String str = "/WEB-INF/Messages/Error.jsp";
		try {
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			Date date = new Date();
			String dat = formatter.format(date);
			String date1 = dat.toString();
			Conferm_two_wheeler conferm_two_wheeler = new Conferm_two_wheeler(Integer.parseInt(id1),
					Integer.parseInt(floar1), name, email, date1);
			service_interface.booking_conferm(conferm_two_wheeler);
			Two_w two_w = new Two_w(Integer.parseInt(id1), Integer.parseInt(floar1), false);
			service_interface.change_status(two_w);
			str = "/index.jsp";
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return str;
	}

	// From "/WEB-INF/Booking_view_page/Two_w_booking.jsp";
	@GetMapping("/checkout")
	public String checkout_function(@RequestParam("id") String id1, @RequestParam("floar") String floar1,
			Map<String, Object> m) {
		Two_w two_w = new Two_w(0, 0);
		two_w = new Two_w(Integer.parseInt(id1), Integer.parseInt(floar1));
		m.put("two_w", two_w);
		return "/WEB-INF/Booking/Checkout.jsp";
	}

	// From "/WEB-INF/Booking/Checkout.jsp";
	@PostMapping("/submitcheckout")
	public String submitcheckout_function(@RequestParam("id") String id1, @RequestParam("floar") String floar1,
			@RequestParam("name") String name, @RequestParam("email") String email, Map<String, Object> m) {
		Conferm_two_wheeler conferm_two_wheeler = new Conferm_two_wheeler(Integer.parseInt(id1),
				Integer.parseInt(floar1), name, email);
		boolean result = false;
		String str = "/WEB-INF/Messages/message1_2.jsp";
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
			m.put("name", name);
			m.put("email", email);
			str = "/WEB-INF/Bill/Bill.jsp";
			Two_w two_w = new Two_w(Integer.parseInt(id1), Integer.parseInt(floar1), true);
			service_interface.change_status(two_w);
		}

		return str;
	}

////////////////////////////////////////////////////////////// Controllers for four wheeler booking

	// from /WEB-INF/Messages/showpage.jsp
	@RequestMapping("/show4")
	public String show4(Map<String, Object> m) {
		String str = "/WEB-INF/Messages/Error.jsp";
		str = list_function_for_4(m);
		return str;

	}

	private String list_function_for_4(Map<String, Object> m) {

		String str = "/WEB-INF/Slot_addition_view_page/slot_add_4.jsp";
		List<Four_w> listall = service_interface.selectall2();
		m.put("listall", listall);
		return str;
	}

	// from /WEB-INF/Slot_addition_view_page/slot_add_4.jsp
	@PostMapping("/insert_4")
	public String insert_function_4(@RequestParam("id") String id, @RequestParam("floar") String floar,
			@RequestParam("por") String x, Map<String, Object> m) {
		String str = "/WEB-INF/Messages/Error.jsp";
		Four_w four_w = new Four_w(Integer.parseInt(id), Integer.parseInt(floar), true);
		boolean result = service_interface.insert_function_4(four_w);
		if (result == true) {
			str = list_function_for_4(m);
		}
		return str;
	}

	// from /WEB-INF/Slot_addition_view_page/slot_add_4.jsp
	@GetMapping("/delete_4")
	public String delete_function_4(@RequestParam("id") String id, Map<String, Object> m) {
		String str = "/WEB-INF/Messages/Error.jsp";
		Four_w four_w = new Four_w(Integer.parseInt(id));
		boolean result = service_interface.delete_function_4(four_w);
		if (result == true) {
			str = list_function_for_4(m);
		}
		return "/message_4";
	}

	@RequestMapping("/message_4")
	public String message_4() {
		return "/WEB-INF/Messages/delete_message_4.jsp";
	}

	// From index.jsp
	@GetMapping("/Four_w_booking")
	public String four_w_booking_function(Map<String, Object> m) {

		List<Four_w> listall2 = service_interface.selectall2();
		System.out.println("Four_w_booking");
		m.put("listall2", listall2);
		return "/WEB-INF/Booking_view_page/Four_w_booking.jsp";
	}

	// From /WEB-INF/Booking_view_page/Four_w_booking.jsp";
	@GetMapping("/checkinfor4")
	public String checkinfor4_function(@RequestParam("id") String id1, @RequestParam("floar") String floar1,
			Map<String, Object> m) {

		Four_w four_w = new Four_w(0, 0);
		four_w = new Four_w(Integer.parseInt(id1), Integer.parseInt(floar1));
		m.put("four_w", four_w);
		return "/WEB-INF/Booking/Checkinfor4.jsp";
	}

	// From /WEB-INF/Booking/Checkinfor4.jsp";
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

	// From /WEB-INF/Booking_view_page/Four_w_booking.jsp";
	@GetMapping("/checkoutfor4")
	public String checkoutfor4_function(@RequestParam("id") String id1, @RequestParam("floar") String floar1,
			Map<String, Object> m) {
		Four_w four_w = new Four_w(0, 0);
		four_w = new Four_w(Integer.parseInt(id1), Integer.parseInt(floar1));
		m.put("four_w", four_w);
		return "/WEB-INF/Booking/Checkoutfor4.jsp";
	}

	// From /WEB-INF/Booking/Checkoutfor4.jsp";
	@PostMapping("/submitcheckoutfor4")
	public String submitcheckoutfor4_function(@RequestParam("id") String id1, @RequestParam("floar") String floar1,
			@RequestParam("name") String name, @RequestParam("email") String email, Map<String, Object> m) {
		Conferm_four_wheeler conferm_four_wheeler = new Conferm_four_wheeler(Integer.parseInt(id1),
				Integer.parseInt(floar1), name, email);
		boolean result = false;
		String str = "/WEB-INF/Messages/Error.jsp";
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
			m.put("name", name);
			m.put("email", email);
			str = "/WEB-INF/Bill/Bill.jsp";
			Four_w four_w = new Four_w(Integer.parseInt(id1), Integer.parseInt(floar1), true);
			service_interface.change_statusfor4(four_w);
		}

		return str;
	}

///////////////////////////////////////////////////////////////////////////

	// Login related
	@PostMapping("/action_page")
	public String signup(@RequestParam("name") String name, @RequestParam("email") String email,
			@RequestParam("password") String password) {
		String str = "/WEB-INF/Messages/Error.jsp";
		Owner owner = new Owner(name, bCryptPasswordEncoder.encode(password), email);
		boolean result = service_interface.savesignup(owner);
		if (result == true) {
			str = "/WEB-INF/Messages/message2.jsp";
		}
		return str;
	}

	// Spring security related

	@RequestMapping("/index")
	public String index() {
		return "index.jsp";
	}

	@RequestMapping("/login")
	public String loginPage() {
		return "login.jsp";
	}

	@RequestMapping("/logout-success")
	public String logoutPage() {
		return "index.jsp";
	}

	@RequestMapping("/Signup")
	public String signup() {
		return "signup.jsp";
	}

}
