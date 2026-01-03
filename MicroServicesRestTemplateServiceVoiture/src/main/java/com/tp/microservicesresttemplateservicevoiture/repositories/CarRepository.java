package com.tp.microservicesresttemplateservicevoiture.repositories;

import com.tp.microservicesresttemplateservicevoiture.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
    // Les méthodes CRUD de base sont fournies par JpaRepository
}