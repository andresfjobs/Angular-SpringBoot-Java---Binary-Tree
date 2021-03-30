package com.btree.personas;

import java.util.List;
import org.springframework.data.repository.Repository;

import com.btree.model.Persona;

public interface PersonaRepositorio extends Repository<Persona, Integer>{
	
	List<Persona>findAll();
	Persona findById(int nmid);
	Persona save(Persona p);
	Persona delete(Persona p);

}
