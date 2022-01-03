package com.ec.edu.uce.ascensor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Ascensor {
	
	private int pisoActual;
	private int numPisos;
	
	private static final Logger LOG =  LoggerFactory.getLogger(Ascensor.class);
	
	public Ascensor(int numPisos) {
		this.numPisos = numPisos;
	}
	
	public void subir(int pisoLlegada) {
		if(pisoActual <= this.numPisos&& pisoLlegada <= numPisos) {
			for(int i=pisoActual; i!=pisoLlegada;i++) {
				
				LOG.debug("su piso actual es el: {}", i);	
				LOG.trace("el ascensor esta subiendo desde el piso {}", i);
			}
			this.pisoActual = pisoLlegada;
			LOG.info("Ha llegado a su destino");
			LOG.info("piso: {}", pisoActual);
						
		}else {
			LOG.error("ERROR NUMERO DE PISO INCORRECTO");
		}
		
	}
	public void bajar(int pisoLlegada) {
		if(pisoActual <= this.numPisos&& pisoLlegada <= numPisos) {
			for(int i=pisoActual; i!=pisoLlegada;i--) {
				LOG.debug("su piso actual es el: {}", i);	
				LOG.trace("el ascensor esta bajando desde el piso {}", i);
			}
			this.pisoActual = pisoLlegada;
			LOG.info("Ha llegado a su destino");
			LOG.info("piso: {}", pisoActual);
						
		}else {
			LOG.error("ERROR NUMERO DE PISO INCORRECTO");
		}
		
	}
	
	// METODOS GET Y SET
	public int getPisoActual() {
		return pisoActual;
	}
	public void setPisoActual(int pisoActual) {
		this.pisoActual = pisoActual;
	}

	public int getNumPisos() {
		return numPisos;
	}
	public void setNumPisos(int numPisos) {
		this.numPisos = numPisos;
	}


}
