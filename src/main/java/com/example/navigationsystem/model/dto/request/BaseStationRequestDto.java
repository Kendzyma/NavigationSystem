package com.example.navigationsystem.model.dto.request;

import lombok.*;

@AllArgsConstructor
@Builder
@Data
public class BaseStationRequestDto {
    private String name;
    private float x;
    private float y;
    private float detectionRadiusInMeters;
}
