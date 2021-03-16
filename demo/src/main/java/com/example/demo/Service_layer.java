package com.example.demo;

import java.util.Date;
import java.util.List;
import java.util.Optional;

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
	
	
}
