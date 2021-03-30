package com.btree.personas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.btree.model.Persona;
import com.btree.sortCtrl.BtreeCtrl;

@Service
public class PersonaServiceImp implements PersonaService{

	BtreeCtrl ArbolEntrada = new BtreeCtrl();
	
	@Autowired
	private PersonaRepositorio repositorio;
	
	@Override
	public List<Persona> listar() {
		// TODO Auto-generated method stub
			return repositorio.findAll();
	}

	@Override
	public Persona listarId(int nmid) {
		
		// TODO Auto-generated method stub
		return repositorio.findById(nmid);
	}

	@Override
	public Persona add(Persona p) {
		// TODO Auto-generated method stub
		ArbolEntrada.dataLeaf(p);
		return repositorio.save(p);
	}

	@Override
	public Persona edit(Persona p) {
		// TODO Auto-generated method stub
		return repositorio.save(p);
	}

	@Override
	public Persona delete(Persona p) {
		// TODO Auto-generated method stub
		return repositorio.delete(p);
	}


}
