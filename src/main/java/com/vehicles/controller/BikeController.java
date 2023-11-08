
package com.vehicles.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vehicles.entity.Bike;
import com.vehicles.service.BikeService;

@RestController

public class BikeController {
	@Autowired
	BikeService er;//add

	@PostMapping(value = "/setdata")
	public String setData(@RequestBody Bike b) {
		return er.setData(b);
	}

	@PostMapping(value = "/setdat")
	public String setDat(@RequestBody List<Bike> c) {
		return er.setDat(c);
	}

	@PutMapping(value = "/setda")
	public String setDa(@RequestBody Bike d) {
		return er.setDa(d);
	}

	@GetMapping(value = "/setd/{id}")
	public Bike setD(@PathVariable int id) {
		return er.setD(id);
	}

	@GetMapping(value = "/year/{a}/{b}")
	public List<Bike> getYear(@PathVariable int a, @PathVariable int b) {
		return er.getYear(a, b);
	}

	@GetMapping(value = "/brand/{a}")
	public List<Bike> getBrand(@PathVariable String a) {
		return er.getBrand(a);
	}

	@GetMapping(value = "/getByName/{x}")
	public List<Bike> getBikeByName(@PathVariable String x) {
		return er.getBikeByName(x);
	}

	@GetMapping(value = "/getByYear/{y}")
	public List<Bike> getBikeByYear(@PathVariable int y) {
		return er.getBikeByYear(y);
	}

	@GetMapping(value = "/getByColorPrice/{a}/{b}")
	public List<Bike> getBikeByColorPrice(@PathVariable String a, @PathVariable int b) {
		return er.getBikeByColorPrice(a, b);
	}

	@GetMapping(value = "/getByPrice/{a}")
	public List<Bike> getBikeByPrice(@PathVariable int a) {
		return er.getBikeByPrice(a);
	}

	@GetMapping(value = "/getBybrand/{a}")
	public List<Bike> getBikeBybrand(@PathVariable String a) {
		return er.getBikeBybrand(a);
	}

	@GetMapping(value = "/getByMax")
	public List<Bike> getBikeByMax() {
		return er.getBikeByMax();
	}

	@GetMapping(value = "/getByMin")
	public List<Bike> getBikeByMin() {
		return er.getBikeByMin();
	}

}
