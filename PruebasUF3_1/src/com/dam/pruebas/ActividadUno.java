package com.dam.pruebas;

import java.util.Scanner;

public class ActividadUno {

	//variables globales o campos o atributos
private static float b;
private static float a;

	public static void main(String[] args) {
		
		//variable local y también de referencia ya que su tipo no es primitivo
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Escribe la base del triángulo");
		b = teclado.nextFloat();
		teclado.nextLine();
		
		System.out.println("Escribe la altura del triángulo");
		a = teclado.nextFloat();
		teclado.nextLine();
		
		float area = calcularArea();
		//System.out.println("El área es: " + (a*b)/2);
		System.out.println("El área es: " + area);
		
		teclado.close();

	}
	
	
	/*Esto es un metodo el cual puedo llamar dentro de otro método que en este caso es el main.Y dentro del main simpre 
	 * se escriben con paréntesis
	 */
	public static float calcularArea() {
		return (a*b)/2;
	}
}
