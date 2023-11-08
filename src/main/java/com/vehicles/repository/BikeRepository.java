package com.vehicles.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.vehicles.entity.Bike;

public interface BikeRepository extends JpaRepository<Bike, Integer> {
	@Query(value = "select * from bike where brand like ?", nativeQuery = true)

	List<Bike> getBikeByName(String x);

	@Query(value = "select *from bike where year>=?", nativeQuery = true)
	List<Bike> getBikeByYear(int y);

	@Query(value = "select * from bike where color like ? AND price=?", nativeQuery = true)
	List<Bike> getBikeByColorPrice(String a, int b);

	@Query(value = "select *from bike where price<=?", nativeQuery = true)
	List<Bike> getBikeByPrice(int a);

	@Query(value = "select * from bike where brand like ?%", nativeQuery = true)
	List<Bike> getBikeBybrand(String a);

	@Query(value = "select * from bike where price=(select min(price)from bike);", nativeQuery = true)
	List<Bike> getBikeByMax();

	@Query(value = "select * from bike where price=(select max(price)from bike);", nativeQuery = true)
	List<Bike> getBikeByMin();

	

}
