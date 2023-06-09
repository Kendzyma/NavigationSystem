package com.example.navigationsystem.service;

import com.example.navigationsystem.exceptionhandler.Exceptions.EntityNotFoundException;
import com.example.navigationsystem.model.MobileStation;
import com.example.navigationsystem.model.dto.request.MobileStationRequestDto;
import com.example.navigationsystem.model.dto.response.MobileStationResponseDto;
import com.example.navigationsystem.repository.MobileStationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class MobileStationServiceImpl implements MobileStationService{
    @Autowired
    private MobileStationRepository  mobileStationRepository;

    @Override
    public MobileStation createBaseStation(MobileStationRequestDto mobileStationRequestDto) {
        MobileStation mobileStation = new MobileStation();
        mobileStation.setId(UUID.randomUUID().toString());
        mobileStation.setError_radius(mobileStationRequestDto.getError_radius());
        mobileStation.setError_description(mobileStationRequestDto.getError_description());
        mobileStation.setError_code(mobileStationRequestDto.getError_code());
        mobileStation.setGetLastKnownY(mobileStationRequestDto.getY());
        mobileStation.setLastKnownX(mobileStationRequestDto.getX());

        return mobileStationRepository.save(mobileStation);
    }

    @Override
    public MobileStationResponseDto getMobileStation(String id) {
        Optional<MobileStation> mobileStation = mobileStationRepository.findById(id);
        if (mobileStation.isEmpty()){
            throw new EntityNotFoundException("mobile station with id "+id+" not found");
        }
        MobileStationResponseDto response = new MobileStationResponseDto();
        response.setError_code(mobileStation.get().getError_code());
        response.setY(mobileStation.get().getGetLastKnownY());
        response.setX(mobileStation.get().getLastKnownX());
        response.setError_radius(mobileStation.get().getError_radius());
        response.setError_description(mobileStation.get().getError_description());

        return response;
    }
}
