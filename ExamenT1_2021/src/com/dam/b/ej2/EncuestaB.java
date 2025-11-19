package com.dam.b.ej2;

public class EncuestaB {
	
	//Constantes
	static final String POSIBLES_SINTOMAS[] = {"Síntomas respiratorios", "Diarrea","Cansancio o Malestar","Perdida del olfato","Perdida del gusto", "Fiebre","Sin síntomas"};
	
	static final int NIVELES_DE_GRAVEDAD [] = {1,2,3,4,5};
	static final String NIVELES_DE_GRAVEDAD_S []= {"Ninguna","Leve","Media","Alta","Hospitalizaación"};
	
	static final String HA_PASADO_COVID_RESP []= {"Si","No"};
			
	//Atributos
	private int edad;
	private String haPasadoCovid;
	private String sintomas;
	private int nivelGravedad;
	
	
	public EncuestaB(int edad, String haPasadoCovid, String sintomas, int nivelGravedad) {
		super();
		this.edad = edad;
		this.haPasadoCovid = haPasadoCovid;
		this.sintomas = sintomas;
		this.nivelGravedad = nivelGravedad;
	}


	//ToString
	public String toString() {
		return "Edad: " + edad + " años\n  ¿Ha pasado usted el covid-19? " + haPasadoCovid + "\n¿Qué síntomas padeció? " + sintomas
				+ "\nNivel de gravedad: " + traducirNivelGravedad();
	}

	//Métodos
	private String traducirNivelGravedad() {
		String palabraNG = null;
		
		palabraNG = NIVELES_DE_GRAVEDAD_S[nivelGravedad-1];
		
		return palabraNG;
	}
	
	public boolean padecioSintomaYN(String sintoma) {
		String arraySintomas [] = sintomas.split(",");
		boolean tieneSintoma = false;
		
		for(int i = 0; i < arraySintomas.length; i++) {
			if(sintoma.equalsIgnoreCase(arraySintomas[i].trim())) {
				tieneSintoma = true;
			}
		}
		return tieneSintoma;
	}
}
