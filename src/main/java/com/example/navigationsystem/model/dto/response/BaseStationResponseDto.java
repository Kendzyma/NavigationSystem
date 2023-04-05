package com.example.navigationsystem.model.dto.response;

import lombok.*;

import java.util.List;
import java.util.Map;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BaseStationResponseDto {
    private String base_station;
    private List<Map<String,Object>> reports;
}
