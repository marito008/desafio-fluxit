package com.desafio.fluxit.models;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="db_empleados")
public class Empleado implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6986866066043519907L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "EMP_ID")
	private long id;
	@Column(name = "NOMBRE")
	private String nombre;
	@Column(name = "APELLIDO")
	private String apellido;
	@Column(name = "EDAD")
	private int edad;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="OFI_ID")
    private Oficina oficina;
	
	public Empleado() {
	}
	
	public Empleado(long id, String nombre, String apellido, int edad, Oficina oficina ) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.oficina = oficina;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Oficina getOficina() {
		return oficina;
	}

	public void setOficina(Oficina oficina) {
		this.oficina = oficina;
	}	
	
	
}
