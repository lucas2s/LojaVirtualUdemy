package com.sartorilucas.lojavirtualudemy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sartorilucas.lojavirtualudemy.domain.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository <Produto, Integer>{

}
