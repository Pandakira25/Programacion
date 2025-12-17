package com.dam.b.ej2;

import java.util.Scanner;

public class ManejoActividadesD {
	
	static final int CANT_A = 8;
	static final double MIN_D = 60;
	static final double MAX_D = 100000;
	static final double MIN_T = 0.5;
	static final double MAX_T = 2880;
	static final String ACTIVIDADES[] = {"Carrera","Bicicleta","Natación"};
	static final int CAR_F = 16;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ActividadD actividad[] = new ActividadD[CANT_A];
		
		solicitarInfo(actividad, sc);
		sc.close();
		
		mostrarActividades(actividad);
		
		mTC(actividad);
	}
	
	private static void mTC(ActividadD actividad[]) {
		double sumM = 0;
		for(int i = 0; i < actividad.length; i++) {
			if(actividad[i].getDisciplina().equalsIgnoreCase(ACTIVIDADES[0])) {
				sumM += actividad[i].getDistancia();
			}
		}
		System.out.println("Los metros totales recorridos en " + ACTIVIDADES[0] + " son " + sumM);
	}
	
	private static void mostrarActividades(ActividadD actividad[]) {
		for(int i = 0; i < actividad.length; i++) {
			System.out.println("Actividad nº: " + (i+1) + "\n" + actividad[i]);
		}
	}
	
	private static void solicitarInfo(ActividadD actividad[],Scanner sc) {
		String disciplina;
		double distancia;
		double tiempo;
		String fecha;
		
		for(int i = 0; i < actividad.length; i++) { //Errores que los datos introducidos no sean los pedidos o fuera de los parámetros
			disciplina = solicitarDisciplina(sc);
			distancia = solicitarDistancia(sc);
			tiempo = solicitarTiempo(sc);
			fecha = solicitarFecha(sc);
			
			actividad[i] = new ActividadD(disciplina,distancia,tiempo,fecha);
			
		}	
	}
	
	private static String solicitarDisciplina(Scanner sc) {
		String d = "";
		boolean valid = false;
		
		//me podía ahorrar el booleano usando la misma condicion en el while que la del if
		do {
			try{
				System.out.println("Ingrese la disciplina:");
				d = sc.nextLine();
				if(!d.equalsIgnoreCase(ACTIVIDADES[0]) && !d.equalsIgnoreCase(ACTIVIDADES[1]) && !d.equalsIgnoreCase(ACTIVIDADES[2])) {
					throw new Exception("No es una disciplina válida");
				}else {
					valid = true;
				}
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}while(valid == false);
		
		return d;
	}
	
	private static double solicitarDistancia(Scanner sc) {
		double d = 0;
		boolean valid = false;
		do {
			try {
				System.out.println("Ingrese la distancia:");
				d = Double.parseDouble(sc.nextLine());
				if(d < MIN_D && d > MAX_D) {
					throw new Exception("Distancia fuera de rango");
				}else {
					valid = true;
				}
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
			
		}while(valid == false);
		return d;
	}
	
	private static double solicitarTiempo(Scanner sc) {
		double t = 0;
		boolean valid = false;
		do {
			try {
				System.out.println("Ingrese el tiempo:");
				t = Double.parseDouble(sc.nextLine());
				if(t <MIN_T && t > MAX_T) {
					throw new Exception("Tiempo fuera de rango");
				}else {
					valid = true;
				}
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}while(valid == false);
		return t;
	}
	
	private static String solicitarFecha(Scanner sc) {
		String f = "";
		boolean valid = false;
		do {
			try {
				System.out.println("Ingrese la fecha:");
				f = sc.nextLine();
				if(f.length() != CAR_F) {
					throw new Exception("Fecha inválida debe contener exactamente 16 caractéres");
				}else {
					valid = true;
				}
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
			
		}while(valid == false);
		return f;
	}

}
