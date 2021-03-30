package com.btree.personas;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.btree.model.Persona;
import com.btree.sortCtrl.BtreeCtrl;

@CrossOrigin(origins= "*", maxAge = 3600, methods= {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RestController
@RequestMapping({"/personas"})
public class PersonaControlador {
	
	BtreeCtrl ArbolEntrada = new BtreeCtrl();
	
	@Autowired
	PersonaService service;
	
	@GetMapping("/listar")
	public List<Persona>listar(){
		
		return service.listar();
	}
	
	@PostMapping
	public Persona agregar(@RequestBody Persona p) {
		
		//return ArbolEntrada.dataLeaf(p);
		return service.add(p);
	}
	
	@GetMapping(path = {"/{id}"})
	
	public Persona listarId(@PathVariable("id")  int nmid){
		
		return service.listarId(nmid);
		
	}
	
	@PutMapping(path = {"/{id}"})
	public Persona editar(@PathVariable("id") int nmid, @RequestBody Persona p ){
		
		return service.edit(p);
		
	}
	
	@DeleteMapping(path = {"/{id}"})
	
	public void borrarId(@PathVariable("id")  int nmid, @RequestBody Persona p){
		
		 service.delete(p);
		
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
