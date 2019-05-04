package com.sartorilucas.lojavirtualudemy.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sartorilucas.lojavirtualudemy.domain.Cliente;
import com.sartorilucas.lojavirtualudemy.repositories.ClienteRepository;
import com.sartorilucas.lojavirtualudemy.services.excepitions.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repo;
	
	public Cliente find(Integer id) {
		Optional <Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id 
				+ ", Tipo: " + Cliente.class.getName()));
	}

}
