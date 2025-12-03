package com.dam.ej9;

import java.util.Random;

/*
 * Queremos realizar una encuesta a 10 personas, en esta encuesta
indicaremos el sexo (1=masculino, 2=femenino), si trabaja (1=si trabaja,
2= no trabaja) y su sueldo (si tiene un trabajo, sino será un cero)
estará entre 600 y 2000 (valor entero). Los valores pueden ser
generados aleatoriamente. Calcula y muestra lo siguiente:
• Porcentaje de hombres (tengan o no trabajo).
• Porcentaje de mujeres (tengan o no trabajo).
• Porcentaje de hombres que trabajan.
• Porcentaje de mujeres que trabajan.
• El sueldo promedio de los hombres que trabajan.
• EL sueldo promedio de las mujeres que trabajan.
Usa todos los métodos que veas necesarios, piensa que es aquello que
se repite o que puede ser mejor tenerlo por separado.
 */

public class mainEj9 {
	
	static final int CANT_P = 10;
	static Random rd = new Random();
	
	static Persona p[];

	public static void main(String[] args) {
		
		//Crear array y rellenar con las personas
		crearArrayPersonas();
		
		//mostrar array
		mostrarP();
		
		//Realizar el análisis y cálculos
		realizarCalculos();
		

	}
	
	private static void realizarCalculos() {
		int contH = 0;
		int contM = 0;
		int contHT = 0;
		int contMT = 0;
		double sumaSHT = 0;//Sumar salarios de los hombres que trabajan
		double sumaSMT = 0;
		
		for(int i = 0; i < p.length; i++) {
			
			if(p[i].getSexo() ==  Persona.SEXO[0]) {
				contH++;
				
				if(p[i].getTrabaja() == Persona.TRABAJA[0]) {
					contHT++;
					
					sumaSHT += p[i].getSueldo();
				}
				
			}else {
				contM++;
				
				if(p[i].getTrabaja() == Persona.TRABAJA[0]) {
					contMT++;
					
					sumaSMT += p[i].getSueldo();
				}
			}	
		}
		
		//porcentaje de Hombres
		double porcH = (double) contH * 100 / p.length;
		
		//Porcentaje de mujeres
		double porcM = (double) contM * 100 / p.length;
		
		//Porcentaje de hombres que trabajan 
		double porcHT = 0;
		if(contH != 0) {
			porcHT = (double)contHT * 100 / contH;
		}
		
		double porcMT = 0;
		if(contM != 0) {
			porcMT = (double)contMT * 100 / contM;
		}
		
		//Media de salario de hombres que trabajan
		double mediaSHT = 0;
		
		if(contHT != 0) {
			mediaSHT = sumaSHT / contHT;
		}
		
		double mediaSMT = 0;
		
		if(contMT != 0) {
			mediaSMT = sumaSMT / contMT;
		}
		
		System.out.println("##Resultados de los cálculos realizados: ");
		System.out.println("Porcentaje de hombres: " + porcH + "\nPorcentaje de mujeres: " + porcM);
		System.out.println("Porcentaje de hombres que trabajan: " + porcHT + "\nPorcentaje de mujeres que trabajan: " + porcMT);
		System.out.println("Media de salario de hombres que trabajan: " + mediaSHT + "\nMedia de salario de mujeres que trabajan: " + mediaSMT);
		
	}
	
	
	//No se pide pero lo hacemos para comprobaciones
	private static void mostrarP() {
		System.out.println("##Datos de encuestas realizadas##\n");
		for(int i = 0; i < p.length; i++) {
			System.out.println(p[i] + "\n");
		}
		
	}
	
	
	private static void crearArrayPersonas() {
		p = new Persona[CANT_P];
		
		//Rellenar array generando personas aleatorias
		for(int i = 0; i < p.length; i++) {
			p[i] = new Persona();
		}
	}
}
