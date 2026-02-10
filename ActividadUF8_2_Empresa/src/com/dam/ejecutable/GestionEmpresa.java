package com.dam.ejecutable;
import java.util.Scanner;

import com.dam.pojos.EmpleadoDistribucion;
import com.dam.pojos.EmpleadoProduccion;
import com.dam.pojos.Empresa;

public class GestionEmpresa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Empresa e1 = new Empresa("Empresa 1");
		
		int opt = 0;
		while(opt != 3) {
			opt = reqOpt(sc);
			
			switch(opt) {
			case 1:
				addEmpleado(sc,e1);
				break;
			case 2:
				//debería haber pensado de si no tenía nada agregado
				System.out.println(e1.toString());
				System.out.println("\nTotal de salarios: " + e1.calcularTotalSalarios());
				break;
			case 3:
				System.out.println("Saliendo del programa");
				break;
			}
		}
			
		sc.close();
		
	}

	private static void addEmpleado(Scanner sc,Empresa e1) {
		try {
			String nombre = solicitarS("Ingrese su nombre",sc);
			String dni = solicitarS("Ingrese su DNI",sc);
			double salario = solicitarD("Ingrese su salario",sc);
			boolean valid = true;
			do {
				System.out.println("1-Para empleado de distribución "
						+ "\n2-Para empleado de producción");
				int opt = Integer.parseInt(sc.nextLine());
				
				switch(opt) {
				case 1:
					//Distribucion
					String zona = solicitarS("Ingrese su zona",sc);
					
					EmpleadoDistribucion emd = new EmpleadoDistribucion(nombre, dni,salario,zona);
					e1.addEmpleado(emd);
					
					break;
				case 2:
					//Produccion
					String turno;
					double plusNoct=0;
					boolean validT = true;
					do {
						turno = solicitarS("Ingrese su turno(M/T/N)", sc).toUpperCase();
						if(!turno.equalsIgnoreCase("M") && !turno.equalsIgnoreCase("T") && !turno.equalsIgnoreCase("N")) {
							validT = false;
							System.out.println("Opción no válida, ingresela nuevamente");
						}else {
							validT = true;
						}
					}while(!validT);
					
					if(turno.equalsIgnoreCase("N")) {
						plusNoct = solicitarD("Ingrese su plus por nocturnidad", sc);
					}
					
					EmpleadoProduccion emp = new EmpleadoProduccion(nombre, dni, salario, turno, plusNoct);
					
					e1.addEmpleado(emp);
					break;
				default:
					System.out.println("Opción no válida");
					valid = false;
					break;
				}
			}while(!valid);
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static double solicitarD(String mensaje,Scanner sc) {
		 double d = 0;
		 boolean valid = false;

		 do {
			 try {
				 System.out.println(mensaje);
				 d = Double.parseDouble(sc.nextLine());

				 if (d < 0) {
					 System.out.println("Debe ser mayor que cero, vuélvalo a ingresar");
				 } else {
					 valid = true; 
				 }
			 } catch (NumberFormatException e) {
				 System.out.println("Debe introducir un número válido");
			 }
		 } while (!valid);
		 return d;
	}

	private static String solicitarS(String mensaje,Scanner sc) {
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

	private static int reqOpt(Scanner sc) {
		int op=0;
		try {
			System.out.println("1-Para añadir un empleado"
					+ "\n2-Para mostrar datos de la empresa junto con el total de salarios"
					+ "\n3-Salir de la aplicacón");
			op = Integer.parseInt(sc.nextLine());
			if(op != 1 && op != 2 && op != 3) {
				throw new NumberFormatException();
			}		
		} catch (NumberFormatException e) {
			System.out.println("Introduce un numero entero de las opciones");
		}	
		return op;
	}
}
