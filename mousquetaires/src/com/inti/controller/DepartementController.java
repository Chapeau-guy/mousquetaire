package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.inti.entities.Departement;
import com.inti.service.interfaces.IDepartementService;

@Controller
//@RequestMapping(value="departement")
public class DepartementController {
	
	@Autowired
	IDepartementService departementService;
	
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public ModelAndView indexation(@ModelAttribute("index")Departement departement) {
		return new ModelAndView("redirect:/index");
	}
	
	@RequestMapping(value="/saveDepartement", method=RequestMethod.POST)
	public ModelAndView saveDepartement(@ModelAttribute("departement") Departement departement) {
		departementService.save(departement);
		return new ModelAndView("redirect:/departements");
		//return new ModelAndView("departements", "command", new Departement());
	}
	
	@RequestMapping(value="/departements")//GET implicite
	public ModelAndView findAllDepartement() {
		ModelAndView model = new ModelAndView("departement");
		List<Departement> listDepartement=departementService.findAll(Departement.class);
		model.addObject("listDepartement", listDepartement);
		model.addObject("departement", new Departement());
		return model;
				}
	@RequestMapping(value="/delete/{idA}")
	public ModelAndView deleteDepartement(@PathVariable("idA") Long id) {
		Departement departement = departementService.findOne(Departement.class, id);
		departementService.remove(departement);
		return new ModelAndView("redirect:/departements");
	}
	
}
