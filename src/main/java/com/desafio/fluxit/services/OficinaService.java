package com.desafio.fluxit.services;

import java.util.Optional;

import com.desafio.fluxit.models.Oficina;

public interface OficinaService {
	public void save(Oficina oficina);

	public Optional<Oficina> findById(Long id);
}
