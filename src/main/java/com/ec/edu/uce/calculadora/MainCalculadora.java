package com.ec.edu.uce.calculadora;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainCalculadora {

	private static final Logger LOG = LogManager.getRootLogger();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(MainCalculadora.class, args);
		Scanner sc = new Scanner(System.in);

		Calculadora cl = new Calculadora();

		LOG.info("Que operacion desea realizar: ");
		LOG.info("(1) Suma");
		LOG.info("(2) Resta");
		LOG.info("(3) Multiplicacion");
		LOG.info("(4) Division");
		LOG.info("(5) Exponencial");

		int op = sc.nextInt();

		LOG.info("Ingrese num1: ");

		double num1 = sc.nextDouble();

		LOG.info("Ingrese num2: ");

		double num2 = sc.nextDouble();

		switch (op) {
		case 1:
			cl.suma(num1, num2);
			
			break;
		case 2:
			cl.resta(num1, num2);
			break;
		case 3:
			cl.producto(num1, num2);
			break;
		case 4:
			cl.division(num1, num2);
			break;

		default:
			LOG.fatal("Error funcionalidad corrupta, reiniciar el sistema!!!");
			break;
		}
	}

}
