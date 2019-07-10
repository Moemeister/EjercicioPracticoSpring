package com.uca.capas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uca.capas.domain.Contribuyente;
import com.uca.capas.repository.ContribuyenteRepository;

@Service
public class ContribuyenteServiceImp  implements ContribuyenteService{

	@Autowired
	ContribuyenteRepository cRepo;
	
	@Override
	public List<Contribuyente> findAll() {
		// TODO Auto-generated method stub
		return cRepo.findAll();
	}

	@Override
	public Contribuyente findOne(Integer id) {
		// TODO Auto-generated method stub
		return cRepo.findById(id).get();
	}

	@Override
	public Contribuyente save(Contribuyente c) {
		// TODO Auto-generated method stub
		return cRepo.save(c);
	}

	
}
