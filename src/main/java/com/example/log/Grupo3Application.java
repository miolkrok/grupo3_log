package com.example.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Grupo3Application {
	
	private static final Logger LOG =  LoggerFactory.getLogger(Grupo3Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Grupo3Application.class, args);
		LOG.error("ERRORES EN TIEMPO DE EJECUCION O CONDICIONES INESPERADAS ");
		LOG.warn("USO DE API OBSOLETA 'CASI ERROR' ");
		LOG.info("EVENTOS INTERESANTES EN TIEMPO DE EJECUCION");
		LOG.debug("información detallada sobre el flujo a través del sistema.");
		LOG.trace("INFORMACION MAS DETALLADA");
		
	}

}
