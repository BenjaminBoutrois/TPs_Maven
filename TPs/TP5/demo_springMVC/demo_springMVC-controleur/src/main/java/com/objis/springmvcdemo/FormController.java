package com.objis.springmvcdemo.controleur;

import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.objis.springmvcdemo.domaine.Employe;
import com.objis.springmvcdemo.service.IEmployeManager;

@Controller
@RequestMapping("/objis")
public class FormController {

	/*
	 * Affichage formulaire (GET)
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String ajoutEmployeSansParam(Model model) {
		model.addAttribute(new Employe());
		return "home";
	}
	
	/*
	 * Affichage formulaire (GET)
	 */
	@RequestMapping(method = RequestMethod.GET, params="new")
	public String ajoutEmploye(Model model) {
		model.addAttribute(new Employe());
		return "editEmploye";
	}

	/*
	 * Soumission formulaire (POST) --> validation
	 */
	@RequestMapping(method = RequestMethod.POST)
	public String addemployeFromForm(@Valid Employe employe, BindingResult result) {

		if (result.hasErrors()) {
			return "editEmploye";
		}else {
		employeManager.createEmploye(employe);
		return "redirect:/listeEmployes" ;
		}
	}
	
	/*
	o * Soumission formulaire (POST) --> validation + conversion champ Date
	 */
	@RequestMapping("date/{value}")
	public @ResponseBody String date(@PathVariable @DateTimeFormat(iso=ISO.DATE) Date value) {
		return "Converted date " + value;
	}
	
	
	/*
	 * INJECTION Spring d'un bean Service dans le controleur. Le bean Service
	 * est configuré dans objisapp-service.xml
	 */
	private IEmployeManager employeManager;

	@Autowired
	public void setEmployeManager(IEmployeManager employeManager) {
		this.employeManager = employeManager;
	}
	
}
