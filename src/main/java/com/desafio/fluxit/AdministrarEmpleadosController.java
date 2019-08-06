package com.desafio.fluxit;

import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.fluxit.models.Empleado;
import com.desafio.fluxit.models.Oficina;
import com.desafio.fluxit.services.EmpleadoService;
import com.desafio.fluxit.services.OficinaService;

@RestController
@RequestMapping("/apirest/fluxit")
public class AdministrarEmpleadosController {
	@Autowired
	private OficinaService oficinaService;
	@Autowired
	private EmpleadoService empleadoService;

	@GetMapping("/oficina/{id}")
	public Optional<Oficina> findOficinaById(@PathVariable Long id) {
		return oficinaService.findById(id);
		
	}
	
	@RequestMapping(value="/oficina")
	@ResponseStatus(HttpStatus.CREATED)
	public Oficina createOficina(@RequestBody Oficina oficina) {
		this.oficinaService.save(oficina);
		
		return oficina;
	}
	
	@GetMapping("/empleado/{id}")
	public Optional<Empleado> findEmpleadoById(@PathVariable Long id) {
		return empleadoService.findById(id);
		
	}

	
	@PostMapping("/empleado")
	@ResponseStatus(HttpStatus.CREATED)
	public Empleado createEmpleado(@RequestBody Empleado empleado) {
		empleadoService.save(empleado);
		
		return empleado;
	}
	
}
