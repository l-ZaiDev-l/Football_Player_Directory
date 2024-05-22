package com.example.footballdirectory.mapper;

import com.example.footballdirectory.dto.PlayerDto;
import com.example.footballdirectory.models.Player;

import java.util.stream.Collectors;

public class PlayerMapper {
    public static Player mapToPlayer(PlayerDto playerDto) {
        Player player = Player.builder()
                .id(playerDto.getId())
                .first_name(playerDto.getFirst_name())
                .last_name(playerDto.getLast_name())
                .shirt_number(playerDto.getShirt_number())
                .dob(playerDto.getDob())
                .nationality(playerDto.getNationality())
                .dominant_foot(playerDto.getDominant_foot())
                .photoUrl(playerDto.getPhotoUrl()) // Add this line
                .position(playerDto.getPosition())
                .team(playerDto.getTeam())
                .awards(playerDto.getAwards())
                .stats(playerDto.getStats())
                .build();
        return player;
    }

    public static PlayerDto mapToPlayerDto(Player player) {
        PlayerDto playerDto = PlayerDto.builder()
                .id(player.getId())
                .first_name(player.getFirst_name())
                .last_name(player.getLast_name())
                .shirt_number(player.getShirt_number())
                .dob(player.getDob())
                .nationality(player.getNationality())
                .dominant_foot(player.getDominant_foot())
                .photoUrl(player.getPhotoUrl()) // Add this line
                .position(player.getPosition())
                .team(player.getTeam())
                .awards(player.getAwards())
                .stats(player.getStats())
                .build();
        return playerDto;
    }
}


