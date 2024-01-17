package com.tmm;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.tmm.bean.Tournament;
import com.tmm.controller.TMMcontroller;
import com.tmm.dao.TournamentDAo;

@SpringBootTest
class TournamentSprinBootApplicationTests {
	
	@Autowired
	TMMcontroller controller;
	TournamentDAo dao;
	Tournament toe;

	@Test
	@Order(1)
	void contextLoads() {
	}
	@Test
	@Order(2)
	public void testPerformInsert() {
		Tournament to = new Tournament();
		to.setTournamentId(101);
		to.setTournamentType("Team");
		to.setTournamentName("Hockey");
		to.setMaxPlayer("16");
		to.setPriceCount("1000");
		to.setFirstpriceAmount("50000");
		to.setSecondpriceAmount("25000");
		to.setConsolationAmount("10000");
		String insert = "Inserted";
		String result =controller.performInsert(to);
		String d=dao.insert(to);
		assertEquals(insert, result);
		assertEquals(insert, d);
		
	}

}
