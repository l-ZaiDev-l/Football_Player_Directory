package com.example.footballdirectory.dto;

import com.example.footballdirectory.models.Player;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
@Data
@Builder
public class AwardsDto {

    private Long id;
    private String reward;
    private String photoUrl;
    private LocalDate year;
    private Player player;

}
