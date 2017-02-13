package br.com.cielo.extato.application;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.cielo.extato.domain.ControleLancamento;
import br.com.cielo.extato.domain.DomicilioBancario;
import br.com.cielo.extato.domain.LancamentoContaCorrenteCliente;
import br.com.cielo.extato.infrastructure.ControleLancamentoRepository;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;


@RestController
@RequestMapping(value = "contas", produces = MediaType.APPLICATION_JSON_VALUE)
public class LancamentosController {

	@Autowired
	private ControleLancamentoRepository controleLancamentoRepository;

	Mapper mapper = new DozerBeanMapper();
	
	@RequestMapping(value="/lancamentos", method = RequestMethod.GET)
	public ResponseEntity<List<LancamentoResource>> get() {
								
		DomicilioBancario domicilioBancario = new DomicilioBancario(123l, 1l, "00000000065470");
		LancamentoContaCorrenteCliente lancamentoContaCorrenteCliente = new LancamentoContaCorrenteCliente(64320236054l, "Pago", 
				domicilioBancario, "regular", null);		
		ControleLancamento controleLancamento = new ControleLancamento("1", lancamentoContaCorrenteCliente, 
				LocalDate.of(2016, 06, 03), 
				LocalDate.of(2016, 06, 03), 
				42236790, "LA-56",  
				"BANCO ABCD S.A.             ", 22, "12996721", "1597", 11499.1, 1464922800000l, 1464922800000l);
		
		controleLancamentoRepository.save(controleLancamento);

		DomicilioBancario domicilioBancario1 = new DomicilioBancario(123l, 1l, "00000000065470");
		LancamentoContaCorrenteCliente lancamentoContaCorrenteCliente1 = new LancamentoContaCorrenteCliente(64320236054l, "Pago", 
				domicilioBancario1, "regular", null);		
		ControleLancamento controleLancamento1 = new ControleLancamento("25", lancamentoContaCorrenteCliente1, 
				LocalDate.of(2016, 06, 03),
				LocalDate.of(2016, 06, 03),
				42236790, "LA-56",
				"BANCO ABCD S.A.             ", 22, "12996721", "1597", 11499.1, 1464922800000l, 1464922800000l);
		
		controleLancamentoRepository.save(controleLancamento1);
		
		List<LancamentoResource> listaRetorno = controleLancamentoRepository.findAll().stream().map(a -> mapper.map(a, LancamentoResource.class)).collect(Collectors.toList());		
		listaRetorno.forEach(l -> l.add(linkTo(methodOn(LancamentosController.class).getLancamento(l.getCodigoIdentificadorUnico())).withSelfRel()));
				
		return new ResponseEntity<List<LancamentoResource>>(listaRetorno , HttpStatus.OK);
	}
	
	@RequestMapping(value="/lancamento/{codigoIdentificadorUnico}", method = RequestMethod.GET)
	public ResponseEntity<LancamentoResource> getLancamento(@PathVariable String codigoIdentificadorUnico) {
		
		ControleLancamento findByCodigoIdentificadorUnico = controleLancamentoRepository.findOne(codigoIdentificadorUnico);
		LancamentoResource resource = mapper.map(findByCodigoIdentificadorUnico, LancamentoResource.class);
		
		resource.add(linkTo(methodOn(LancamentosController.class).get()).withSelfRel());
				
		return new ResponseEntity<LancamentoResource>(resource , HttpStatus.OK);		
	}
	
}
