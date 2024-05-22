package com.example.footballdirectory.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.util.List;

/****** Lambok ******/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
/****** JPA ******/
@Entity
@Table(name = "teams")

public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String country;
    private String photoUrl;
    @CreationTimestamp
    private LocalDate year_of_foundation;
    private String stadium;
    @OneToMany(mappedBy = "team")
    private List<Player> players;

}
