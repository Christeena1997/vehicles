package com.vehicles.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vehicles.entity.Bus;
import com.vehicles.exception.InvalidMileageException;
import com.vehicles.exception.InvalidSeatsException;
import com.vehicles.exception.InvalidStateException;
import com.vehicles.exception.TypeNotValidException;
import com.vehicles.idnotexception.IdNotFoundException;
import com.vehicles.service.BusService;

@RestController
public class BusController {
	@Autowired
	BusService er;

	@PostMapping(value = "/getdata")
	public String GetData(@RequestBody Bus a) {
		return er.GetData(a);
	}

	@PostMapping(value = "/getdatali")
	public String GetDatali(@RequestBody List<Bus> b) {
		return er.GetDatali(b);
	}

	@PutMapping(value = "/getUpdate")
	public String GetBusByUpdate(@RequestBody Bus a) {
		return er.GetBusByUpdate(a);
	}

	@GetMapping(value = "/getid/{a}")
	public Bus GetBusById(@PathVariable int a) {
		return er.GetBusById(a);
	}

	@GetMapping(value = "/getname")
	public List<Bus> GetBusByName() {
		return er.GetBusByName();
	}

	@GetMapping(value = "/getdeleteid/{a}")
	public String GetBusByDelete(@PathVariable int a) {
		return er.GetBusDelete(a);
	}

	@GetMapping(value = "/getcolor/{a}/{b}")
	public List<Bus> GetBusByColor(@PathVariable String a, @PathVariable String b) {
		return er.GetBusByColor(a, b);
	}

	@GetMapping(value = "/getseats/{a}")
	public List<Bus> GetBusBySeats(@PathVariable int a) {
		return er.GetBusBySeats(a);
	}

	@GetMapping(value = "/getplates/{a}")
	public List<Bus> GetBusByPlates(@PathVariable String a) {
		return er.GetBusByPlates(a);
	}

	@GetMapping(value = "/getprice/{a}/{b}")
	public List<Bus> GetBusByPrice(@PathVariable int a, @PathVariable int b) {
		return er.GetBusByPrice(a, b);
	}

	@GetMapping(value = "/getmileage/{a}")
	public List<Bus> GetBusByMileage(@PathVariable int a) {
		return er.GetBusByMileage(a);
	}

	@GetMapping(value = "getcolortype/{a}/{b}")
	public List<Bus> GetBusByCoty(@PathVariable String a, @PathVariable String b) {
		return er.GetBusByCoty(a, b);
	}

	@GetMapping(value = "getsecmax")
	public List<Bus> GetBusBysecmax() {
		return er.GetBusBysecmax();
	}

	@GetMapping(value = "getsecmin")
	public List<Bus> GetBusBysecmin() {
		return er.GetBusBysecmin();
	}

	@PostMapping(value = "setBus")
	public String setBusData(@RequestBody Bus b) throws TypeNotValidException {
		return er.setBusData(b);
	}

	@PostMapping(value = "setstart")
	public String setBusStart(@RequestBody Bus b) throws InvalidStateException {
		return er.setBusStart(b);
	}

	@PostMapping(value = "setlistseats")
	public String setBusListSeats(@RequestBody List<Bus> a) throws InvalidSeatsException {
		return er.setBusListSeats(a);
	}

	@PostMapping(value = "setmileagelist")
	public String setBusMileageList(@RequestBody List<Bus> b) throws InvalidMileageException {
		return er.setBusMileageList(b);
	}

	@PostMapping(value = "setlistid")
	public String setBusId(@RequestBody List<Bus> b) throws IdNotFoundException {
		return er.setBusId(b);
	}

	@GetMapping(value = "setid/{b}")
	public Bus setId(@PathVariable int b) throws IdNotFoundException {
		return er.setId(b);
	}
}
