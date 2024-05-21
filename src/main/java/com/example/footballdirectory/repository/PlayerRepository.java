package com.example.footballdirectory.repository;

import com.example.footballdirectory.models.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {
    /*Optional<Player> findByLastName(String last_name);

    @Query("SELECT p FROM Player p WHERE p.last_name LIKE CONCAT('%', :query, '%')")
    List<Player> searchPlayers(String query);*/
}
