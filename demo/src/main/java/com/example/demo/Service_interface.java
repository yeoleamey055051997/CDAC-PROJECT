package com.example.demo;

import java.util.HashMap;
import java.util.List;

public interface Service_interface {

	List<Two_w> selectall1();

	boolean insert_function_2(Two_w two_w);

	boolean delete_function_2(Two_w two_w);

	void booking_conferm(Conferm_two_wheeler conferm_two_wheeler);

	boolean checkout_function(Conferm_two_wheeler conferm_two_wheeler);

	HashMap<String, String> billing_function(Conferm_two_wheeler conferm_two_wheeler);

	void change_status(Two_w two_w);

	////////////////////////////////////////////////////////////////////////////////////////

	List<Four_w> selectall2();

	boolean insert_function_4(Four_w four_w);

	boolean delete_function_4(Four_w four_w);

	void booking_confermfor4(Conferm_four_wheeler conferm_four_wheeler);

	boolean checkoutfor4_function(Conferm_four_wheeler conferm_four_wheeler);

	HashMap<String, String> billing_functionfor4(Conferm_four_wheeler conferm_four_wheeler);

	void change_statusfor4(Four_w four_w);

	//////////////////////////////////////////////////////////////////////////////////////////

	boolean savesignup(Owner owner);

}
