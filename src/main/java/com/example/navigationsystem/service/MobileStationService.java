package com.example.navigationsystem.service;

import com.example.navigationsystem.model.MobileStation;
import com.example.navigationsystem.model.dto.request.MobileStationRequestDto;
import com.example.navigationsystem.model.dto.response.MobileStationResponseDto;
import com.example.navigationsystem.repository.MobileStationRepository;

public interface MobileStationService {
    MobileStation createBaseStation(MobileStationRequestDto mobileStationRepository);

    MobileStationResponseDto getMobileStation(String id);
}
