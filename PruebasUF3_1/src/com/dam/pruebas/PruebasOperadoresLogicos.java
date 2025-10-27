package com.dam.pruebas;

public class PruebasOperadoresLogicos {

	public static void main(String[] args) {
		
		int a =3;
		int b = 7;
		int c = 4;
		
		boolean resultado;
		
		resultado = a<b && c<b; //true && and true ==> true
		System.out.println("a < b && c < b? " + resultado);
		
		resultado = a<b && c==b; //true && and false ==> false
		System.out.println("a < b && c == b? " + resultado);
		
		resultado = a == b || c < b; //false || or true ==> true
		System.out.println("a == b && c < b? " + resultado);
		
		/*si el operador es un and && tienen que ser los dos true para que el resultado dea true
		 * si el opreador es un || or con que uno sea true el resultado sera true
		 */
		
		resultado = !(a == b || c < b); // a != b && c >= b : !(false or true) = !false and !true
		// resultado : !(true) = false
		System.out.println("!(a == b || c < b?" + resultado );
		
		

	}

}
