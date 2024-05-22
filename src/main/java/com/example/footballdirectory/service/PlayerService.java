package com.example.footballdirectory.service;

import com.example.footballdirectory.dto.PlayerDto;
import com.example.footballdirectory.models.Player;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PlayerService {
    List<PlayerDto> findAllPlayers();
    Player savePlayer(PlayerDto playerDto);
    PlayerDto findPlayerById(long playerId);

    /*
    void updatePlayer(PlayerDto player);

    void delete(long playerId);

    List<PlayerDto> searchPlayers(String query);

    * */

}
