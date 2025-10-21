package com.hotelparaiso.repository;

import com.hotelparaiso.model.Suite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SuiteRepository extends JpaRepository<Suite, Long> {
}
