package com.btree.model;

import javax.persistence.*;

@Entity
@Table(name = "persona")
public class Persona {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int nmid;
	@Column
	private int cus_nmcliente;
	@Column
	private String cus_dsnombres;
	@Column
	private String cus_dsapellido;
	@Column
	private String cus_dsdireccion;
	@Column
	private String cus_dscorreo;
	@Column
	private String cus_cdtelefono;
	@Column
	private String cus_cdcelular;
	@Column
	private String cus_nmcargo;
	@Column
	private String cus_dscargo;

	public int getNmid() {
		return nmid;
	}

	public void setNmid(int nmid) {
		this.nmid = nmid;
	}

	public int getCus_nmcliente() {
		return cus_nmcliente;
	}

	public void setCus_nmcliente(int cus_nmcliente) {
		this.cus_nmcliente = cus_nmcliente;
	}

	public String getCus_dsnombres() {
		return cus_dsnombres;
	}

	public void setCus_dsnombres(String cus_dsnombres) {
		this.cus_dsnombres = cus_dsnombres;
	}

	public String getCus_dsapellido() {
		return cus_dsapellido;
	}

	public void setCus_dsapellido(String cus_dsapellido) {
		this.cus_dsapellido = cus_dsapellido;
	}

	public String getCus_dsdireccion() {
		return cus_dsdireccion;
	}

	public void setCus_dsdireccion(String cus_dsdireccion) {
		this.cus_dsdireccion = cus_dsdireccion;
	}

	public String getCus_dscorreo() {
		return cus_dscorreo;
	}

	public void setCus_dscorreo(String cus_dscorreo) {
		this.cus_dscorreo = cus_dscorreo;
	}

	public String getCus_cdtelefono() {
		return cus_cdtelefono;
	}

	public void setCus_cdtelefono(String cus_cdtelefono) {
		this.cus_cdtelefono = cus_cdtelefono;
	}

	public String getCus_cdcelular() {
		return cus_cdcelular;
	}

	public void setCus_cdcelular(String cus_cdcelular) {
		this.cus_cdcelular = cus_cdcelular;
	}

	public String getCus_nmcargo() {
		return cus_nmcargo;
	}

	public void setCus_nmcargo(String cus_nmcargo) {
		this.cus_nmcargo = cus_nmcargo;
	}

	public String getCus_dscargo() {
		return cus_dscargo;
	}

	public void setCus_dscargo(String cus_dscargo) {
		this.cus_dscargo = cus_dscargo;
	}

}
