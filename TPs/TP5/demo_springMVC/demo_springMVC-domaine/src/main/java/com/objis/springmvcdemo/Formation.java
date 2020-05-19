package com.objis.springmvcdemo.domaine;

import java.util.Date;

import org.hibernate.validator.constraints.NotBlank;

public class Formation {

	private int id;
	private String theme;
	@NotBlank
	private Date dateFormation;	
	
	public Formation() {
		super();
	}
	
	public Formation(int id, String theme, Date dateFormation) {
		super();
		this.id = id;
		this.theme = theme;
		this.dateFormation = dateFormation;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTheme() {
		return theme;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}
	public Date getDateFormation() {
		return dateFormation;
	}
	public void setDateFormation(Date dateFormation) {
		this.dateFormation = dateFormation;
	}
	
	
}
