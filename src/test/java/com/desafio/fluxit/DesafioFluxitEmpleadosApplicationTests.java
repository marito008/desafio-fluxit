package com.desafio.fluxit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.desafio.fluxit.models.Empleado;
import com.desafio.fluxit.models.Oficina;
import com.desafio.fluxit.services.EmpleadoService;
import com.desafio.fluxit.services.OficinaService;


@RunWith(SpringRunner.class)
@SpringBootTest
public class DesafioFluxitEmpleadosApplicationTests {

	@Autowired
	private OficinaService oficinaService;
	@Autowired
	private EmpleadoService empleadoService;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createFindOficina() {
		Oficina oficina = new Oficina(null, "Oficina AAAA", null);
		
		oficinaService.save(oficina);
		
		oficinaService.findById(oficina.getId());
		
		createFindEmpleados(oficina);
	}

	@Test
	public void createFindEmpleados(Oficina oficina) {
		Empleado empleado = new Empleado(0,"Juan", "Perez", 33, oficina);
		
		empleadoService.save(empleado);
		
		empleadoService.findById(empleado.getId());;
	}

}
