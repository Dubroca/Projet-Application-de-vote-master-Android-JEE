package com.ort.ms2i.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Vote {
	@Id
	@GeneratedValue
	
	private int id;
	private int id_entreprise;
	private int id_user;
	public Vote() {
		// TODO Auto-generated constructor stub
	}
	public Vote(int p_id_entreprise, int p_id_user){
		id_entreprise=p_id_entreprise;
		id_user=p_id_user;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId_entreprise() {
		return id_entreprise;
	}
	public void setId_entreprise(int id_entreprise) {
		this.id_entreprise = id_entreprise;
	}
	
	public int getId_user() {
		return id_user;
	}
	public void setId_user(int id_user) {
		this.id_user = id_user;
	}
}
