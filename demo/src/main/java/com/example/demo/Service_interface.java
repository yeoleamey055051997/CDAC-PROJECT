package com.example.demo;

import java.util.HashMap;
import java.util.List;

public interface Service_interface {

	boolean login_function(Owner owner);

	boolean insert_function(Parking_details parking_details);

	List<Parking_details> selectall();

	boolean delete_function(Parking_details parking_details);

	List<Two_w> selectall1();

	void booking_conferm(Conferm_two_wheeler conferm_two_wheeler);

	void change_status(Two_w two_w);

	boolean checkout_function(Conferm_two_wheeler conferm_two_wheeler);

	HashMap<String, String> billing_function(Conferm_two_wheeler conferm_two_wheeler);

	List<Four_w> selectall2();

	void booking_confermfor4(Conferm_four_wheeler conferm_four_wheeler);

	void change_statusfor4(Four_w four_w);

	boolean checkoutfor4_function(Conferm_four_wheeler conferm_four_wheeler);

	HashMap<String, String> billing_functionfor4(Conferm_four_wheeler conferm_four_wheeler);

	

}
