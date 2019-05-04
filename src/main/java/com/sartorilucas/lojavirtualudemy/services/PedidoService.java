package com.sartorilucas.lojavirtualudemy.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sartorilucas.lojavirtualudemy.domain.Pedido;
import com.sartorilucas.lojavirtualudemy.repositories.PedidoRepository;
import com.sartorilucas.lojavirtualudemy.services.excepitions.ObjectNotFoundException;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repo;
	
	public Pedido find(Integer id) {
		Optional <Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id 
				+ ", Tipo: " + Pedido.class.getName()));
	}

}
