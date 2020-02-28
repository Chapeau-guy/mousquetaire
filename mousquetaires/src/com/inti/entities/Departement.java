package com.inti.entities;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Departement implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idDepartement;
	private String nomDepartement ;
	private int numDepartement;
	public long getIdDepartement() {
		return idDepartement;
	}
	public void setIdDepartement(long idDepartement) {
		this.idDepartement = idDepartement;
	}
	public String getNomDepartement() {
		return nomDepartement;
	}
	public void setNomDepartement(String nomDepartement) {
		this.nomDepartement = nomDepartement;
	}
	public int getNumDepartement() {
		return numDepartement;
	}
	public void setNumDepartement(int numDepartement) {
		this.numDepartement = numDepartement;
	}
	public Departement() {
		super();
	}
	public Departement(String nomDepartement, int numDepartement) {
		super();
		this.nomDepartement = nomDepartement;
		this.numDepartement = numDepartement;
	}
	
	
	
}
