package br.com.cielo.extato.application;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.cielo.extato.domain.ControleLancamento;
import br.com.cielo.extato.infrastructure.ControleLancamentoRepository;


@RestController
@RequestMapping(value = "/api/", produces = MediaType.APPLICATION_JSON_VALUE)
public class LancamentosController {

	@Autowired
	private ControleLancamentoRepository controleLancamentoRepository;

	Mapper mapper = new DozerBeanMapper();

	@RequestMapping(method = RequestMethod.GET)
	public HttpEntity<List<Link>> index() {
		List<Link> links = new ArrayList<Link>();
		Link lancamentos = linkTo(methodOn(LancamentosController.class).get()).withRel("lancamentos");

		links.add(lancamentos);
		return new HttpEntity<List<Link>>(links);
	}
	
	@RequestMapping(value="/lancamentos", method = RequestMethod.GET)
	public ResponseEntity<List<LancamentoResource>> get() {
				
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
