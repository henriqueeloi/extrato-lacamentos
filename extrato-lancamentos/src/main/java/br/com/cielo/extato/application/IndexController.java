package br.com.cielo.extato.application;

import java.util.ArrayList;
import java.util.List;

import org.springframework.hateoas.Link;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

@Controller
@RequestMapping("/")
public class IndexController {

	@RequestMapping(value="/", method = RequestMethod.GET)
	public HttpEntity<List<Link>> showLinks() {
		List<Link> links = new ArrayList<Link>();
		Link contas = linkTo(LancamentosController.class).withSelfRel();

		links.add(contas);
		return new HttpEntity<List<Link>>(links);
	}
	
}
