package com.ec.edu.uce.ascensor;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainAscensor {

	private static final Logger LOG = LoggerFactory.getLogger(MainAscensor.class);

	public static void main(String[] args) {
		SpringApplication.run(MainAscensor.class, args);
		Scanner sc = new Scanner(System.in);

		Ascensor as = new Ascensor(10);
		

		LOG.info("Ingrese el piso actual");
		int pisoActual = sc.nextInt();
		as.setPisoActual(pisoActual);
		LOG.info("Ingrese el piso Llegada");
		int pisoLlegada = sc.nextInt();

		if (pisoLlegada >= 0) {
			if (pisoLlegada > pisoActual) {
				as.subir( pisoLlegada);
			} else if (pisoLlegada == pisoActual) {
				LOG.warn("!!!!!!!!se encuentra en el piso de su destino!!!!!!!");
			} else if (pisoLlegada < pisoActual) {
				as.bajar(pisoLlegada);
			} 
		}else {
			LOG.error("ERROR NO EXISTEN PISOS MENORES A LA PLANTA BAJA");
		}

	}

}
