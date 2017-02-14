package br.com.cielo.extato.service;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.springframework.stereotype.Service;

import br.com.cielo.extato.domain.ControleLancamento;
import br.com.cielo.extato.domain.LancamentoContaLegado;

@Service
public class ImportaLancamentosService {
	
	private JsonNode readTree;

	public void start() throws JsonProcessingException, IOException {
		 		 
		ObjectMapper mapper = new ObjectMapper();
		String jsonInString = "{'name' : 'mkyong'}";
		
		ClassLoader classLoader = getClass().getClassLoader();
				
		mapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
				
		//List<ControleLancamento> readValue2 = mapper.readValue(new File("lancamento-conta-legado.json"), new TypeReference<List<ControleLancamento>>(){});
		LancamentoContaLegado readValue2 = mapper.readValue(new File("lancamento-conta-legado.json"), LancamentoContaLegado.class);
		
		readTree = mapper.readTree(new File("lancamento-conta-legado.json"));
		
//		Object readValue = mapper.readValue(classLoader.getResourceAsStream("file/lancamento-conta-legado.json").toString(), new TypeReference<List<ControleLancamento>>() {});
		
		//mapper.readValue(classLoader.getResourceAsStream("file/arquivo.json"), valueType);
				
		//JSON from file to Object
		//Staff obj = mapper.readValue(new File("c:\\file.json"), Staff.class);

		
				
	}
	
}
