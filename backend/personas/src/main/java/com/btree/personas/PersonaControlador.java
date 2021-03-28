package com.btree.personas;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.btree.model.Persona;
import com.btree.sortCtrl.BtreeCtrl;

@CrossOrigin(origins= "*", maxAge = 3600, methods= {RequestMethod.GET, RequestMethod.POST})
@RestController
@RequestMapping({"/personas"})
public class PersonaControlador {
	
	BtreeCtrl ArbolEntrada = new BtreeCtrl();
	
	@Autowired
	PersonaService service;
	
	@GetMapping
	public List<Persona>listar(){
		
		return service.listar();
	}
	
	
	//traer los usuarios de la base de datos.
	
	@Bean
	public CommandLineRunner nodoUsuarios(ApplicationContext ctx) {
		return args -> {
			
			List<Persona>usuarios = listar();
			ArbolEntrada.dataTree(usuarios);
			
			System.out.println("numero de usuarios traidos:" + usuarios.size());

		};
	}
	
}
