package br.com.cielo.extato.infrastructure;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.cielo.extato.domain.Banco;


@Repository
public interface BancoRepository extends CrudRepository<Banco, Long> {
}
