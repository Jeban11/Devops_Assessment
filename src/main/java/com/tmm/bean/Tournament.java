package com.tmm.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Tournament {
	@Id
	private int tournamentId;
	private String tournamentType;
	private String tournamentName;
	private String maxPlayer;
	private String priceCount;
	private String firstpriceAmount;
	private String secondpriceAmount;
	private String consolationAmount;

	public Tournament(int tournamentId, String tournamentType, String tournamentName, String maxPlayer,
			String priceCount, String firstpriceAmount, String secondpriceAmount, String consolationAmount) {
		super();
		this.tournamentId = tournamentId;
		this.tournamentType = tournamentType;
		this.tournamentName = tournamentName;
		this.maxPlayer = maxPlayer;
		this.priceCount = priceCount;
		this.firstpriceAmount = firstpriceAmount;
		this.secondpriceAmount = secondpriceAmount;
		this.consolationAmount = consolationAmount;
	}

	public Tournament() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getTournamentId() {
		return tournamentId;
	}

	public void setTournamentId(int tournamentId) {
		this.tournamentId = tournamentId;
	}

	public String getTournamentType() {
		return tournamentType;
	}

	public void setTournamentType(String tournamentType) {
		this.tournamentType = tournamentType;
	}

	public String getTournamentName() {
		return tournamentName;
	}

	public void setTournamentName(String tournamentName) {
		this.tournamentName = tournamentName;
	}

	public String getMaxPlayer() {
		return maxPlayer;
	}

	public void setMaxPlayer(String maxPlayer) {
		this.maxPlayer = maxPlayer;
	}

	public String getPriceCount() {
		return priceCount;
	}

	public void setPriceCount(String priceCount) {
		this.priceCount = priceCount;
	}

	public String getFirstpriceAmount() {
		return firstpriceAmount;
	}

	public void setFirstpriceAmount(String firstpriceAmount) {
		this.firstpriceAmount = firstpriceAmount;
	}

	public String getSecondpriceAmount() {
		return secondpriceAmount;
	}

	public void setSecondpriceAmount(String secondpriceAmount) {
		this.secondpriceAmount = secondpriceAmount;
	}

	public String getConsolationAmount() {
		return consolationAmount;
	}

	public void setConsolationAmount(String consolationAmount) {
		this.consolationAmount = consolationAmount;
	}

	@Override
	public String toString() {
		return "Tournament [tournamentId=" + tournamentId + ", tournamentType=" + tournamentType + ", tournamentName="
				+ tournamentName + ", maxPlayer=" + maxPlayer + ", priceCount=" + priceCount + ", firstpriceAmount="
				+ firstpriceAmount + ", secondpriceAmount=" + secondpriceAmount + ", consolationAmount="
				+ consolationAmount + "]";
	}

}
