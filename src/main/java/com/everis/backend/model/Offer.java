package com.everis.backend.model;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="Offer")
public class Offer {
	@Column(name ="id")
	@NotEmpty
	int id;
	@Column(name ="titulo")
	@NotEmpty
	String titulo;
	@Column(name ="datalle")
	@NotEmpty
	String detalle;
	@Column(name ="descuento")
	@NotEmpty
	Double descuento;
	@Column(name ="caducidad")
	@DateTimeFormat(pattern = "dd/MM/yyyy hh:mm:ss")
	@NotEmpty
	Date caducidad;
	
	public Offer() {
		super();
	}

	public Offer(String titulo, String detalle, Double descuento, Date fechaCaducidad) {
		super();
		this.titulo = titulo;
		this.detalle = detalle;
		this.descuento = descuento;
		this.caducidad = fechaCaducidad;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	public Double getDescuento() {
		return descuento;
	}
	public void setDescuento(Double descuento) {
		this.descuento = descuento;
	}
	public Date getCaducidad() {
		return caducidad;
	}
	public void setCaducidad(Date fechaCaducidad) {
		this.caducidad = fechaCaducidad;
	}
	
	@Override
	public String toString() {
		return "Offer [titulo=" + titulo + ", detalle=" + detalle + ", descuento=" + descuento + ", fechaCaducidad="
				+ caducidad + "]";
	}
	
	
}
