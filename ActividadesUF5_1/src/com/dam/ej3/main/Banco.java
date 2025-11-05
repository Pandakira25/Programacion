package com.dam.ej3.main;

import com.dam.ej3.pojo.Cuenta;

public class Banco {

	public static void main(String[] args) {
		Cuenta cuenta1 = new Cuenta(12345, 505.4);
		double totalCuenta = cuenta1.getSaldo();//como esta en protected no me deja acceder desde otro paqute entonces tengo que usar getSaldo
		System.out.println("Total actual en la cuenta:"+ totalCuenta +" Euros");//total_cuenta esta mal ya que antes se usa camelCase 

	}

}
