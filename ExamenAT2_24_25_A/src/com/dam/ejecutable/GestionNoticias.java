package com.dam.ejecutable;

import java.util.ArrayList;
import java.util.Scanner;

import com.dam.pojos.Noticia;
import com.dam.pojos.NoticiaPolitica;

public class GestionNoticias {

	public static void main(String[] args) {
		ArrayList<Noticia> noticias = new ArrayList<Noticia>();
		Scanner sc = new Scanner(System.in);
		
		int opt = 0;
		while(opt != 5) {
			opt = reqOpt(sc);
			
			switch(opt) {
			case 1:
				addNews(sc,noticias);
				break;
			case 2:
				//Modificar el estado de una noticia
				modNew(sc,noticias);
				break;
			case 3:
				//Mostrar las iniciales del partido político
				mostrarI(sc,noticias);
				break;
			case 4:
				//Mostrar la lista de noticias si no está vacía
				mostrarNews(sc,noticias);
				break;
			case 5:
				System.out.println("Saliendo del programa");
				break;
			}
		}
			
		sc.close();
	}

	private static void mostrarNews(Scanner sc, ArrayList<Noticia> noticias) {
		// TODO Auto-generated method stub
		
	}

	private static void mostrarI(Scanner sc, ArrayList<Noticia> noticias) {
		// TODO Auto-generated method stub
		
	}

	private static void modNew(Scanner sc,ArrayList<Noticia> noticias1) {
		// TODO Auto-generated method stub
		
	}

	private static void addNews(Scanner sc, ArrayList<Noticia> noticias) {
		int op=0;
		System.out.println("Que clase de noticia desea agregar?(Ingrese el número correspondiente)" + "\n" + Noticia.TIPOS[0] + "(0) o " + Noticia.TIPOS[1] + "(1) o " + Noticia.TIPOS[2] + "(2)") ;
	}

	private static int reqOpt(Scanner sc) {
		int op=0;
		try {
			System.out.println("1-Para añadir una noticia"
					+ "\n2-Para modificar el estado de una noticia"
					+ "\n3-Para mostrar iniciales del partido político"
					+ "\n4-Para mostrar la lista de noticias"
					+ "\n5-Para salir del programa");
			op = Integer.parseInt(sc.nextLine());
			if(op != 1 && op != 2 && op != 3 && op != 4 && op != 5) {
				throw new NumberFormatException();
			}		
		} catch (NumberFormatException e) {
			System.out.println("Introduce un numero entero de las opciones");
		}	
		return op;
	}
}
