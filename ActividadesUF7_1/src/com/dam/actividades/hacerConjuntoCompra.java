package com.dam.actividades;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

//Mismo ejercicio de la compra pero con HashSet
public class hacerConjuntoCompra {
	
	static Scanner sc ;
	static HashSet<Producto> conjCompra;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		
		
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

	private static void mostrarListaCompra(ArrayList<Producto> listaCompra) {
		// TODO Auto-generated method stub
		
	}

	private static void addProduct(ArrayList<Producto> listaCompra, Scanner sc2) {
		// TODO Auto-generated method stub
		
	}

	private static int solicitarOpcionMenu(Scanner sc2) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static void eliminarProd(ArrayList<Producto> listaCompra, Scanner sc) {
		try {
			//Modificar esto pa que funcione con hashset
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

}
