package com.dam.ejecutables;

import java.util.Arrays;
import java.util.Scanner;

import com.dam.pojos.Banio;
import com.dam.pojos.Casa;
import com.dam.pojos.Cocina;
import com.dam.pojos.Estancia;
import com.dam.pojos.Habitacion;
import com.dam.pojos.Hall;
import com.dam.pojos.Salon;

public class Ejecutable {

	static Casa casa;
	static Scanner sc;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		String direc = solicitarCadenaNoVacia("Introduce la dirección");
		
		casa = new Casa(direc);
		
		String opt;
		
		do {
			opt = solicitarCadenaNoVacia("Ingrse A para añadir una estancia"
					+ "\nIngrese M para mostrar la información de la casa"
					+ "\nInrgeae S para salir del programa");
			
			switch(opt) {
			case "A":
				addEstancia();
				break;
			case "M":
				mostrarInfo();
				break;
			case "S":
				System.out.println("\nSaliendo del programa");
				break;
			default:
				System.out.println("El valor introducido no es uno de los esperados");
				break;
			}
		}while(!opt.equalsIgnoreCase("S"));
		
		sc.close();
	}

	private static void addEstancia() {
		String tipo =  solicitarTipo();
		
		String nombre = solicitarCadenaNoVacia("Introduce el nombre de la estancia");
		double m2 = solicitarM2("Introduce los metros cuadrados de la estancia");
		int numP = solicitarEnterosPositivos("Indica el número de puertas de la estancia",1);
		int numV = solicitarEnterosPositivos("Indica el número de ventanas de la estancia",0);
		
		Estancia estancia = null;
		
		switch(tipo) {
		case "HALL":
			boolean tienePB = solicitarBoolean("Indica si tiene puerta blindada");
			estancia = new Hall(tienePB,m2,numP,numV);
			break;
		case "COCINA":
			boolean tieneTend = solicitarBoolean("Indica si tiene tendedero o no: (SI/NO)");
			double m2Tend = 0;
			if(tieneTend) {
				m2Tend = solicitarM2("Introduce los metros cuatrados del tendedero");
			}
			estancia = new Cocina(tieneTend,m2Tend,nombre,m2,numP,numV);
			break;
		case "SALON":
			int numPR = solicitarEnterosPositivos("Introduce en número de puntos de red",1 );
			boolean tieneTer=solicitarBoolean("Introduce si tiene terraza (SI/NO)");
			double m2Ter = 0;
			if(tieneTer) {
				m2Ter = solicitarM2("Ingrese los metros cuadrados de la terraza");
			}
			estancia = new Salon(numPR,tieneTer,m2Ter,nombre,m2,numP,numV);
			break;
		case "BAÑO":
			boolean ducha = solicitarBoolean("Ingrese si tiene ducha o no: (SI/NO)");
			boolean baniera = solicitarBoolean("Ingrese si tiene bañera o no: (SI/NO)");
			estancia = new Banio(ducha,baniera,nombre,m2,numP,numV);
			break;
		case "HABITACION":
			int numPuertasArm = solicitarEnterosPositivos("Ingrese el número de pueras del armario", 1);
			boolean accesoBanio = solicitarBoolean("Ingrese si tiene acceso a baño o no: (SI/NO)");
			
			estancia = new Habitacion(numPuertasArm,accesoBanio,nombre,m2,numP,numV);
			break;
		default:
			break;
		}
		
		casa.addEstancia(estancia);
		
	}

	private static boolean solicitarBoolean(String mensaje) {
		boolean tiene = false;
		String res = "";
		
		while(res.equalsIgnoreCase("Si") && res.equalsIgnoreCase("No")) {
			System.out.println(mensaje);
			res=sc.nextLine().trim();
			
			if(!res.equalsIgnoreCase("SI") && !res.equalsIgnoreCase("NO")) {
				System.out.println("ERROR: La respuesta debe ser SI o NO");
			}
		}
		
		return tiene;
	}

	private static int solicitarEnterosPositivos(String mensaje, int min) {
		int entero = min - 1;
		while(entero < min ) {
			try {
				System.out.println(mensaje);
				entero = Integer.parseInt(sc.nextLine());
				
				if(entero < min ) {
				throw new NumberFormatException();
				}
			}catch(NumberFormatException e) {
				System.out.println("ERROR: El valor introducido debe ser un entero mayor que " +min );
			}
		}
		
		return entero;
	}

	private static double solicitarM2(String mensaje) {
		double m2 = 0;
		
		
		while(m2<=0) {
			try {
				System.out.println(mensaje);
				m2 = Double.parseDouble(sc.nextLine());
				
				if(m2<0) {
					throw new NumberFormatException();
				}
				
			}catch(NumberFormatException e) {
				System.err.println("ERROR: Los metros cuadrados denen ser un valor numérico positivo");
			}
		}
		
		
		
		return m2;
	}

	private static String solicitarTipo() {
		String tipo = "";
		boolean found = false;
		
		do {
			System.out.println("Introduce uno de los siguientes tipos: " + Arrays.toString(Estancia.TIPOS_ESTANCIA));
			tipo = sc.nextLine();
			
			for (int i = 0; i < Estancia.TIPOS_ESTANCIA.length && !found; i++ ) {
				if(tipo.equalsIgnoreCase(Estancia.TIPOS_ESTANCIA[i])) {
					found = true;
				}
			}
			
			if(!found) {
				System.out.println("Error: el valor introducido no es uno de los esperados");
			}
		}while(!found);
		
		return null;
	}

	private static void mostrarInfo() {
		if(casa.getListaEstancias().size() == 0) {
			System.out.println("No se han especificado las estancias de  esta casa");
		}else {
			System.out.println(casa);
		}
	}

	private static String solicitarCadenaNoVacia(String mensaje) {
		String cadena = "";
		
		do {
			System.out.println(mensaje);
			cadena = sc.nextLine().trim();
			
			if(cadena.isBlank()) {
				System.out.println("El valor no puede estar vacio");
			}
		}while(cadena.isEmpty());
				
		return cadena;
	}

}
