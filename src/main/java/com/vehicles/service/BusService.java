package com.vehicles.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicles.dao.BusDao;
import com.vehicles.entity.Bus;
import com.vehicles.exception.InvalidMileageException;
import com.vehicles.exception.InvalidSeatsException;
import com.vehicles.exception.InvalidStateException;
import com.vehicles.exception.TypeNotValidException;
import com.vehicles.idnotexception.IdNotFoundException;

@Service
public class BusService {
	@Autowired
	BusDao ed;

	public String GetData(Bus a) {

		return ed.GetData(a);
	}

	public String GetDatali(List<Bus> b) {

		return ed.GetDatali(b);
	}

	public String GetBusByUpdate(Bus a) {

		return ed.GetBusByUpdate(a);
	}

	public Bus GetBusById(int a) {

		return ed.GetBusById(a);
	}

	public List<Bus> GetBusByName() {

		return ed.GetBusByName();
	}

	public String GetBusDelete(int a) {

		return ed.GetBusByDelete(a);
	}

	public List<Bus> GetBusByColor(String a, String b) {
		List<Bus> c = ed.getAllDetails();
		List<Bus> i = c.stream().filter(l -> l.getColor().equals(a) || l.getColor().equals(b))
				.collect(Collectors.toList());
		return i;
	}

	public List<Bus> GetBusBySeats(int a) {
		List<Bus> c = ed.getAllDetails();
		List<Bus> i = c.stream().filter(l -> l.getNo_of_seats() <= a).collect(Collectors.toList());
		return i;
	}

	public List<Bus> GetBusByPlates(String a) {

		return ed.GetBusByPlates(a);
	}

	public List<Bus> GetBusByPrice(int a, int b) {

		return ed.GetBusByPrice(a, b);
	}

	public List<Bus> GetBusByMileage(int a) {

		return ed.GetBusByMileage(a);
	}

	public List<Bus> GetBusByCoty(String a, String b) {

		return ed.GetBusByCoty(a, b);
	}

	public List<Bus> GetBusBysecmax() {

		return ed.GetBusBysecmax();
	}

	public List<Bus> GetBusBysecmin() {

		return ed.GetBusBysecmin();
	}

	public String setBusData(Bus b) throws TypeNotValidException {

		if (b.getType().equalsIgnoreCase("private") || b.getType().equalsIgnoreCase("government")) {
			return ed.setBusData(b);
		} else {
			throw new TypeNotValidException("not valid type");
		}
	}

	public String setBusStart(Bus b) throws InvalidStateException {

		if (b.getNumber_plates().startsWith("tn")) {
			return ed.setBusStart(b);
		} else {
			throw new InvalidStateException("Not a valid");
		}
	}

	public String setBusListSeats(List<Bus> n) throws InvalidSeatsException {
		List<Bus> g = n.stream().filter(l -> l.getNo_of_seats() >= 40 && l.getNo_of_seats() <= 50)
				.collect(Collectors.toList());
		if (g.isEmpty()) {
			throw new InvalidSeatsException("Not Valid seats");

		} else {
			return ed.setBusListSeats(g);
		}
	}

	public String setBusMileageList(List<Bus> b) throws InvalidMileageException {
		List<Bus> g = b.stream().filter(l -> l.getMileage() > 15).collect(Collectors.toList());

		if (g.isEmpty()) {

			throw new InvalidMileageException("Not valid mileage");

		} else {

			return ed.setBusMileageList(g);
		}

	}

	public String setBusId(List<Bus> b) throws IdNotFoundException {
		List<Bus> m = b.stream().filter(l -> l.getId() > 10).collect(Collectors.toList());
		if (m.isEmpty()) {
			throw new IdNotFoundException("invalid id exception");

		} else {
			return ed.setBusId(m);
		}
	}

	public Bus setId(int b) throws IdNotFoundException {

		return ed.setBusId(b);
	}
}
