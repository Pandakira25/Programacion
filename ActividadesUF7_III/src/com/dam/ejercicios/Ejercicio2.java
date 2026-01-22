package com.dam.ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		ArrayList<Song> listS = new ArrayList<Song>();
		Scanner sc = new Scanner(System.in);
		
		int opcion;
		
		System.out.println("** Bienvenido a la aplicación TU PLAYLIST **");
		
		do {
			opcion = solicitarOpcionMenu(sc);
					
			switch (opcion) {
			case 1 : 
				addS(listS, sc);
				break;
			case 2 : 
				delS(listS, sc);
				break;
			case 3 :
				showS(listS);
				break;
			case 4 :
				//Por posicion
				playSP(listS,sc);
				break;
			case 5 :
				playL(listS);
				break;
			case 6 :
				totTimeL(listS);
				break;
			case 0 :
				opcion = 0;
				System.out.println("\n**Cerrando la playlist");
				break;
			}
		}while(opcion != 0);
	}
	
	private static void playSP(ArrayList<Song> listS, Scanner sc) {
		try {
			System.out.println("\nIntroduce la posición de la canción que deseas reproducir");
			int p = Integer.parseInt(sc.nextLine());
			boolean found = false;
			if(p > 0 && p <= listS.size()) {
				for(int i = 0; i < listS.size() && !found; i++) {
					System.out.println(i);
					if((p-1) == i) {
						System.out.println("\n**Se está reproduciendo: " + listS.get(i).toString());
						found = true;
					}
				}
			}else {
				throw new Exception("\nNo se encuentra ninguna canción en la posición indicada");
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static void totTimeL(ArrayList<Song> listS) {
		int c = 0;
		for(int i = 0; i < listS.size(); i++) {
			c += listS.get(i).getDuracion();
		}
		System.out.println("\n**Duración de la playList: " + c + "s.");
	}

	private static void playL(ArrayList<Song> listS) {
		for(int i = 0; i < listS.size();i++) {
			System.out.println("\n**Se está reproduciendo: " + listS.get(i).toString());
		}
	}

	private static void showS(ArrayList<Song> listS) {
		for(int i = 0; i < listS.size(); i++) {
			System.out.println((i+1) + " " + listS.get(i).toString());
		}
	}

	private static void delS(ArrayList<Song> listS, Scanner sc) {
		try {
			System.out.println("Ingrese el nombre de la canción a eliminar");
			String n = sc.nextLine();
			if(n.isEmpty()) {
				throw new Exception("No debe estar vacío");
			}
			System.out.println("Ingrese el artista de la canción a eliminar");
			String a = sc.nextLine();
			if(a.isEmpty()) {
				throw new Exception("No debe estar vacío");
			}
			
			Song dS = new Song(n,a);
			
			if(listS.remove(dS)) {
				System.out.println("\nCanción eliminada");
			}else {
				throw new Exception("No se encuentra en la playlist");
			}
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static void addS(ArrayList<Song> listS, Scanner sc) {
		try{
			System.out.println("Ingrese el nombre de la canción");
			String nS = sc.nextLine().toLowerCase().trim();
			
			if(nS.isEmpty()) {
				throw new Exception("El nombre está vacío, ingrese uno");
			}
			System.out.println("Ingrese el artista");
			String a = sc.nextLine();
			
			if(a.isEmpty()) {
				throw new Exception("Debes ingresar un artista");
			}
			
			System.out.println("Ingrese la duración en segundos");
			int d = Integer.parseInt(sc.nextLine());
			
			if(d < 10) {
				throw new Exception("Duración muy corta");
			}else if(d > 600) {
				throw new Exception("Duración demaciado larga");
			}
			
			Song p = new Song(nS,a,d);
			
			if(listS.contains(p)) {
				throw new Exception("La canción ya se encuentra en la lista");
			}else {
				listS.add(p);
				System.out.println("Canción añadida. Canciones en la lista: " + listS.size());
			}
			
			
			
			System.out.println("Canción añadido");
		}catch(NumberFormatException e){
			System.out.println("La duración debe ser un número");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static int solicitarOpcionMenu(Scanner sc) {
		int option = -1;
		
		while(option < 0 || option > 6) {
			try {
				System.out.println("\nIndica la acción que deseas realizar: ");
				System.out.println("1 - Añadir canción");
				System.out.println("2 - Eliminar canción");
				System.out.println("3 - Mostrar canciones");
				System.out.println("4 - Reproducir canción");
				System.out.println("5 - Reproducir toda la playlist");
				System.out.println("6 - Tiempo total de la playlist");
				System.out.println("0 - Salir de la aplicación");
				option = Integer.parseInt(sc.nextLine());
				
				if( option < 0 || option > 6) {
					throw new Exception("El valor debe estar entre 1 y 4");
				}
			}catch(NumberFormatException e) {
				System.out.println("Introducir un valor entero");
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		return option;
	}

}
