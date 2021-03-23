package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	private Dao_interface dao_interface;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		Owner owner = dao_interface.findByUsername(username);
		if (owner == null)
			throw new UsernameNotFoundException("User 404");

		return new UserPrincipal(owner);
	}

}
