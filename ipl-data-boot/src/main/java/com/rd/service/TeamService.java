package com.rd.service;

import java.util.List;

import com.rd.entity.Team;

public interface TeamService {
	
    List<Team> getAllTeams();
    
    Team getTeamById(int id);
    
    void saveTeam(Team team);
    
    void deleteTeam(int id);

}
