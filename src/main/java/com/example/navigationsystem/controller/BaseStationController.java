package com.example.navigationsystem.controller;

import com.example.navigationsystem.model.BaseStation;
import com.example.navigationsystem.model.dto.request.BaseStationRequestDto;
import com.example.navigationsystem.model.dto.response.BaseStationResponseDto;
import com.example.navigationsystem.service.BaseStationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/basestation")
public class BaseStationController {
    @Autowired
private  BaseStationService baseStationService;
    @PostMapping()
    public ResponseEntity<BaseStation> createBaseStation(@RequestBody BaseStationRequestDto baseStationRequestDto){
        return ResponseEntity.ok(baseStationService.createBaseStation(baseStationRequestDto));
    }

    @GetMapping()
    public ResponseEntity<BaseStationResponseDto> getBaseStation(@RequestParam("id") String id){
        return ResponseEntity.ok(baseStationService.getBaseStation(id));
    }
}
