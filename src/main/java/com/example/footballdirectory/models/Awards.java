package com.example.footballdirectory.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;

/****** Lambok ******/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
/****** JPA ******/
@Entity
@Table(name = "awards")
public class Awards {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String reward;
    @CreationTimestamp
    private LocalDate year;

    /* player id */
    @ManyToOne
    @JoinColumn(name = "player_id", nullable = false)
    private Player player;
}
