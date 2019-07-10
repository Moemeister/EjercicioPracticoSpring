package com.uca.capas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uca.capas.domain.Importancia;
import com.uca.capas.repository.ImportanciaRepository;

@Service
public class ImportanciaServiceImp  implements ImportanciaService{

	@Autowired
	ImportanciaRepository iRepo;
	
	@Override
	public List<Importancia> findAll() {
		// TODO Auto-generated method stub
		return iRepo.findAll();
	}

	@Override
	public Importancia findOne(Integer id) {
		// TODO Auto-generated method stub
		return iRepo.findById(id).get();
	}

}
