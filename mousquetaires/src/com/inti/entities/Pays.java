package com.inti.entities;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Pays implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idPays;
	private String nomPays;
	private String langue;
	
	public long getIdPays() {
		return idPays;
	}
	public void setIdPays(long idPays) {
		this.idPays = idPays;
	}
	public String getNomPays() {
		return nomPays;
	}
	public void setNomPays(String nomPays) {
		this.nomPays = nomPays;
	}
	public String getLangue() {
		return langue;
	}
	public void setLangue(String langue) {
		this.langue = langue;
	}
	public Pays(String nomPays, String langue) {
		super();
		this.nomPays = nomPays;
		this.langue = langue;
	}
	@Override
	public String toString() {
		return "Pays [idPays=" + idPays + ", nomPays=" + nomPays + ", langue=" + langue + "]";
	} 
	
}
