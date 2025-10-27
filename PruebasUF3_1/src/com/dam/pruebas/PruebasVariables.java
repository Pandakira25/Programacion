package com.dam.pruebas;

public class PruebasVariables {

	public static void main(String[] args) {
		
		// no podemos asignar una variable de tipo entero un valor que no lo sea 
		// int entero = 6.7;  Esta linea comentada por que da error
		
		// No podemos asignar a una variable de tipo short un valor mayor que 32.767
		// short enteroPequenio = 40000;  Lo comentamos porque da error
		
		int entero = 16;
		
		float decimalPequenio = 300000;
		
		//conversión explícita (Cast): se que decimalPequenio contiene un valor que se puede convertir a int
		entero = (int) decimalPequenio;
		
		byte b = 1;
		
		// conversión implícita: un byte cabe en un short
		short s = b;
		
		// conversión implícita; un short cabe en un int
		int i = s;
		
		// conversióm implícita: un int cabe en un long
		long l = i;
		
		
		

	}

}
