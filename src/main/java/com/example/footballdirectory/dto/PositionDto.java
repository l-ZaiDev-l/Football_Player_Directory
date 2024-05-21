package com.example.footballdirectory.dto;

import com.example.footballdirectory.models.Player;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.Data;

import java.util.List;
@Data
@Builder
public class PositionDto {

    private Long id;
    private String position;
    private List<Player> players;
}
