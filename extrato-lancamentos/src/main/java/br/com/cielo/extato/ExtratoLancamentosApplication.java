package br.com.cielo.extato;

import java.io.IOException;
import java.time.LocalDate;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

import br.com.cielo.extato.domain.ControleLancamento;
import br.com.cielo.extato.domain.DomicilioBancario;
import br.com.cielo.extato.domain.LancamentoContaCorrenteCliente;
import br.com.cielo.extato.infrastructure.ControleLancamentoRepository;
import br.com.cielo.extato.service.ImportaLancamentosService;

@ComponentScan
@EnableMongoRepositories
@SpringBootApplication
public class ExtratoLancamentosApplication {

	@Autowired
	private ControleLancamentoRepository controleLancamentoRepository;
	
	@Autowired
	private ImportaLancamentosService service;
	
	public static void main(String[] args) {
		SpringApplication.run(ExtratoLancamentosApplication.class, args);
	}
	
	@PostConstruct
	public void loadData() throws JsonParseException, JsonMappingException, IOException {
		DomicilioBancario domicilioBancario = new DomicilioBancario(123l, 1l, "00000000065470");
		LancamentoContaCorrenteCliente lancamentoContaCorrenteCliente = new LancamentoContaCorrenteCliente(64320236054l, "Pago", 
				domicilioBancario, "regular", null);		
		ControleLancamento controleLancamento = new ControleLancamento("1", lancamentoContaCorrenteCliente, 
				"2016/06/03", 
				"2016/06/03", 
				42236790, "LA-56",  
				"BANCO ABCD S.A.             ", 22, "12996721", "1597", 11499.1, 1464922800000l, 1464922800000l);
		
		controleLancamentoRepository.save(controleLancamento);
		
		service.start();
	}
}
