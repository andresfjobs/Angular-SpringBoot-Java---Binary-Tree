package com.btree.personas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins= "*", maxAge = 3600, methods= {RequestMethod.GET, RequestMethod.POST})
@RestController
@RequestMapping({"/test"})
public class TestController {

	@Autowired
	PersonaService service;
	
	public void listar(){
		
		System.out.println("arroz");
	}
	
}
