package com.uca.capas.domain;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(schema="public", name="contribuyente")
public class Contribuyente {

	@Id
	@SequenceGenerator(allocationSize = 1, name = "contribuyente_c_contribuyente_seq", sequenceName = "public.contribuyente_c_contribuyente_seq")
	@GeneratedValue(generator = "contribuyente_c_contribuyente_seq",strategy = GenerationType.AUTO)
	@Column(name = "c_contribuyente")
	private Integer c_contribuyente;
	
	@Column(name="s_nombre")
	private String s_nombre;
	@Column(name="s_apellido")
	private String s_apellido;
	@Column(name="s_nit")
	private String s_nit;
	@Column(name="f_fecha_ingreso")
	private Date f_fecha_ingreso;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "c_importancia")
	private Importancia importancia;

	public Integer getC_contribuyente() {
		return c_contribuyente;
	}

	public void setC_contribuyente(Integer c_contribuyente) {
		this.c_contribuyente = c_contribuyente;
	}

	public String getS_nombre() {
		return s_nombre;
	}

	public void setS_nombre(String s_nombre) {
		this.s_nombre = s_nombre;
	}

	public String getS_apellido() {
		return s_apellido;
	}

	public void setS_apellido(String s_apellido) {
		this.s_apellido = s_apellido;
	}

	public String getS_nit() {
		return s_nit;
	}

	public void setS_nit(String s_nit) {
		this.s_nit = s_nit;
	}

	public Date getF_fecha_ingreso() {
		return f_fecha_ingreso;
	}

	public void setF_fecha_ingreso(Date f_fecha_ingreso) {
		this.f_fecha_ingreso = f_fecha_ingreso;
	}

	public Importancia getImportancia() {
		return importancia;
	}

	public void setImportancia(Importancia importancia) {
		this.importancia = importancia;
	}
	
	public String getDelegateFecha() {
		SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
		String algo = f.format(f_fecha_ingreso);
		return algo;
	}
	
	
	
	
	
	
}
