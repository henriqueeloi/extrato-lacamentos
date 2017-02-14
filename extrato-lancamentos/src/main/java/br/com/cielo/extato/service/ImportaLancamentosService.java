package br.com.cielo.extato.service;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cielo.extato.domain.ControleLancamento;
import br.com.cielo.extato.domain.LancamentoContaLegado;
import br.com.cielo.extato.infrastructure.ControleLancamentoRepository;

@Service
public class ImportaLancamentosService {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private ControleLancamentoRepository repository;
	
	public void start() throws JsonProcessingException, IOException {
		 		 
		ObjectMapper mapper = new ObjectMapper();
		
		mapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
				
		File arquivo = new File("file/lancamento-conta-legado.json");
		LancamentoContaLegado file = mapper.readValue(arquivo, LancamentoContaLegado.class);
						
		logger.info("Inicio Carregado!");
		
		repository.save(file.getListaControleLancamento());
		
		arquivo.renameTo(new File("file/processado/" + LocalDate.now().toString()));
		
		logger.info("Fim Carregado!");					
				
	}
	
}
