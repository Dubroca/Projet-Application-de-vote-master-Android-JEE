package com.ort.ms2i.Model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Entity;

@Entity
public class Status {
	@Id
	@GeneratedValue
	
	private int id;
	private String nom;
	
	public Status() {
		// TODO Auto-generated constructor stub
	}
	public Status(String p_nom){
		nom=p_nom;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
}
