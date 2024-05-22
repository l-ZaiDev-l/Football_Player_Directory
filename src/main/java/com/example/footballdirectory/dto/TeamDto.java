package com.example.footballdirectory.dto;

import com.example.footballdirectory.models.Player;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.util.List;
@Data
@Builder
public class TeamDto {

    private Long id;
    private String name;
    private String country;
    private LocalDate year_of_foundation;
    private String stadium;
    private String photoUrl;
    private List<Player> players;
}
