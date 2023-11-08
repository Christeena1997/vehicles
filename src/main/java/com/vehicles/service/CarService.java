package com.vehicles.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicles.dao.CarDao;
import com.vehicles.entity.Car;
import com.vehicles.exception.TypeNotValidException;

@Service
public class CarService {
	@Autowired
	CarDao cd;

	public String getlist(List<Car> a) {

		return cd.getlist(a);
	}

	public Car getleo(int a) {

		return cd.getleo(a);
	}

	public List<Car> getlong() {

		return cd.getlong();
	}

	public String getlen(List<Car> a) throws TypeNotValidException {

		List<Car> i = a.stream().filter(l -> l.getType().equals("diseal")).collect(Collectors.toList());

		if (i.isEmpty()) {
			throw new TypeNotValidException("not valid type");
		}
		return cd.getlong(i);

	}
}
