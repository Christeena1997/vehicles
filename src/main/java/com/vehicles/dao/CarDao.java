package com.vehicles.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vehicles.entity.Car;
import com.vehicles.repository.CarRepository;

@Repository
public class CarDao {
	@Autowired
	CarRepository cr;

	public String getlist(List<Car> a) {
		cr.saveAll(a);
		return "save a list successfully";
	}

	public Car getleo(int a) {
		return cr.findById(a).get();

	}

	public List<Car> getlong() {

		return cr.findAll();
	}

	public String getlong(List<Car> i) {
		cr.saveAll(i);
		return "save successfully";
	}

}
