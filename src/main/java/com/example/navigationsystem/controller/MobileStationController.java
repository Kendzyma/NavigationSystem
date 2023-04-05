package com.example.navigationsystem.controller;

import com.example.navigationsystem.model.MobileStation;
import com.example.navigationsystem.model.dto.request.MobileStationRequestDto;
import com.example.navigationsystem.model.dto.response.MobileStationResponseDto;
import com.example.navigationsystem.service.MobileStationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/mobilestation")
public class MobileStationController {
    @Autowired
    private MobileStationService mobileStationService;
    @PostMapping()
    public ResponseEntity<MobileStation> createMobileStation(@RequestBody MobileStationRequestDto mobileStationRequestDto){
        return ResponseEntity.ok(mobileStationService.createBaseStation(mobileStationRequestDto));
    }

    @GetMapping("/location/{uuid}")
    public ResponseEntity<MobileStationResponseDto> getMobileStation(@PathVariable("uuid") String id){
        return ResponseEntity.ok(mobileStationService.getMobileStation(id));
    }
}

