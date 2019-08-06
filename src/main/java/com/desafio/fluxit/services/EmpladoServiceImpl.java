package com.desafio.fluxit.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.desafio.fluxit.dao.EmpleadoDAO;
import com.desafio.fluxit.models.Empleado;

@Service
public class EmpladoServiceImpl implements EmpleadoService{

	@Autowired
	private EmpleadoDAO empleadoDAO;
	
	@Override
	@Transactional
	public void save(Empleado empleado) {
		empleadoDAO.save(empleado);
		
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Empleado> findById(Long id) {
		return empleadoDAO.findById(id);
	}

}
