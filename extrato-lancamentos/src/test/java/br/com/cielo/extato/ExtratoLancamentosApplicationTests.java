package br.com.cielo.extato;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.format.datetime.joda.LocalDateParser;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.cielo.extato.domain.Banco;
import br.com.cielo.extato.domain.ControleLancamento;
import br.com.cielo.extato.domain.DomicilioBancario;
import br.com.cielo.extato.domain.LancamentoContaCorrenteCliente;
import br.com.cielo.extato.infrastructure.BancoRepository;
import br.com.cielo.extato.infrastructure.ControleLancamentoRepository;
import br.com.cielo.extato.infrastructure.DomicilioBancarioRepository;
import br.com.cielo.extato.infrastructure.LancamentoContaCorrenteClienteRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ExtratoLancamentosApplicationTests {

	@Autowired
	private ControleLancamentoRepository controleLancamentoRepository;
	
	@Autowired
	private BancoRepository bancoRepository;

	
//	@Test
//	public void deveGravaLancamentosControle(){
//		
//		DomicilioBancario domicilioBancario = new DomicilioBancario(new Banco("123"), 1l, "00000000065470");
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
//		ControleLancamento findOne = controleLancamentoRepository.findOne(1l);
//		
//		Assert.hasText(findOne.getLancamentoContaCorrenteCliente().getDadosDomicilioBancario().getNumeroContaCorrente());
//		
//	}
	
	@Test
	public void deveRetornarUmBanco(){
		Banco findOne = bancoRepository.findOne(123l);
		Assert.isTrue(findOne.getNome().equals("BANCO ABCD S.A"));
	}
}
