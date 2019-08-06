package com.desafio.fluxit.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="db_oficinas")
public class Oficina implements Serializable{
	
	private static final long serialVersionUID = 5345961050068440933L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="OFI_ID")
	private Long id;
	
	@Column(name="NOMBRE")
	private String nombre;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<Empleado> empleado;

	public Oficina() {
		
	}
	
	public Oficina(Long id, String nombre, Set<Empleado> empleado) {
		this.id = id;
		this.nombre = nombre;
		this.empleado = empleado;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<Empleado> getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Set<Empleado> empleado) {
		this.empleado = empleado;
	}

	
}
