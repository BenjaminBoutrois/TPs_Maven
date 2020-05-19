package com.objis.springmvcdemo.controleur;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.objis.springmvcdemo.domaine.Employe;
import com.objis.springmvcdemo.service.IEmployeManager;

@Controller
public class HomePageController {
	/*
	 * Meilleure pratique Spring 3 : 
	 * utilisation d'Annotations et controlleur faiblement couplé à Spring 
	 */

	@RequestMapping({"/","/home"})
	public String homePage(Map<String,Object> model) {
		/*
		 * Envoi Vue + Modèle MVC pour Affichage données vue
		 */
		return "home";
	}
	
	@RequestMapping("/listeEmployes")
	public String listeEmployes(Map<String,Object> model) {
		/*
		 * Lancement du Service et récupération données en base
		 */
		
		model.put ("employes", employeManager.getAllEmployes());
		/*
		 * Envoi Vue + Modèle MVC pour Affichage données vue
		 */
		return "listeEmployes";
	}
	
	@RequestMapping("/infosEmploye")
	public String infoEmploye(@RequestParam("login") String employeLogin, Model model) {
		/*
		 * Lancement du Service et récupération données en base
		 */
		
		Employe employe = employeManager.getEmploye(employeLogin);
		
		//model.put ("employe", employeManager.getEmploye(employeLogin));
		model.addAttribute("employe", employe);

		/*
		 * Envoi Vue + Modèle MVC pour Affichage données vue
		 */
		return "infosEmploye";
	}
	
	/*
	 * INJECTION Spring d'un bean Service dans le controleur. 
	 * Le bean Service est configuré dans objisapp-service.xml
	 */
	private IEmployeManager employeManager;

	@Autowired
	public void setEmployeManager(IEmployeManager employeManager) {
		this.employeManager = employeManager;
	}
}
