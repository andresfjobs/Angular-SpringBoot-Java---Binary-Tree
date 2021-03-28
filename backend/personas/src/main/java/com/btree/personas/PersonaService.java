package com.btree.personas;

import java.util.List;

import com.btree.model.Persona;

public interface PersonaService {

	List<Persona>listar();
	Persona listarId(int id);
	Persona add(Persona p);
	Persona edit(Persona p);
	Persona delete(Persona p);
	
}
