package br.sp.gov.cleiton.financiamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.sp.gov.cleiton.financiamento.entity.ClienteEntity;

@Repository
public interface ClientesRepository extends JpaRepository<ClienteEntity, Long> {

}
