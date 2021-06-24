package br.sp.gov.cleiton.financiamento.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.sp.gov.cleiton.financiamento.dto.ClienteDto;
import br.sp.gov.cleiton.financiamento.entity.ClienteEntity;
import br.sp.gov.cleiton.financiamento.repository.ClientesRepository;
import br.sp.gov.cleiton.financiamento.service.HomeService;

@Service
public class ClienteServiceImlp implements  HomeService{
	
	@Autowired
	private ClientesRepository repository;

	@Override
	public List<ClienteDto> listaCategorias() {
		List<ClienteEntity> lista = repository.findAll();
		List<ClienteDto> clientes = fromTo(lista);
		return clientes;
	}
	
	@Override
	public ClienteDto salvarCliente(ClienteDto clienteDto) {
		ClienteEntity entity = fromTo(clienteDto);
		entity = repository.save(entity);
		ClienteDto clienteRetorno = fromTo(entity);
		return clienteRetorno;
	}
	
	@Override
	public ClienteDto editarCliente(Long id) {
		ClienteEntity entity = repository.findById(id).get();		
		return fromTo(entity);
	}
	
	private List<ClienteDto> fromTo(List<ClienteEntity> lista){
		List<ClienteDto> listaDto = new ArrayList<>();
		for (ClienteEntity clienteEntity : lista) {
		ClienteDto dto = new ClienteDto();
		dto.setId(clienteEntity.getId());
		dto.setNomeCliente(clienteEntity.getNomeCliente());
		dto.setEndereco(clienteEntity.getEndereco());
		dto.setnCasa(clienteEntity.getnCasa());
		dto.setCidade(clienteEntity.getCidade());
		dto.setCep(clienteEntity.getCep());
		dto.setContatos(clienteEntity.getContatos());
		dto.setCpf(clienteEntity.getCpf());
		dto.setRg(clienteEntity.getRg());
		dto.setDataNascimento(clienteEntity.getDataNascimento());
		dto.setEmail(clienteEntity.getEmail());
		dto.setTelefoneResidencial(clienteEntity.getTelefoneResidencial());
		dto.setQuantidadeParcelas(clienteEntity.getQuantidadeParcelas());
		dto.setSalario(clienteEntity.getSalario());
		dto.setCategoria(clienteEntity.getCategoria());
		dto.setValorIntencao(clienteEntity.getValorIntencao());
		listaDto.add(dto);
		}
		return listaDto;
	}
	
	private ClienteEntity fromTo(ClienteDto clienteDto) {
		ClienteEntity entity = new ClienteEntity();
		entity.setId(clienteDto.getId());
		entity.setNomeCliente(clienteDto.getNomeCliente());
		entity.setEndereco(clienteDto.getEndereco());
		entity.setnCasa(clienteDto.getnCasa());
		entity.setCidade(clienteDto.getCidade());
		entity.setCep(clienteDto.getCep());
		entity.setContatos(clienteDto.getContatos());
		entity.setCpf(clienteDto.getCpf());
		entity.setRg(clienteDto.getRg());
		entity.setDataNascimento(clienteDto.getDataNascimento());
		entity.setEmail(clienteDto.getEmail());
		entity.setTelefoneResidencial(clienteDto.getTelefoneResidencial());
		entity.setQuantidadeParcelas(clienteDto.getQuantidadeParcelas());
		entity.setSalario(clienteDto.getSalario());
		entity.setCategoria(clienteDto.getCategoria());
		entity.setValorIntencao(clienteDto.getValorIntencao());
		return entity;
	}
	
	
	private ClienteDto fromTo(ClienteEntity entity) {
		ClienteDto clienteDto = new ClienteDto();
		clienteDto.setId(entity.getId());
		clienteDto.setNomeCliente(entity.getNomeCliente());
		clienteDto.setEndereco(entity.getEndereco());
		clienteDto.setnCasa(entity.getnCasa());
		clienteDto.setCidade(entity.getCidade());
		clienteDto.setCep(entity.getCep());
		clienteDto.setContatos(entity.getContatos());
		clienteDto.setCpf(entity.getCpf());
		clienteDto.setRg(entity.getRg());
		clienteDto.setDataNascimento(entity.getDataNascimento());
		clienteDto.setEmail(entity.getEmail());
		clienteDto.setTelefoneResidencial(entity.getTelefoneResidencial());
		clienteDto.setQuantidadeParcelas(entity.getQuantidadeParcelas());
		clienteDto.setSalario(entity.getSalario());
		clienteDto.setCategoria(entity.getCategoria());
		clienteDto.setValorIntencao(entity.getValorIntencao());
		return clienteDto;
	}
}
