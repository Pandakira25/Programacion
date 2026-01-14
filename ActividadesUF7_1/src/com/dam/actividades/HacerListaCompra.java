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
				eliminarProd(listaCompra, sc);
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
	
	//Agregar 5 para terminar 4 mostrar la lista y 3 eliminar producto por nombre y en el dos especificar que es por posicion

	private static void eliminarProd(ArrayList<Producto> listaCompra, Scanner sc) {

		//vamos a borrar segun la posicion que ocupe el producto
		
		try {
			int pos;
			
			System.out.println("Ingrese la posicion del producto que desea eliminar: ");
			pos = Integer.parseInt(sc.nextLine());
			
			System.out.println(pos - 1);
			
			if((pos-1) < 0 || pos > listaCompra.size()) {
				throw new Exception("El valor introducido debe ser mayor que cero y ser igual o menor que la cantidad de productos");
			}
			
			System.out.println("Esta seguro de querer eliminar " + listaCompra.get(pos - 1) + "?  SI/NO");
			String qst = sc.nextLine();
			
			if(qst.equalsIgnoreCase("SI")) {
				listaCompra.remove(pos - 1);
				System.out.println("Elemento eliminado");
			}
			
		}catch(NumberFormatException e) {
			System.out.println("El valor introducido no es entero");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	private static void mostrarListaCompra(ArrayList<Producto> listaCompra) {
		System.out.println("\nLista de la compra");
		/*for (Producto producto : listaCompra) {
			System.out.println(producto);
		}*/
		
		for(int i = 0; i < listaCompra.size(); i++) {
			System.out.println((i + 1) + " - " + listaCompra.get(i));
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
			float cP = Float.parseFloat(sc.nextLine());
			
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
