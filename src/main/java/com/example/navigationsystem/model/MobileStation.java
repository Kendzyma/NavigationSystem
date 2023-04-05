package com.example.navigationsystem.model;

import jdk.jfr.Timestamp;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "Mobile_Station")
@Data
public class MobileStation {
    @Id
    private String id;
    private float lastKnownX;
    private float getLastKnownY;
    private float error_radius;
    private int error_code;
    private String error_description;

    @CreationTimestamp
    private LocalDateTime createdDate;
}
