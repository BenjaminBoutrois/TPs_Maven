package com.objis.springmvcdemo.service;

import java.util.ArrayList;
import java.util.List;

import com.objis.springmvcdemo.dao.IEmployeDao;
import com.objis.springmvcdemo.domaine.Employe;

public class EmployeManager implements IEmployeManager {
	
	private IEmployeDao employeDAO;

	public void setEmployeDAO(IEmployeDao employeDAO) {
		this.employeDAO = employeDAO;
	}

	@Override
	public void createEmploye(Employe employe) {
		employeDAO.saveEmploye(employe);
	}

	public Employe getEmploye(String login){
		Employe employe = employeDAO.getEmployeByLogin(login);
		return employe ;
	}
	
	public Employe getEmploye(int id){		
		Employe employe = employeDAO.getEmployeById(id);
		return employe ;
	}
	public List<Employe> getAllEmployes() {
		
		List<Employe> listAllEmployes = new ArrayList<Employe>();
		//List<Map<String, Object>> listAllEmployes = new ArrayList<Map<String, Object>>();
		listAllEmployes = (List<Employe>) employeDAO.getAllEmployes();
		return listAllEmployes;
	}

	@Override
	public void deleteEmploye(Employe employe) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateEmploye(Employe employe) {
		// TODO Auto-generated method stub
		
	}

}
