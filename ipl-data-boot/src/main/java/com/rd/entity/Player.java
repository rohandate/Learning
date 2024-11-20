package com.rd.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Player {
	
	@Id
	private int jerseyNo;
	@Column
	private String name;
	@Column
	private String genre;
	@Column
	private int bidAmt;
	
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name="id")
	Team team;
	
	public int getJerseyNo() {
		return jerseyNo;
	}
	public void setJerseyNo(int jerseyNo) {
		this.jerseyNo = jerseyNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getBidAmt() {
		return bidAmt;
	}
	public void setBidAmt(int bidAmt) {
		this.bidAmt = bidAmt;
	}
	public Team getTeam() {
		return team;
	}
	public void setTeam(Team team) {
		this.team = team;
	}
	
	
	public Player() {
	}
	
	public Player(int jerseyNo, String name, String genre, int bidAmt, Team team) {
		this.jerseyNo = jerseyNo;
		this.name = name;
		this.genre = genre;
		this.bidAmt = bidAmt;
		this.team = team;
	}

}
