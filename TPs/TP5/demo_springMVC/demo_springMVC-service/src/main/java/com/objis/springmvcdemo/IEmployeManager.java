package com.objis.springmvcdemo.service;

import java.util.List;
import java.util.Map;

import com.objis.springmvcdemo.domaine.Employe;

public interface IEmployeManager {
	public Employe getEmploye(String login);
	public List<Employe> getAllEmployes();
	public void deleteEmploye(Employe employe);
	public void updateEmploye(Employe employe);
	public void createEmploye(Employe employe);
}
