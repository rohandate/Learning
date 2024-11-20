package com.rd.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rd.entity.Player;
import com.rd.entity.Team;
import com.rd.repo.PlayerRepo;
import com.rd.service.PlayerService;

@Service
public class PlayerServiceImpl implements PlayerService {
    
    @Autowired
    private PlayerRepo playerRepository;
    
    @Autowired
    private TeamService tservice;
    
    
	@Override
    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }

    @Override
    public Player getPlayerbyId(int jerseyNo) {
        return playerRepository.findById(jerseyNo).orElse(null);
    }

    @Override
    public void savePlayer(Player player, int id) {
    	Team t=tservice.getTeamById(id);
    	player.setTeam(t);
    	playerRepository.save(player);
    }
    

    @Override
    public void deletePlayer(int jerseyNo) {
        playerRepository.deleteById(jerseyNo);
    }
}
