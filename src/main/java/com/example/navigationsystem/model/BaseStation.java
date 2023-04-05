package com.example.navigationsystem.model;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "BASE_STATION")
@Data
public class BaseStation {
    @Id
    private String id;
    private String name;
    private float x;
    private float y;
    private float detectionRadiusInMeters;

}
