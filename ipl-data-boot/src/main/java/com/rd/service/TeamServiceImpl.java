package com.rd.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rd.entity.Team;
import com.rd.repo.TeamRepo;
import com.rd.service.TeamService;

@Service
public class TeamServiceImpl implements TeamService {
    
    @Autowired
    private TeamRepo teamRepository;

    @Override
    public List<Team> getAllTeams() {
        return teamRepository.findAll();
    }

    @Override
    public Team getTeamById(int id) {
        return teamRepository.findById(id).orElse(null);
    }

    @Override
    public void saveTeam(Team team) {
        teamRepository.save(team);
    }

    @Override
    public void deleteTeam(int id) {
        teamRepository.deleteById(id);
    }
}
