package br.com.cielo.extato.infrastructure;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduleLancamentosEmLoteProcesso {

	@Autowired
	private ImportaLancamentosService importaLancamentosService;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Scheduled(cron = "0 0/30 * * * ?")
	public void transmitTransactions() {
		
		
		logger.info("Integrating Lancamentos at: {}", LocalDateTime.now());
		
		importaLancamentosService.start();
		
		
	}

	
	
}
