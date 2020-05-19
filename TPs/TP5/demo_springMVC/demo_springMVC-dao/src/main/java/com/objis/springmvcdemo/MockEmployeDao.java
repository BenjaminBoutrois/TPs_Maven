package com.objis.springmvcdemo.dao;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;

import com.objis.springmvcdemo.domaine.Employe;

public class MockEmployeDao implements IEmployeDao {
	
	private static Hashtable<Integer,Employe> employesById = new Hashtable<Integer,Employe>();
	private static Hashtable<String,Employe> employesByLogin = new Hashtable<String,Employe>(); 

	static{
		Employe douglas = new Employe(0, "douglas", "douglas", "Douglas", "Mbiandou", "douglas.mbiandou@objis.com", "Responsable");
		Employe yannick = new Employe(1, "yannick", "yannick", "yannick", "Fontan", "yannick.fontan@objis.com", "Responsable");
	
		employesById.put(douglas.getId(), douglas);
		employesById.put(yannick.getId(), yannick);
		
		employesByLogin.put(douglas.getLogin(), douglas);
		employesByLogin.put(yannick.getLogin(), yannick);
	}
	
	public void saveEmploye(Employe employe) {
		employesById.put(employe.getId(), employe);
		employesByLogin.put(employe.getLogin(), employe);		
	}

	// @SuppressWarnings("unchecked")
	public List<Employe> getAllEmployes() {
		
		ArrayList<Employe> allEmployes = new ArrayList<Employe>();
		
		Enumeration<Employe> e = employesByLogin.elements();
		while (e.hasMoreElements()) {
			Employe employe = (Employe) e.nextElement();
			allEmployes.add(employe);
		}
		
		return allEmployes;
	}

	public Employe getEmployeById(int id) {
		return employesById.get(id);
	}

	public Employe getEmployeByLogin(String login) {
		return employesByLogin.get(login);

	}

	public int getEmployesCount() {

		return employesById.size();
	}
}
