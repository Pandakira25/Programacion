package com.dam.ej18;

import java.util.Scanner;

/*
 * 18. En una estación de esquí hay 15 personas esperando en fila para coger un telesilla. Para que un telesilla pueda salir deben haber subido 4 personas o alcanzar un peso mínimo de 150 kg. 
 * Se debe solicitar el peso de las 15 personas que están esperando y después de que la persona suba al telesilla indicar si “Debe subir otra persona” o “El telesilla puede salir ya”.
 * Si tras la última persona el telesilla no tiene un mínimo de 4 personas o no alcanza los 150 kg de peso se deberá indicar "El telesilla no puede salir"
 */

public class Ejercicio18 {

	final static int P_T = 15; //Personas totales
	final static int P_S = 4; //Personas por sillas
	final static double KG_M_S = 150; //Kilos mínimos por silla
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double pP = 0;//Peso de la persona que sube
		double tPeso = 0;//Contador del total del peso en un telesilla
		int cPT = 0; //Contador de personas en el telesilla
		
		
		for(int i = 1; i <= P_T; i++) {
			System.out.println("Ingrese el peso de la persona " + i);
			pP = Double.parseDouble(sc.nextLine());
			
			cPT++;
			tPeso += pP;
			
			if(cPT == P_S || tPeso >= KG_M_S) {
				System.out.println("El telesilla puede salir ya");
				cPT = 0;
				tPeso = 0;
			}else {
				if(i == P_T) {
					System.out.println("El telesilla no puede salir");
				}else {
					System.out.println("Debe subir otra persona");
				}
			}
			
		}
		
		sc.close();
		

	}

}
