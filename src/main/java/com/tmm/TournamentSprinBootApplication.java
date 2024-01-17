package com.tmm;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tmm.bean.Tournament;
import com.tmm.controller.TMMcontroller;
import com.tmm.dao.TournamentDAo;

@SpringBootApplication
public class TournamentSprinBootApplication {

	static TournamentDAo dao = new TournamentDAo();

	public Tournament menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Tournament Details:");

		return new Tournament(sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(),
				sc.next());
	}

	public static void main(String[] args) {
		SpringApplication.run(TournamentSprinBootApplication.class, args);
		TournamentSprinBootApplication obj = new TournamentSprinBootApplication();

		Tournament bean = obj.menu();

		TMMcontroller control = new TMMcontroller();
		control.performInsert(bean);

		
	}

}
