package com.vehicles.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.vehicles.entity.Bus;

public interface BusRepository extends JpaRepository<Bus, Integer> {
	@Query(value = "select * from bus_details where number_plates like ?%", nativeQuery = true)

	List<Bus> GetBusByPlates(String a);

	@Query(value = "select* from bus_details where price>=? And price<=?", nativeQuery = true)
	List<Bus> GetBusByPrice(int a, int b);

	@Query(value = "select* from bus_details where mileage>?", nativeQuery = true)
	List<Bus> GetBusByMileage(int a);

	@Query(value = "select * from bus_details where color like ? AND type like ?;", nativeQuery = true)
	List<Bus> GetBusByCoty(String a, String b);

	@Query(value = "select * from bus_details order by price desc limit 1,1;", nativeQuery = true)

	List<Bus> GetBusBysecmax();

	@Query(value = "select * from bus_details order by price asc limit 1,1;", nativeQuery = true)
	List<Bus> GetBusBysecmin();

}
