package com.example.footballdirectory.dto;

import com.example.footballdirectory.models.Awards;
import com.example.footballdirectory.models.Position;
import com.example.footballdirectory.models.Stats;
import com.example.footballdirectory.models.Team;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.util.List;

@Data
@Builder
public class PlayerDto {

    private Long id;
    private String first_name;
    private String last_name;
    private int tshirtNumber;
    private LocalDate dob;
    private String nationality;
    private String dominant_foot;
    private Position position;
    /**/
    private Team team;
    /**/
    private List<Awards> awards;
    /**/
    private Stats stats;


}
