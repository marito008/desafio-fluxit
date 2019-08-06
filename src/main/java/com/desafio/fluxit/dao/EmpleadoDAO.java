package com.desafio.fluxit.dao;

import org.springframework.data.repository.CrudRepository;

import com.desafio.fluxit.models.Empleado;

public interface EmpleadoDAO extends CrudRepository<Empleado, Long>{

}
