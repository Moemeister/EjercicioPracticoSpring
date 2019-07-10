package com.uca.capas.controller;

import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.domain.Contribuyente;
import com.uca.capas.domain.Importancia;
import com.uca.capas.services.ContribuyenteService;
import com.uca.capas.services.ImportanciaService;

@Controller
public class MainController {

	@Autowired
	ContribuyenteService cService;
	@Autowired
	ImportanciaService iService;
	
	@RequestMapping("/")
	public ModelAndView init() {
		ModelAndView mav = new ModelAndView();
		List<Importancia> importancia =  iService.findAll();
		mav.addObject("importancia",importancia);
		mav.addObject("contribuyente",new Contribuyente());
		mav.setViewName("main");
		return mav;
	}
	
	@RequestMapping("/guardar")
	public ModelAndView save(@ModelAttribute("contribuyente") Contribuyente c, @RequestParam("c_importancia") Integer id) {
		ModelAndView mav = new ModelAndView();
		Importancia imp = iService.findOne(id);
		c.setImportancia(imp);
		Calendar ca = Calendar.getInstance();
		c.setF_fecha_ingreso(ca.getTime());
		cService.save(c);
		mav.setViewName("main");
		return new ModelAndView("redirect:/");
	}
	
	@RequestMapping("/ver")
	public ModelAndView ver() {
		ModelAndView mav = new ModelAndView();
		List<Contribuyente> contribuyente = cService.findAll();
		mav.addObject("contribuyente", contribuyente);
		mav.setViewName("ver");
		return mav;
	}
	
}
