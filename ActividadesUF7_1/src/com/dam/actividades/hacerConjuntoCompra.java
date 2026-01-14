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

}
