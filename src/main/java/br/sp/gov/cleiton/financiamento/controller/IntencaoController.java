package br.sp.gov.cleiton.financiamento.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.sp.gov.cleiton.financiamento.dto.ClienteDto;
import br.sp.gov.cleiton.financiamento.service.impl.ClienteServiceImlp;

@Controller
public class IntencaoController {
	
	@Autowired
	ClienteServiceImlp service;

	@GetMapping("novo-cliente")
	public ModelAndView HomeIntencao() {
		ModelAndView view = new ModelAndView("IntencaoCadastro");
		view.addObject("cliente", new ClienteDto());
		return view;
	}

	@PostMapping("salva-cliente")
	public String SalvaCliente(@Valid ClienteDto clienteDto, BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("cliente", clienteDto);
			return "IntencaoCadastro";
		}		
		service.salvarCliente(clienteDto);
		return "redirect:/";
	}
	
	@GetMapping("/cliente/{id}")
	public ModelAndView editarCliente(@PathVariable Long id) {		
		ModelAndView view = new ModelAndView("IntencaoCadastro");	
		ClienteDto clienteDto = service.editarCliente(id);
		view.addObject("cliente", clienteDto);
		return view;		
	}
	

}
