//package br.com.cielo.extato.infrastructure;
//
//import java.io.FileNotFoundException;
//import java.io.UnsupportedEncodingException;
//import java.time.LocalDateTime;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.stereotype.Component;
//
//import br.com.cielo.extato.service.ImportaLancamentosService;
//import net.minidev.json.parser.ParseException;
//
//@Component
//public class ScheduleLancamentosEmLoteProcesso {
//
//	@Autowired
//	private ImportaLancamentosService importaLancamentosService;
//	
//	private Logger logger = LoggerFactory.getLogger(this.getClass());
//	
//	@Scheduled(cron = "0 0/30 * * * ?")
//	public void transmitTransactions() throws FileNotFoundException, UnsupportedEncodingException, ParseException {
//		
//		
//		logger.info("Integrating Lancamentos at: {}", LocalDateTime.now());
//		
//		importaLancamentosService.start();
//		
//		
//	}
//
//	
//	
//}
