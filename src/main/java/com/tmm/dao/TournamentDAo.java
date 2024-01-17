package com.tmm.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.tmm.bean.Tournament;

@SpringBootApplication
public class TournamentDAo {

	static List<Tournament> list;

	public static String insert(Tournament bean) {
		list = new ArrayList<Tournament>();

		list.add(bean);
		return "Inserted";

	}

	public static List<Tournament> view() {
		return list;
	}
}
