package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Dao_interface1 extends JpaRepository<Parking_details, Integer>{

}
