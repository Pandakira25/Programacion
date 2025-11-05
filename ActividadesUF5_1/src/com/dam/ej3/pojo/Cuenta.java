package com.dam.ej3.pojo;

public class Cuenta {
	protected int numeroCuenta;
	protected double saldo;
	
	public Cuenta(int cuenta,
	double inicial) {
	numeroCuenta = cuenta;
	saldo = inicial;
	}
	
	public void depositar(double cantidad) {
	saldo = saldo + cantidad;
	}
	
	public double getSaldo() {
	return saldo;
	}
}
