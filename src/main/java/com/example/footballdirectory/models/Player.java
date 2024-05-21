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
@Table(name = "players")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String first_name;
    private String last_name;
    @CreationTimestamp
    private LocalDate dob;
    private String nationality;
    private String dominant_foot;

    /*  id de la position */
    @ManyToOne
    @JoinColumn(name = "position_id",nullable=false)
    private Position position;

    /* id de l equipe */
    @ManyToOne
    @JoinColumn(name = "team_id",nullable=false)
    private Team team;

    /* relation avec Awards */
    @OneToMany(mappedBy = "player")
    private List<Awards> awards;
}
