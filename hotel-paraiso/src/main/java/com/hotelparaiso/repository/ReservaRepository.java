package com.hotelparaiso.repository;

import com.hotelparaiso.model.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Long> {
    // JpaRepository já fornece métodos básicos:
    // save(), findAll(), findById(), deleteById()
}
