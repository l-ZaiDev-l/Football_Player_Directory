package com.example.footballdirectory.dto;

import com.example.footballdirectory.models.Player;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StatsDto {

    private Long id;
    private int goals_scored;
    private int decisive_pass;
    private int matched_played;
    private Player player;
}
