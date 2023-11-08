package com.vehicles.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicles.dao.BikeDao;
import com.vehicles.entity.Bike;

@Service
public class BikeService {
	@Autowired
	BikeDao el;

	public String setData(Bike b) {

		return el.setData(b);
	}

	public String setDat(List<Bike> c) {

		return el.setDat(c);
	}

	public String setDa(Bike d) {

		return el.setDa(d);
	}

	public Bike setD(int id) {

		return el.setD(id);
	}

	public List<Bike> getYear(int a, int b) {
		List<Bike> c = el.getDetails();
		List<Bike> i = c.stream().filter(l -> l.getYear() > a && l.getYear() <= b).collect(Collectors.toList());
		return i;
	}

	public List<Bike> getBrand(String a) {
		List<Bike> d = el.getDetails();
		List<Bike> i = d.stream().filter(h -> h.getBrand().equals(a)).collect(Collectors.toList());
		return i;
	}

	public List<Bike> getBikeByName(String x) {

		return el.getBikeByName(x);
	}

	public List<Bike> getBikeByYear(int y) {

		return el.getBikeByYear(y);
	}

	public List<Bike> getBikeByColorPrice(String a, int b) {

		return el.getBikeByColorPrice(a, b);
	}

	public List<Bike> getBikeByPrice(int a) {

		return el.getBikeByPrice(a);
	}

	public List<Bike> getBikeBybrand(String a) {

		return el.getBikeBybrand(a);
	}

	public List<Bike> getBikeByMax() {

		return el.getBikeByMax();
	}

	public List<Bike> getBikeByMin() {

		return el.getBikeByMin();
	}

	

}
