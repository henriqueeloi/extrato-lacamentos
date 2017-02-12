package br.com.cielo.extato.infrastructure;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.cielo.extato.domain.DadosDomicilioBancario;

public interface DadosDomicilioBancarioRepository extends MongoRepository<DadosDomicilioBancario, String> {
    public DadosDomicilioBancario findByFirstName(String firstName);
    public List<DadosDomicilioBancario> findByLastName(String lastName);
}
