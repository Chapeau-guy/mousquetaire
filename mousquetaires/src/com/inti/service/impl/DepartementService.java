package com.inti.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.inti.entities.Departement;
import com.inti.service.interfaces.IDepartementService;
import com.inti.service.impl.ManagerService;

@Service
@Transactional
public class DepartementService  extends ManagerService<Departement> implements IDepartementService{

	@Override
	public void save(Departement obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Departement obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Departement obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Departement> findAll(Class<?> c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Departement findOne(Class<?> c, Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
