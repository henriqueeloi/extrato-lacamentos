package br.com.cielo.extato.application;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.cielo.extato.domain.DadosDomicilioBancario;
import br.com.cielo.extato.infrastructure.DadosDomicilioBancarioRepository;

@RestController(value="contas/lancamentos")
public class LancamentosController {

	@Autowired
	private DadosDomicilioBancarioRepository dadosDomicilioBancarioRepository;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<DadosDomicilioBancario>> get(@PathVariable String id) {
		
		dadosDomicilioBancarioRepository.save(new DadosDomicilioBancario(10, 1145, "25119-3"));
		
		List<DadosDomicilioBancario> dadosDomicilioBancario = dadosDomicilioBancarioRepository.findAll();
		
		return new ResponseEntity<List<DadosDomicilioBancario>>(dadosDomicilioBancario, HttpStatus.OK);
	}
	
}
