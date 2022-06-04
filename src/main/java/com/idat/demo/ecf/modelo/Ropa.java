package com.idat.demo.ecf.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

//@Getter
//@Setter
@Table(name = "Ropa")
@Entity
public class Ropa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idRopa;
	private String tipoRopa;
	private String	descripcion;
	public Integer getIdRopa() {
		return idRopa;
	}
	public void setIdRopa(Integer idRopa) {
		this.idRopa = idRopa;
	}
	public String getTipoRopa() {
		return tipoRopa;
	}
	public void setTipoRopa(String tipoRopa) {
		this.tipoRopa = tipoRopa;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
