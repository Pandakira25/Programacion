package com.dam.actividades;

import java.util.ArrayList;
import java.util.Scanner;

public class HacerListaCompra {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//mostrar menú
		int opcion;
		
		ArrayList<Producto> listaCompra = new ArrayList<Producto>();
		
		do {
			opcion = solicitarOpcionMenu(sc);
					
			switch (opcion) {
			case 1 : 
				//Añadir producto a la lista
				addProduct(listaCompra, sc);
				break;
			case 2 : 
				//eliminar producto de la lista
				break;
			case 3 :
				//mostrar los productos de la lista
				mostrarListaCompra(listaCompra);
				break;
			case 4 :
				//termina
				System.out.println("Saliendo del programa");
				break;
			}
		}while(opcion != 4);
	}

	private static void mostrarListaCompra(ArrayList<Producto> listaCompra) {
		System.out.println("\nLista de la compra");
		for (Producto producto : listaCompra) {
			System.out.println(producto);
		}
	}

	private static void addProduct(ArrayList<Producto> listaCompra, Scanner sc) {
		
		
		try{
			System.out.println("Ingrese el nombre del producto");
			String nP = sc.nextLine().toLowerCase().trim();
			
			if(nP.isEmpty()) {
				throw new Exception("El nombre está vacío, ingrese uno");
			}
			System.out.println("Ingrese la cantidad");
			float cP = Integer.parseInt(sc.nextLine());
			
			if(cP <= 0) {
				throw new Exception("El valor debe ser mayor que cero");
			}
			
			Producto p = new Producto(nP,cP);
			
			listaCompra.add(p);
			
			System.out.println("Producto añadido");
		}catch(NumberFormatException e){
			System.out.println("La cantidad debe ser un número");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}

	private static int solicitarOpcionMenu(Scanner sc) {
		int option = 0;
		
		while(option < 1 || option > 4) {
			try {
				System.out.println("\nIngrese una de las siguientes opciones: ");
				System.out.println("1 - Añadir producto a la lista de la compra");
				System.out.println("2 - Eliminar producto de la lista de la compra");
				System.out.println("3 - Mostrar la lista de la compra");
				System.out.println("4 - Para terminar");
				option = Integer.parseInt(sc.nextLine());
				
				if( option < 1 || option > 4) {
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
