package com.vehicles.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vehicles.entity.Car;

public interface CarRepository extends JpaRepository<Car, Integer> {

}
