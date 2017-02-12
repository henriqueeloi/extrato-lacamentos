package br.com.cielo.extato.infrastructure;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.cielo.extato.domain.ControleLancamento;

public interface ControleLancamentoRepository extends CrudRepository<ControleLancamento, Long> {

    List<ControleLancamento> findAll();
}

