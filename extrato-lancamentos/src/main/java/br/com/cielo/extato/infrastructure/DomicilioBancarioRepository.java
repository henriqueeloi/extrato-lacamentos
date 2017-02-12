package br.com.cielo.extato.infrastructure;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.cielo.extato.domain.DomicilioBancario;


@Repository
public interface DomicilioBancarioRepository extends CrudRepository<DomicilioBancario, Long> {

}
