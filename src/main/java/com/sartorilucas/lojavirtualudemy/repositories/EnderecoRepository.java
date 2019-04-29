package com.sartorilucas.lojavirtualudemy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sartorilucas.lojavirtualudemy.domain.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository <Endereco, Integer>{

}
