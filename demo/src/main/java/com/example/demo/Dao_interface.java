package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Dao_interface extends JpaRepository<Owner, Integer> {
	Owner findByUsername(String username);

}
