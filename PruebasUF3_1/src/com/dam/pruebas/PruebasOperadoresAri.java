package com.dam.pruebas;
// Pruebas con operadores aritméticos
public class PruebasOperadoresAri {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 7;
		
		int res;
		
		res = a + b;
		System.out.println(a+"+"+b+"="+ res);
		
		res = a - b;
		System.out.println(a+"-"+b+"="+ res);
		
		res = a * b;
		System.out.println(a+"*"+b+"="+ res);
		
		//División entera
		res = b / a;
		System.out.println(b+"/"+a+"="+ res);
		//si las variables que intervienen en la división son enteras el resultado es entero
		
		
		//División decimal, creo otra variable para el resultado, no es la misma que res.
		//Para obtener un resultado de una división decimal tenemos que castear alguna de las variables
		//Si es que no son decimales
		double resDec = (double) b  / a;
		System.out.println(b+"/"+a+"="+ resDec);
		
		//El operador % devuelve eñ resto de la dicisión, es decir, divido a entre b y me devuelve el resto
		res = a % b;
		System.out.println(a+"%"+b+"="+ res);
	}

}
