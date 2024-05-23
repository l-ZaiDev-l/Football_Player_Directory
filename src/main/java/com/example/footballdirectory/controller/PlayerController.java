package com.example.footballdirectory.controller;

import com.example.footballdirectory.dto.PlayerDto;
import com.example.footballdirectory.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
@Controller
public class PlayerController {
    private PlayerService playerService;
    @Autowired
    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping("/players")
    public String ListPlayers(Model model){
        List<PlayerDto> players = playerService.findAllPlayers();
        model.addAttribute("players",players);
        return "players";
    }
    @GetMapping("/players/{playerId}")
    public String playerDetails(@PathVariable("playerId") long playerId, Model model) {
        PlayerDto playerDto = playerService.findPlayerById(playerId);
        model.addAttribute("player", playerDto);
        return "single";
    }
}
