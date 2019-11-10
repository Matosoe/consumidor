package br.com.perfilcar.consumidor.resources;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.perfilcar.consumidor.models.Log;
import br.com.perfilcar.consumidor.repository.LogRepository;

@RestController
@RequestMapping(path = "/log")
public class LogResource {


	@Autowired
	LogRepository logRepository;
	
	
	@GetMapping("/log")
	public List<Log> listaLogs(){ 
	
		return logRepository.findAll();
	}

}