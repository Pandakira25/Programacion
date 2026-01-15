package com.dam.actividades;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//Mismo ejercicio de la compra pero con HashSet
public class hacerConjuntoCompra {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// mostrar menú
		int opcion;

		HashSet<Producto> conjCompra = new HashSet<Producto>();

		do {
			opcion = solicitarOpcionMenu(sc);

			switch (opcion) {
			case 1:
				// Añadir producto a la lista
				addProduct(conjCompra, sc);
				break;
			case 2:
				// eliminar producto de la lista
				eliminarProd(conjCompra, sc);
				break;
			case 3:
				// mostrar los productos de la lista
				mostrarListaCompra(conjCompra);
				break;
			case 4:
				// termina
				System.out.println("Saliendo del programa");
				break;
			}
		} while (opcion != 4);

	}

	private static void mostrarListaCompra(Set<Producto> conjCompra) {
		System.out.println("\nLista de la compra");
		if(conjCompra.size() == 0) {
			System.out.println("---Lista vacía---");
		}else {
			for (Producto producto : conjCompra) {
				System.out.println(producto);
			}
		}
	}

	private static void addProduct(Set<Producto> conjCompra, Scanner sc) {
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
			
			conjCompra.add(p);
			
			System.out.println("Producto añadido");
		}catch(NumberFormatException e){
			System.out.println("La cantidad debe ser un número");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

	private static int solicitarOpcionMenu(Scanner sc) {
		int option = 0;

		while (option < 1 || option > 4) {
			try {
				System.out.println("\nIngrese una de las siguientes opciones: ");
				System.out.println("1 - Añadir producto a la lista de la compra");
				System.out.println("2 - Eliminar producto de la lista de la compra");
				System.out.println("3 - Mostrar la lista de la compra");
				System.out.println("4 - Para terminar");
				option = Integer.parseInt(sc.nextLine());

				if (option < 1 || option > 4) {
					throw new Exception("El valor debe estar entre 1 y 4");
				}
			} catch (NumberFormatException e) {
				System.out.println("Introducir un valor entero");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

		return option;
	}
	
	
	//como los hashset no tienen posiciones tengo que buscar los que coinciden en nombre
	private static void eliminarProd(Set<Producto> conjCompra, Scanner sc) {
		try {
			// Modificar esto pa que funcione con hashset
			System.out.println("Ingrese el nombre y cantidad del producto que desea eliminar: ");
			String n = sc.nextLine();
			float c = Float.parseFloat(sc.nextLine());
			
			if (n.isEmpty()) {
				throw new Exception("Debe ingresar un nombre");
			}
			
			Producto delP = new Producto(n,c);
			
			String qst;
			
			if(conjCompra.contains(delP)) {
				System.out.println("Esta seguro de querer eliminar " + delP.getNombre() + "?  SI/NO");
				qst = sc.nextLine();
				if (qst.equalsIgnoreCase("SI")) {
					conjCompra.remove(delP);
					System.out.println("Elemento eliminado");
				}
			}else {
				System.out.println("El producto " + delP.getNombre() + " no se encuentra en la lista");
			}
			
		} catch (NumberFormatException e) {
			System.out.println("El valor introducido no es entero");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
