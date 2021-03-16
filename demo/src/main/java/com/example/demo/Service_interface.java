package com.example.demo;

import java.util.List;

public interface Service_interface {

	boolean login_function(Owner owner);

	boolean insert_function(Parking_details parking_details);

	List<Parking_details> selectall();

	boolean delete_function(Parking_details parking_details);

	List<Two_w> selectall1();

	void booking_conferm(Conferm_two_wheeler conferm_two_wheeler);

	void change_status(Two_w two_w);

	

}
