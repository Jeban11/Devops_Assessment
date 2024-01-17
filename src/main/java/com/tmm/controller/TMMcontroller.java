package com.tmm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


import com.tmm.bean.Tournament;
import com.tmm.dao.TournamentDAo;
;


@RestController
@CrossOrigin(origins = "http://localhost:6000")
//@RequestMapping("/tournamentRest/api")
public class TMMcontroller {


	@Autowired
	TournamentDAo dao;
	
	@PostMapping("/tournament")
	public String performInsert(@RequestBody Tournament  bean)
	{
		dao.insert(bean);
		System.out.println("Inserted");
		List <Tournament> list=dao.view();
		System.out.println(list);
		return "Inserted";
	}


	

}
