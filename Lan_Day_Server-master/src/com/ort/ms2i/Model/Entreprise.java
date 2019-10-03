package com.ort.ms2i.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Entreprise {
	
	@Id
	@GeneratedValue
	private int id;
	private String nom;
	private String logo;
	private String description;
	
	public Entreprise() {
		// TODO Auto-generated constructor stub
	}

	public Entreprise (String p_nom, String p_logo, String p_description){
		nom=p_nom;
		logo=p_logo;
		description=p_description;
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

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
