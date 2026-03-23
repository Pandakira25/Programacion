package com.dam.model;

public class Encuesta {
	
	//Constantes
	public static final String POSIBLES_SINTOMAS[] = {"Sin sintomas", "Síntomas respiratorios","Perdida del olfato", "Dolor de cabeza", "Cansancio/Malestar","Perdida del gusto", "Fiebre","Tos seca"};
	
	public static final int NIVELES_DE_GRAVEDAD [] = {1,2,3,4,5};
	public static final String NIVELES_DE_GRAVEDAD_S []= {"Ninguna","Leve","Media","Alta","Hospitalizaación"};
	
	public static final String HA_PASADO_COVID_RESP []= {"No","Si"};

	//Atributos
	private int edad;
	private String covid;
	private String sintomas[] = new String [8];
	private int nGravedad;
	

	//Constructores
	public Encuesta() {}
	
	public Encuesta(int edad,String covid, String sintomas[], int nGravedad) {
		this.edad=edad;
		this.covid=covid;
		this.sintomas=sintomas;
		this.nGravedad=nGravedad;
	}
	
	public Encuesta(int edad, String covid) {
		this.edad=edad;
		this.covid=covid;
	}
	
	public String nGtoString() {
		String nGS = "";
		switch(nGravedad) {
		case 1:
			nGS = NIVELES_DE_GRAVEDAD_S[0];
			break;
		case 2:
			nGS = NIVELES_DE_GRAVEDAD_S[1];
			break;
		case 3:
			nGS = NIVELES_DE_GRAVEDAD_S[2];
			break;
		case 4:
			nGS = NIVELES_DE_GRAVEDAD_S[3];
			break;
		case 5:
			nGS = NIVELES_DE_GRAVEDAD_S[4];
			break;
		}
		return nGS;
	}
	
	public String sintomasToString() {
		String sint = "";
		
		if(sintomas[0] == null || sintomas[0].isBlank()) {
			for(int i = 1; i < sintomas.length; i ++) {
				if(sintomas[i] != null) {
					if(sint.isBlank()) {
						sint = sint + sintomas[i];
					}else {
						sint = sint + ", " + sintomas[i];
					}
				}
			}
		}else{
			sint = POSIBLES_SINTOMAS[0];
		}
		return sint;
	}
	
	public String toString() {
		if(covid.equalsIgnoreCase(HA_PASADO_COVID_RESP[0])) {
			return "Edad: " + edad + " " + " ¿Covid? " + covid;
		}else {
			return "Edad: " + edad + " ¿Covid?" + covid + " Sintomas: " + sintomasToString() + " Gravedad: " + nGtoString(); 
		}
		
	}
}	
