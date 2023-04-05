package com.example.navigationsystem.repository;

import com.example.navigationsystem.model.MobileStation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MobileStationRepository extends JpaRepository<MobileStation, String> {
}
