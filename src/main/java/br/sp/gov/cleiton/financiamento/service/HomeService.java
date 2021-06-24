package br.sp.gov.cleiton.financiamento.service;

import java.util.List;

import br.sp.gov.cleiton.financiamento.dto.ClienteDto;


public interface HomeService {
	
	List<ClienteDto> listaCategorias();
	ClienteDto salvarCliente(ClienteDto clienteDto);
	ClienteDto editarCliente(Long id);
	
}
