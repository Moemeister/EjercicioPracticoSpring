package com.uca.capas.services;

import java.util.List;

import com.uca.capas.domain.Contribuyente;


public interface ContribuyenteService {

	public List<Contribuyente> findAll();
	public Contribuyente findOne(Integer id);
	public Contribuyente save(Contribuyente c);
	
}
