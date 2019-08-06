package com.desafio.fluxit.services;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.desafio.fluxit.dao.OficinaDAO;
import com.desafio.fluxit.models.Oficina;

@Service
public class OficinaServiceImpl implements OficinaService {
	
	@Autowired
	private OficinaDAO  oficinaDAO;
	
	@Override
	@Transactional
	public void save(Oficina oficina) {
		oficinaDAO.save(oficina);
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Oficina> findById(Long id) {
		return oficinaDAO.findById(id);
	}

}
