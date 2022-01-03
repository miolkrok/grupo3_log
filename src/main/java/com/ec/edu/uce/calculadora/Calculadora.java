package com.ec.edu.uce.calculadora;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculadora {

	private double num1;
	private double num2;
	
	private static final Logger LOG = LogManager.getRootLogger();
	
	
	public double suma(double num1, double num2) {
		if (num1 > 0 && num2 > 0) {
			LOG.info("La suma es : {} ",  num1 + num2);
		} else {
			LOG.warn("Se recomienda ingresar solo numeros positivos");
			LOG.info("La suma es : {} " , (num1 + num2));
		}
		return num1 + num2;
	}
	
	public double resta(double num1, double num2) {
		LOG.info("La resta es: {}  ", (num1 - num2));
		return num1 - num2;
	}
	
	public double producto(double num1, double num2) {
		LOG.info("El producto es: {}  ", (num1 * num2));
		return num1 * num2;
	}
	
	public double division(double num1, double num2) {
		if (num2 != 0) {
			LOG.info("La division es: {}  ", (num1 / num2));
		} else {
			LOG.error("ERROR: el divisor no puede ser cero");
		}
		return num1 / num2;
	}
	
	// SET - GET
	public double getNum1() {
		return num1;
	}
	public void setNum1(double num1) {
		this.num1 = num1;
	}
	public double getNum2() {
		return num2;
	}
	public void setNum2(double num2) {
		this.num2 = num2;
	}
	
	
	
}
