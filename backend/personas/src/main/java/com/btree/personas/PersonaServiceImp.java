package com.btree.personas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.btree.model.Persona;

@Service
public class PersonaServiceImp implements PersonaService{

	@Autowired
	private PersonaRepositorio repositorio;
	
	@Override
	public List<Persona> listar() {
		// TODO Auto-generated method stub
			return repositorio.findAll();
	}

	@Override
	public Persona listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Persona add(Persona p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Persona edit(Persona p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Persona delete(Persona p) {
		// TODO Auto-generated method stub
		return null;
	}

}
