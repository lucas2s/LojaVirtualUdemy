package com.sartorilucas.lojavirtualudemy.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.sartorilucas.lojavirtualudemy.domain.Categoria;
import com.sartorilucas.lojavirtualudemy.repositories.CategoriaRepository;
import com.sartorilucas.lojavirtualudemy.services.excepitions.DataIntegrityExcepition;
import com.sartorilucas.lojavirtualudemy.services.excepitions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria find(Integer id) {
		Optional <Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id 
				+ ", Tipo: " + Categoria.class.getName()));
	}
	
	public Categoria insert(Categoria obj) {
		obj.setId(null);
		return repo.save(obj);
	}

	public Categoria update(Categoria obj) {
		find(obj.getId());
		return repo.save(obj);
	}
	
	public void delete(Integer id) {
		find(id);
		try {
			repo.deleteById(id);
		} catch (DataIntegrityViolationException e){
			throw new DataIntegrityExcepition("Não é possível excluir uma categoria que possui produtos.");
		}
	}


}
