package br.com.cielo.extato.application;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.cielo.extato.domain.ControleLancamento;
import br.com.cielo.extato.domain.DomicilioBancario;
import br.com.cielo.extato.domain.LancamentoContaCorrenteCliente;
import br.com.cielo.extato.infrastructure.ControleLancamentoRepository;

@RestController
@RequestMapping(value = "contas", produces = MediaType.APPLICATION_JSON_VALUE)
public class LancamentosController {

	@Autowired
	private ControleLancamentoRepository controleLancamentoRepository;

	
//	@RequestMapping(value="/lancamentos", method = RequestMethod.GET)
//	public ResponseEntity<List<LancamentoResource>> get() {
//						
//		DomicilioBancario domicilioBancario = new DomicilioBancario(new Banco(), 1l, "00000000065470");
//		LancamentoContaCorrenteCliente lancamentoContaCorrenteCliente = new LancamentoContaCorrenteCliente(64320236054l, "Pago", 
//				domicilioBancario, "regular", null);		
//		ControleLancamento controleLancamento = new ControleLancamento(lancamentoContaCorrenteCliente, 
//				LocalDate.of(2016, 06, 03), 
//				LocalDate.of(2016, 06, 03), 
//				42236790, "LA-56", "1", 
//				"BANCO ABCD S.A.             ", 22, "12996721", "1597", 11499.1, 1464922800000l, 1464922800000l);
//		
//		controleLancamentoRepository.save(controleLancamento);
//		
//		ControleLancamento controleLancamento1 = controleLancamentoRepository.findOne(1l);
//				
//		Mapper mapper = new DozerBeanMapper();
//		LancamentoResource destObject =  mapper.map(controleLancamento1, LancamentoResource.class);
//				
//		 
//		List<LancamentoResource> lancamentoResource = null;
//		return new ResponseEntity<List<LancamentoResource>>(lancamentoResource , HttpStatus.OK);
//	}
	
//	@RequestMapping(value = "/planets", method = RequestMethod.GET)
//	public ResponseEntity<List<PlanetResource>> getPlanets() {
//
//		List<PlanetResource> listPlanets = new ArrayList<PlanetResource>();
//
//		planetDao.listPlanets().forEach(l -> {
//			PlanetResource resource = new PlanetResource(l);
//			resource.add(linkTo(methodOn(PlanetController.class).getPlaneta(l.getName())).withSelfRel());
//			listPlanets.add(resource);
//		});
//
//		return new ResponseEntity<List<PlanetResource>>(listPlanets, HttpStatus.OK);
//	}
}
