package com.example.footballdirectory.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/****** Lambok ******/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
/****** JPA ******/
@Entity
@Table(name = "stats")
public class Stats {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /* player id */
    private int goals_scored;
    private int decisive_pass;
    private int matched_played;


}
