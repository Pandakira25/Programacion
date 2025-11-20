package com.dam.a.ej2;

public class Encuesta {
	
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
	

	//Constructores
	public Encuesta() {}
	
	public Encuesta(int edad, String haPasadoCovid, String sintomas, int nivelGravedad) {
		
		this.edad = edad;
		this.haPasadoCovid = haPasadoCovid;
		this.sintomas = sintomas;
		this.nivelGravedad = nivelGravedad;
	}
	
	//Geters
	public String getHaPasadoCovid() {
		return haPasadoCovid;
	}
	
	public static String[] getHaPasadoCovidResp() {
		return HA_PASADO_COVID_RESP;
	}
	
	public int getNivelGravedad() {
		return nivelGravedad;
	}

	public static int[] getNivelesDeGravedad() {
		return NIVELES_DE_GRAVEDAD;
	}
	
	public int getEdad() {
		return edad;
	}

	//ToString
	public String toString() {
		return "Edad: " + edad + " años\n  ¿Ha pasado usted el covid-19? " + haPasadoCovid + "\n¿Qué síntomas padeció? " + sintomas
				+ "\nNivel de gravedad: " + traducirNivelGravedad() +"\n";
	}
	
	//Métodos
	public String traducirNivelGravedad() {
		String palabraNG = null;
		
		//for (int i = 0; i < NIVELES_DE_GRAVEDAD.length; i++) {
		//	if(nivelGravedad == NIVELES_DE_GRAVEDAD[i]) {
		//		palabraNG = NIVELES_DE_GRAVEDAD_S[i];
		//	}
		//}
		
		palabraNG = NIVELES_DE_GRAVEDAD_S[nivelGravedad-1];
		
		return palabraNG;
	}
	
	/*
	 * public int calcularNumSintomas() {
		int contSint = 0;
		
		if(sintomas.length() > 0) {
			contSint++;
			//Buscar comas
			int indiceComa = sintomas.indexOf(",");
			
			while(indiceComa > 0) {
				contSint++;
				indiceComa = sintomas.indexOf(",",indiceComa);
			}
		}
		return contSint;
	}
	 */
	
	public int calcularNumSintomas() {
		String arraySintomas[] = sintomas.split(",");//Dividide una cadena de caracteres dependiendo del caracter que le indiques
		
		return arraySintomas.length;
	}
	
	

}
