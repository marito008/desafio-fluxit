package com.desafio.fluxit.services;

import java.util.Optional;

import com.desafio.fluxit.models.Empleado;

public interface EmpleadoService {

	public void save(Empleado empleado);

	public Optional<Empleado> findById(Long id);

}
