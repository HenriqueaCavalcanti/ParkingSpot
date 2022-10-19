package com.api.parkingcontrol.repositories;

import com.api.parkingcontrol.models.ParkingSpotModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;


public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID> {

     boolean existsByLicensePlateCar(String licensePlateCar);

     boolean existsByParkingSportNumber(String parkingSportNumber);

     boolean existsByApartmentAndBlock(String apartment, String block);
}
