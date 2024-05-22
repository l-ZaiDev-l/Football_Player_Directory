package com.example.footballdirectory.service.impl;

import com.example.footballdirectory.dto.PlayerDto;
import com.example.footballdirectory.models.Player;
import com.example.footballdirectory.repository.PlayerRepository;
import com.example.footballdirectory.service.PlayerService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static com.example.footballdirectory.mapper.PlayerMapper.mapToPlayer;
import static com.example.footballdirectory.mapper.PlayerMapper.mapToPlayerDto;
@Service
public class PlayerServiceImpl implements PlayerService {
    private PlayerRepository playerRepository;

    public PlayerServiceImpl(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    @Override
    public List<PlayerDto> findAllPlayers() {
        List<Player> players = playerRepository.findAll();
        return players.stream().map((player) -> mapToPlayerDto(player)).collect(Collectors.toList());
    }

    @Override
    public Player savePlayer(PlayerDto playerDto) {
        Player player= mapToPlayer(playerDto);
        return playerRepository.save(player);
    }

    @Override
    public PlayerDto findPlayerById(long playerId) {
        Player player = playerRepository.findById(playerId).get();
        return mapToPlayerDto(player);
    }
}
