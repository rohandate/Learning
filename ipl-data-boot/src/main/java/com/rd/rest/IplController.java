package com.rd.rest;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.rd.entity.Team;
import com.rd.entity.Player;
import com.rd.service.TeamService;
import com.rd.service.PlayerService;

@RestController
public class IplController {
    
    @Autowired
    private TeamService teamService;

    @Autowired
    private PlayerService playerService;

    @GetMapping("/teams")
    public List<Team> getAllTeams() {
        return teamService.getAllTeams();
    }

    @GetMapping("/teams/{id}")
    public Team getTeamById(@PathVariable int id) {
        return teamService.getTeamById(id);
    }

    @PostMapping("/teams")
    public void createTeam(@RequestBody Team team) {
        teamService.saveTeam(team);
    }

    @DeleteMapping("/teams/{id}")
    public void deleteTeam(@PathVariable int id) {
        teamService.deleteTeam(id);
    }


    @GetMapping("/players")
    public List<Player> getAllPlayers() {
        return playerService.getAllPlayers();
    }

    @GetMapping("/players/{jerseyNo}")
    public Player getPlayerById(@PathVariable int jerseyNo) {
        return playerService.getPlayerbyId(jerseyNo);
    }

    @PostMapping("/players/save/{id}")
    public void createPlayer(@RequestBody Player player, @PathVariable int id) {
         playerService.savePlayer(player, id);
    }

    @DeleteMapping("/players/{jerseyNo}")
    public void deletePlayer(@PathVariable int jerseyNo) {
        playerService.deletePlayer(jerseyNo);
    }
}
