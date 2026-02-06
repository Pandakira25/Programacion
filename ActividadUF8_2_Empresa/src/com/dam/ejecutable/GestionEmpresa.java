package com.dam.ejecutable;
import java.util.Scanner;

public class GestionEmpresa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opt = 0;
		while(opt != 3) {
			opt = reqOpt(sc);
			
			switch(opt) {
			case 1:
				addEmpleado(sc);
				
				break;
			case 2:
				
				
				break;
			case 3:
				System.out.println("Saliendo del programa");
				break;
			}
		}
			
		sc.close();
		
	}

	private static void addEmpleado(Scanner sc) {
		try {
			System.out.println("1-Para empleado de distribución "
					+ "\n2-Para empleado de producción");
			int opt = Integer.parseInt(sc.nextLine());
			
			boolean valid = true;
			switch(opt) {
			case 1:
				do {
					System.out.println("Ingrese su zona");
					String zona = sc.nextLine();
					if(zona.isEmpty()) {
						valid = false;
						throw new Exception("La zona no puede estár vacía");
					}
				}while(!valid);
				
				break;
			case 2:
				break;
			default:
				break;
			}
			
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static int reqOpt(Scanner sc) {
		try {
			System.out.println("1-Para añadir un empleado"
					+ "\n2-Para mostrar datos de la empresa junto con el total de salarios"
					+ "\n3-Salir de la aplicacón");
			int op = Integer.parseInt(sc.nextLine());
			if(op != 1 && op != 2 && op != 3) {
				throw new NumberFormatException();
			}
				
		} catch (NumberFormatException e) {
			System.out.println("Introduce un numero entero de las opciones");
		}
		
		
		return 0;
	}

}
