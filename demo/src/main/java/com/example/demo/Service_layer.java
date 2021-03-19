package com.example.demo;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import javax.naming.spi.DirStateFactory.Result;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Service_layer implements Service_interface {

	@Autowired
	private Dao_interface dao_interface;

	@Autowired
	private Dao_interface1 dao_interface1;

	@Autowired
	private Dao_interface2 dao_interface2;

	@Autowired
	private Dao_interface3 dao_interface3;

	@Autowired
	private Dao_interface4 dao_interface4;

	@Autowired
	private Dao_interface5 dao_interface5;

	@Override
	public boolean login_function(Owner owner) {
		boolean result = false;
		try {
			String username = owner.getUsername();
			String passward = owner.getPassword();
			Optional<Owner> owner1 = dao_interface.findById(username);
			if (owner1.isPresent()) {
				owner = owner1.get();
				if (owner.getPassword().equals(passward)) {
					result = true;
				}
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public boolean insert_function(Parking_details parking_details) {
		boolean result = false;
		try {
			dao_interface1.save(parking_details);
			result = true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public List<Parking_details> selectall() {
		List<Parking_details> listofall = dao_interface1.findAll();
		return listofall;
	}

	@Override
	public boolean delete_function(Parking_details parking_details) {

		boolean result = false;
		try {
			dao_interface1.deleteById(parking_details.getId());
			result = true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public List<Two_w> selectall1() {
		List<Two_w> listall1 = dao_interface2.findAll();
		return listall1;
	}

	@Override
	public void booking_conferm(Conferm_two_wheeler conferm_two_wheeler) {
		// TODO Auto-generated method stub
		dao_interface3.save(conferm_two_wheeler);
	}

	@Override
	public void change_status(Two_w two_w) {
		// TODO Auto-generated method stub
		dao_interface2.save(two_w);
	}

	@Override
	public boolean checkout_function(Conferm_two_wheeler conferm_two_wheeler) {
		// TODO Auto-generated method stub
		boolean result = false;
		int id = conferm_two_wheeler.id;
		int floar = conferm_two_wheeler.floar;
		String name = conferm_two_wheeler.name;
		String email = conferm_two_wheeler.email;
		String date1 = null;
		conferm_two_wheeler = new Conferm_two_wheeler(id, floar, name, email, date1);
		conferm_two_wheeler = dao_interface3.getOne(id);

		if (name.equalsIgnoreCase(conferm_two_wheeler.getName())
				&& email.equalsIgnoreCase(conferm_two_wheeler.getEmail())) {
			result = true;
		}

		return result;
	}

	@Override
	public HashMap<String, String> billing_function(Conferm_two_wheeler conferm_two_wheeler) {
		Conferm_two_wheeler conferm_two_wheeler1 = new Conferm_two_wheeler(0, 0, "", "", "");
		conferm_two_wheeler1 = dao_interface3.getOne(conferm_two_wheeler.id);
		HashMap<String, String> hm = new HashMap<String, String>();
		try {
			String date1 = conferm_two_wheeler1.getDate1();
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			Date date = new Date();
			String dat = formatter.format(date);
			String date2 = dat.toString();
			String format = "dd/MM/yyyy HH:mm:ss";
			SimpleDateFormat sdf = new SimpleDateFormat(format);
			Date dateObj1 = sdf.parse(date1);
			Date dateObj2 = sdf.parse(date2);
			//DecimalFormat crunchifyFormatter = new DecimalFormat("###,###");
			long diff = dateObj2.getTime() - dateObj1.getTime();
			int diffmin = (int) (diff / (60 * 1000));
			// System.out.println("difference between minutues: " +
			// crunchifyFormatter.format(diffmin));
			//int bil = (int) (Integer.parseInt(crunchifyFormatter.format(diffmin)) * 0.03);
			int bil =  (int) (diffmin * 0.03);
			String bill = String.valueOf(bil);

			hm.put("date1", date1);
			hm.put("date2", date2);
			hm.put("bill", bill);

		} catch (ParseException e) {
			e.printStackTrace();
		}

		return hm;
	}

	@Override
	public List<Four_w> selectall2() {
		List<Four_w> listall2 = dao_interface4.findAll();
		return listall2;
	}

	@Override
	public void booking_confermfor4(Conferm_four_wheeler conferm_four_wheeler) {
		dao_interface5.save(conferm_four_wheeler);

	}

	@Override
	public void change_statusfor4(Four_w four_w) {
		dao_interface4.save(four_w);

	}

	@Override
	public boolean checkoutfor4_function(Conferm_four_wheeler conferm_four_wheeler) {
		boolean result = false;
		int id = conferm_four_wheeler.id;
		int floar = conferm_four_wheeler.floar;
		String name = conferm_four_wheeler.name;
		String email = conferm_four_wheeler.email;
		String date1 = null;
		conferm_four_wheeler = new Conferm_four_wheeler(id, floar, name, email, date1);
		conferm_four_wheeler = dao_interface5.getOne(id);

		if (name.equalsIgnoreCase(conferm_four_wheeler.getName())
				&& email.equalsIgnoreCase(conferm_four_wheeler.getEmail())) {
			result = true;
		}

		return result;
	}

	@Override
	public HashMap<String, String> billing_functionfor4(Conferm_four_wheeler conferm_four_wheeler) {
		Conferm_four_wheeler conferm_four_wheeler1 = new Conferm_four_wheeler(0, 0, "", "", "");
		conferm_four_wheeler1 = dao_interface5.getOne(conferm_four_wheeler.id);
		HashMap<String, String> hm = new HashMap<String, String>();
		try {
			String date1 = conferm_four_wheeler1.getDate1();
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			Date date = new Date();
			String dat = formatter.format(date);
			String date2 = dat.toString();
			String format = "dd/MM/yyyy HH:mm:ss";
			SimpleDateFormat sdf = new SimpleDateFormat(format);
			Date dateObj1 = sdf.parse(date1);
			Date dateObj2 = sdf.parse(date2);
			//DecimalFormat crunchifyFormatter = new DecimalFormat("###,###");
			long diff = dateObj2.getTime() - dateObj1.getTime();
			int diffmin = (int) (diff / (60 * 1000));
			// System.out.println("difference between minutues: " +
			// crunchifyFormatter.format(diffmin));
			//int bil = (int) (Integer.parseInt(crunchifyFormatter.format(diffmin)) * 0.03);
			int bil = (int) (diffmin * 0.03);
			String bill = String.valueOf(bil);

			hm.put("date1", date1);
			hm.put("date2", date2);
			hm.put("bill", bill);

		} catch (ParseException e) {
			e.printStackTrace();
		}

		return hm;
	}

}
