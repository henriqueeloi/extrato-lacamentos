package br.com.cielo.extato.infrastructure;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.cielo.extato.domain.LancamentoContaCorrenteCliente;

public interface LancamentoContaCorrenteClienteRepository extends CrudRepository<LancamentoContaCorrenteCliente, Long> {
	public List<LancamentoContaCorrenteCliente> findAll();
}
