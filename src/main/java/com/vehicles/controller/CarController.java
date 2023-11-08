package com.vehicles.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vehicles.entity.Car;
import com.vehicles.exception.TypeNotValidException;
import com.vehicles.service.CarService;

@RestController
@RequestMapping(value = "/admin")
public class CarController {
	@Autowired
	CarService cs;

	@PostMapping(value = "/list")
	public String getlist(@RequestBody List<Car> a) {
		return cs.getlist(a);
	}

	@GetMapping(value = "/leo/{a}")
	public Car getleo(@PathVariable int a) {
		return cs.getleo(a);
	}

	@GetMapping(value = "/long")
	public List<Car> getlong() {
		return cs.getlong();
	}

	@PostMapping(value = "/len")
	public String getlen(@RequestBody List<Car> a) throws TypeNotValidException {
		return cs.getlen(a);
	}
}
