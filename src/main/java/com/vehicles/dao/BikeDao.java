package com.vehicles.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vehicles.entity.Bike;
import com.vehicles.repository.BikeRepository;

@Repository
public class BikeDao {
	@Autowired
	BikeRepository ef;

	public String setData(Bike b) {
		ef.save(b);
		return "save successfully";
	}

	public String setDat(List<Bike> c) {
		ef.saveAll(c);
		return "list save succcessfully";
	}

	public String setDa(Bike d) {
		ef.save(d);
		return "update successfully";
	}

	public Bike setD(int id) {

		return ef.findById(id).get();
	}

	public List<Bike> getDetails() {
		return ef.findAll();
	}

	public List<Bike> getBikeByName(String x) {

		return ef.getBikeByName(x);
	}

	public List<Bike> getBikeByYear(int y) {

		return ef.getBikeByYear(y);
	}

	public List<Bike> getBikeByColorPrice(String a, int b) {

		return ef.getBikeByColorPrice(a, b);
	}

	public List<Bike> getBikeByPrice(int a) {

		return ef.getBikeByPrice(a);
	}

	public List<Bike> getBikeBybrand(String a) {

		return ef.getBikeBybrand(a);
	}

	public List<Bike> getBikeByMax() {

		return ef.getBikeByMax();
	}

	public List<Bike> getBikeByMin() {

		return ef.getBikeByMin();
	}

}
