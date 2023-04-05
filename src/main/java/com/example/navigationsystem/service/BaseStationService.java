package com.example.navigationsystem.service;

import com.example.navigationsystem.model.BaseStation;
import com.example.navigationsystem.model.dto.request.BaseStationRequestDto;
import com.example.navigationsystem.model.dto.response.BaseStationResponseDto;

public interface BaseStationService {
     BaseStation createBaseStation(BaseStationRequestDto baseStationRequestDto);
     BaseStationResponseDto getBaseStation(String uuid);
}
