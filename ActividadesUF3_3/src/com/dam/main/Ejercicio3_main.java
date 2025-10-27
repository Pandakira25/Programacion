package com.dam.main;

import java.util.Scanner;

import com.dam.pojo.HelipuertoPojo;

public class Ejercicio3_main {

	public static void main(String[] args) {
		
		//HelipuertoPojo helipuerto1 = new HelipuertoPojo();
		Scanner sc = new Scanner(System.in);
		
		//inicializar las variable con un constructor que ya tiene inicializadas las variables??
		System.out.println("ingresa el nombre del primer helipuerto");
		String nombreH1 = sc.nextLine();
		
		System.out.println("ingresa el radio del primer helipuerto");
		double rH1 = Double.parseDouble(sc.nextLine());
		
		HelipuertoPojo h1 = new HelipuertoPojo(nombreH1, rH1);
		
		
		//inicializar las variables con el constructor por defecto
		HelipuertoPojo h2 = new HelipuertoPojo();
		
		System.out.println("introduce el nombre del segundo helipuerto");
		String nombreH2 = sc.nextLine();
		
		System.out.println("ingrese el radio del segundo helipuerto");
		double rH2 = Double.parseDouble(sc.nextLine());
		
		h2.setNombre(nombreH2);
		h2.setRadio(rH2);
		
		//System.out.println(h1.getRadio());
		//System.out.println(h2.getRadio());
		
		double areaH1 = h1.areaH();
		double areaH2 = h2.areaH();
		
		String comparacionA = (areaH1 > areaH2)? "areaH1 es mayor " + areaH1: "areaH2 es mayor " + areaH2 ;
		
		System.out.println("el helipuero con mayor area es: " + comparacionA);
		
	
		sc.close();

	}

}
