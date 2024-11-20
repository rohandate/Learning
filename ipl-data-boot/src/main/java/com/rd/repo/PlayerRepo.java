package com.rd.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.rd.entity.Player;

public interface PlayerRepo extends JpaRepository<Player, Integer> {

	
	@Query("FROM Player WHERE team.id=:id")
	List<Player> findByTeam(@Param("id") int id);
	
}
