package com.dam.model;

public class Encuesta {
	
	//Constantes
	public static final String POSIBLES_SINTOMAS[] = {"Síntomas respiratorios","Perdida del olfato", "Dolor de cabeza", "Sin sintomas" ,"Cansancio/Malestar","Perdida del gusto", "Fiebre","Tos seca"};
	
	public static final int NIVELES_DE_GRAVEDAD [] = {1,2,3,4,5};
	public static final String NIVELES_DE_GRAVEDAD_S []= {"Ninguna","Leve","Media","Alta","Hospitalizaación"};
	
	public static final String HA_PASADO_COVID_RESP []= {"Si","No"};

	//Atributos
	private int edad;
	private String covid;
	private String sintomas[] = new String [7];
	private int nGravedad;
	

	//Constructores
	public Encuesta() {}
	
	public Encuesta(int edad,String covid, String sintomas[], int nGravedad) {
		this.edad=edad;
		this.covid=covid;
		this.sintomas=sintomas;
		this.nGravedad=nGravedad;
	}
	
	public String toString() {
		return edad + " ¿Covid?" + covid + " Sintomas: " + sintomas; 
	}
}	
