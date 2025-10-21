package com.hotelparaiso.repository;

import com.hotelparaiso.model.Hospede;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HospedeRepository extends JpaRepository<Hospede, Long> {
}
