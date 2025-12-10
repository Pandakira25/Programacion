package com.dam.a.ej2;

import java.util.Scanner;

public class ControlDePerfiles {
	
	static final int TAM_P = 10;
	static final String CIUDADES [] = {"Madrid","Barcelona","Málaga","Valladolid"};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Perfil perf []= new Perfil[TAM_P];
		
		String strEx;
		
		try {
			solicitarInfo(perf,sc);
			
			mostrarPerfiles(perf);
			
			perfMMenCont(perf);
		}catch(NumberFormatException ex){
			strEx = "Se han introducido caracteres no numéricos";
			System.out.println(strEx);
		}catch(ExeptionOutOfRange ex) {
			System.out.println(ex.getMessage());
		}
		
		sc.close();
		
	}
	
	private static void perfMMenCont(Perfil perf[]) throws NullPointerException{
		Perfil menCM = null;
		
		for(int i = 0; i < perf.length; i++) {
			if(perf[i].getCiudad().equalsIgnoreCase(CIUDADES[0])) { 
				if(menCM == null || menCM.getNumContactos() > perf[i].getNumContactos()) { //error menCM nullpointerexeption y getNC no de un int
					menCM = perf[i];
				}
			}
		}
		
		if(menCM == null) throw new NullPointerException("No hay ningún perfil " + CIUDADES[0]);//No estoy muy segura de esta cosa ademas como mostraria este error en el try catch del main
		
		System.out.println("El perfil con menos contactos en Madrid es: \n" + menCM);
	}
	
	private static void mostrarPerfiles(Perfil perf[]) {
		for(int i = 0; i < perf.length; i++) {
			System.out.println("Perfil nº: " + (i+1) + "\n" + perf);
		}
	}

	private static void solicitarInfo(Perfil[] perf,Scanner sc) throws ExeptionOutOfRange, NumberFormatException {
		String nombre;
		String puestoActual;
		String ciudad;
		int numContactos;
		
		for(int i = 0; i < perf.length; i++) { //Errores que los datos introducidos no sean los pedidos o fuera de los parámetros
			System.out.println("Ingrese el nombre del perfil: ");
			nombre = sc.nextLine();
			System.out.println("Ingrese el puesto actual del perfil: ");
			puestoActual = sc.nextLine();
			System.out.println("Ingrese la ciudad:");
			ciudad = sc.nextLine();
			System.out.println("Ingrese el número de contactos");
			numContactos = Integer.parseInt(sc.nextLine());
			
			if((0 > numContactos) || (numContactos > 100000)) {
				throw new ExeptionOutOfRange("Número fuera de intervalo");
			}
			
			if(!ciudad.equalsIgnoreCase(CIUDADES[0]) && !ciudad.equalsIgnoreCase(CIUDADES[1]) && !ciudad.equalsIgnoreCase(CIUDADES[2]) && !ciudad.equalsIgnoreCase(CIUDADES[3])) {
				throw new ExeptionOutOfRange("Ciudad fuera de intervalo");
			}
			
			perf[i] = new Perfil(nombre,puestoActual,ciudad,numContactos);
			
		}	
	}
}
