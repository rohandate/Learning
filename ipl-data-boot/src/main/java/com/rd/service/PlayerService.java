package com.rd.service;

import java.util.List;

import com.rd.entity.Player;
import com.rd.entity.Team;

public interface PlayerService {
	
    List<Player> getAllPlayers();
    
    Player getPlayerbyId(int jerseyNo);
    
    void savePlayer(Player player, int id);
    
    void deletePlayer(int jerseyNo);
}
