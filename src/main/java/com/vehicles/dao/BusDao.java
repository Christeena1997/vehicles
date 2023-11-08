package com.vehicles.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vehicles.entity.Bus;
import com.vehicles.idnotexception.IdNotFoundException;
import com.vehicles.repository.BusRepository;

@Repository
public class BusDao {
	@Autowired
	BusRepository es;

	public String GetData(Bus a) {
		es.save(a);
		return "save successfully";
	}

	public String GetDatali(List<Bus> b) {
		es.saveAll(b);
		return "saveli successfully";
	}

	public String GetBusByUpdate(Bus a) {
		es.save(a);
		return "update successfully";
	}

	public Bus GetBusById(int a) {
		return es.findById(a).get();

	}

	public List<Bus> GetBusByName() {

		return es.findAll();
	}

	public String GetBusByDelete(int a) {
		es.deleteById(a);
		return "delete successfully";
	}

	public List<Bus> getAllDetails() {
		return es.findAll();
	}

	public List<Bus> GetBusByPlates(String a) {

		return es.GetBusByPlates(a);
	}

	public List<Bus> GetBusByPrice(int a, int b) {

		return es.GetBusByPrice(a, b);
	}

	public List<Bus> GetBusByMileage(int a) {

		return es.GetBusByMileage(a);
	}

	public List<Bus> GetBusByCoty(String a, String b) {

		return es.GetBusByCoty(a, b);
	}

	public List<Bus> GetBusBysecmax() {

		return es.GetBusBysecmax();
	}

	public List<Bus> GetBusBysecmin() {

		return es.GetBusBysecmin();
	}

	public String setBusData(Bus b) {
		es.save(b);
		return "data save successfully";
	}

	public String setBusStart(Bus b) {
		es.save(b);
		return "save successfully";
	}

	public String setBusMileageList(List<Bus> b) {
		es.saveAll(b);
		return "save mileage successfully";
	}

	public String setBusListSeats(List<Bus> b) {
		es.saveAll(b);
		return "save seats successfully";
	}

	public String setBusId(List<Bus> b) {
		es.saveAll(b);
		return "save id successfully";
	}

	public Bus setBusId(int b) throws IdNotFoundException {
		return es.findById(b).orElseThrow(() -> new IdNotFoundException("this id is not found"));

	}

}
