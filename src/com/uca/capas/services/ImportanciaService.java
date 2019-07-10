package com.uca.capas.services;

import java.util.List;

import com.uca.capas.domain.Importancia;


public interface ImportanciaService {

	public List<Importancia> findAll();
	public Importancia findOne(Integer id);
	
}
