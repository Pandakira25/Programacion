package com.dam.ej9;

import java.util.Random;

/*
 * Queremos realizar una encuesta a 10 personas, en esta encuesta
indicaremos el sexo (1=masculino, 2=femenino), si trabaja (1=si trabaja,
2= no trabaja) y su sueldo (si tiene un trabajo, sino será un cero)
estará entre 600 y 2000 (valor entero). Los valores pueden ser
generados aleatoriamente. Calcula y muestra lo siguiente:
• Porcentaje de hombres (tengan o no trabajo).
• Porcentaje de mujeres (tengan o no trabajo).
• Porcentaje de hombres que trabajan.
• Porcentaje de mujeres que trabajan.
• El sueldo promedio de los hombres que trabajan.
• EL sueldo promedio de las mujeres que trabajan.
Usa todos los métodos que veas necesarios, piensa que es aquello que
se repite o que puede ser mejor tenerlo por separado.
 */

public class mainEj9 {
	
	static final int CANT_P = 10;
	static Random rd = new Random();

	public static void main(String[] args) {
		
		 Persona p [] = new Persona[CANT_P];
		 
		 //Rellenar los array de manera aleatiria 
		 fillArrays(p);
		 
		 
		 //Mostrar los porcentajes y promedios
		 

	}
	
	//Método para rellenar cada array persona
	private static void fillArrays(Persona p []) {
		int sexo = 0;
		int laburo = 0;
		int sueldo = 0;
		
		for(int i = 0; i < p.length; i++) {
			sexo = rd.nextInt(1,3);
			laburo = rd.nextInt(1,3);
			
			if(laburo != 0) {
				sueldo = rd.nextInt(600,2001);
			}else {
				sueldo = 0;
			}
			p[i] = new Persona(sexo,laburo,sueldo);//meter datos de un objeto desde un array
			//System.out.println(p[i].getSexo());
		}
		
	}
	
	
	//Método porcentaje hombres 
	private static void porHombres(int p[]) {
			
	}
		
	//Método pocentaje mujeres
	private void porMujeres(int p[]) {
			
	}
		
	//Método porcentaje hombres que trabajan
		
	//Método porcentaje mujeres que trabajan
		
	//Método sueldo promedio hombres que trabajan
		
	//Método sueldo promedio muejres que trabajan
		

}
