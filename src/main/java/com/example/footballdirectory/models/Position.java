package com.example.footballdirectory.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/****** Lambok ******/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
/****** JPA ******/
@Entity
@Table(name = "positions")
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String position;

    @OneToMany(mappedBy = "position")
    private List<Player> players;

}
