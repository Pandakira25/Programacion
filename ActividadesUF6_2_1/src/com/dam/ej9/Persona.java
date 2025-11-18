package com.dam.ej9;

import java.util.Random;

public class Persona {
	
	public static final int SEXO[] = {1,2};
	public static final String SEXO_S[] = {"Hombre","Mujer"};
	
	public static final int TRABAJA[] = {1,2};
	public static final String TRABAJA_S[] = {"Si","no"};
	
	public static final int SALARIO_MIN = 600;
	public static final int SALARIO_MAX = 2000;
	
	//Atributos
	private int sexo;
	private int trabaja;
	private int sueldo;
	
	//Constructores
	public Persona() {//Constructor por defecto genera los valores directamente
		Random rd = new Random();
		sexo = rd.nextInt(SEXO[0],SEXO[1]+1);
		trabaja = rd.nextInt(TRABAJA[0],TRABAJA[1]+1);
		sueldo = 0;
		
		if(trabaja == TRABAJA[0]) {
			sueldo = rd.nextInt(SALARIO_MIN,SALARIO_MAX);
		}
	}
	
	public Persona (int sexo, int laburo, int sueldo) {
		this.sexo = sexo;
		this.trabaja = laburo;
		this.sueldo = sueldo;
	}
	
	
	
	//Geters
	public int getSexo() {
		return sexo;
	}


	public int getTrabaja() {
		return trabaja;
	}

	public int getSueldo() {
		return sueldo;
	}
	
	public String toString() {
		String valor = "";
		
		valor += (sexo == SEXO[0])? SEXO_S[0]:SEXO_S[1] ;
		valor += "\n¿Trabaja?" + ((trabaja == TRABAJA[0])? TRABAJA_S[0]:TRABAJA_S[1]);
		valor += (trabaja == TRABAJA[0])? "\nSalario:" + sueldo : "" ;
		
		return valor;
	}
	
	
}
