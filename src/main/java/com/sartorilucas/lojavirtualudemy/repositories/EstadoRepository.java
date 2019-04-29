package com.sartorilucas.lojavirtualudemy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sartorilucas.lojavirtualudemy.domain.Estado;

@Repository
public interface EstadoRepository extends JpaRepository <Estado, Integer>{

}
