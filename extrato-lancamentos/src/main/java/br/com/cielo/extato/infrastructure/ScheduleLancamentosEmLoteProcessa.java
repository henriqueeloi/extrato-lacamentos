package br.com.cielo.extato.infrastructure;

import java.io.IOException;
import java.time.LocalDateTime;


import org.codehaus.jackson.JsonProcessingException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import br.com.cielo.extato.service.ImportaLancamentosService;

@Component
public class ScheduleLancamentosEmLoteProcessa {

	@Autowired
	private ImportaLancamentosService importaLancamentosService;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
//	* "0 0 * * * *" = the top of every hour of every day.
//	* "*/10 * * * * *" = every ten seconds.
//	* "0 0 8-10 * * *" = 8, 9 and 10 o'clock of every day.
//	* "0 0/30 8-10 * * *" = 8:00, 8:30, 9:00, 9:30 and 10 o'clock every day.
//	* "0 0 9-17 * * MON-FRI" = on the hour nine-to-five weekdays
//	* "0 0 0 25 12 ?" = every Christmas Day at midnight
//	Cron expression is represented by six fields:
//	second, minute, hour, day of month, month, day(s) of week
	@Scheduled(cron = "*/30 * * * * *")
	public void processar() throws JsonProcessingException, IOException {
				
		logger.info("Integrating Lancamentos at: {}", LocalDateTime.now());
		
		importaLancamentosService.start();
				
	}
	
}
