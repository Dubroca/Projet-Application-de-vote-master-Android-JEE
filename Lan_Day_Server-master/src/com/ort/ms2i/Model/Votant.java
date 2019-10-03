package com.ort.ms2i.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Votant {

		@Id
		@GeneratedValue
		private int id;
		private int id_statut;
		
		private String nom;
		private String mail;
		
	public Votant() {
		// TODO Auto-generated constructor stub
	}
	
	public Votant(String p_nom, String p_mail, int p_id_statut){
		nom=p_nom;
		mail=p_mail;
		id_statut=p_id_statut;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId_statut() {
		return id_statut;
	}

	public void setId_statut(int id_statut) {
		this.id_statut = id_statut;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
}
