package br.sp.gov.cleiton.financiamento.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.sp.gov.cleiton.financiamento.dto.ClienteDto;
import br.sp.gov.cleiton.financiamento.service.impl.ClienteServiceImlp;


@Controller
public class HomeController {
	
	@Autowired
	private ClienteServiceImlp service;

	@GetMapping("/")
	public ModelAndView home() {
		ModelAndView view = new ModelAndView("ListaClientes");
		List<ClienteDto> clientes = service.listaCategorias();
		view.addObject("clientes", clientes);
		return view;		
	}
}
