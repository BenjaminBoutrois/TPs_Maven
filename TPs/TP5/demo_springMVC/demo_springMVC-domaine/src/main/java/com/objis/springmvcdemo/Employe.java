package com.objis.springmvcdemo.domaine;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author <a href="http://www.objis.com">Objis Consulting</a>
 */
public class Employe {
	
	private int id;
	@NotBlank(message="Ne peut être vide !!")
	private String login;
	private String password;
	private String prenom;
	private String nom;
	@Size(min=3,max=20,message= "entre 3 et 6 caractères.")
	private String email;
	private String role;
	
	public Employe() {
		super();
	}
	public Employe(int id, String login, String password, String prenom,
			String nom, String email, String role) {
		super();
		this.id = id;
		this.login = login;
		this.password = password;
		this.prenom = prenom;
		this.nom = nom;
		this.email = email;
		this.role = role;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}


}
