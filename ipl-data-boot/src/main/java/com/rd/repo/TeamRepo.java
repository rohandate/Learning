package com.rd.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rd.entity.Team;

public interface TeamRepo extends JpaRepository<Team, Integer> {

	
	
}
