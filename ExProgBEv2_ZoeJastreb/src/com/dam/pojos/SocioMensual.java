package com.dam.pojos;

public class SocioMensual extends Socio {
	private String plan;
	private String numCuenta;
	
	public SocioMensual(String dni, String telefono, String email, String plan, String numCuenta) {
		super(dni, telefono, email);
		this.plan = plan;
		this.numCuenta = numCuenta;
	}
	
	public void cambiarPlan(String plan) {
		this.plan = plan;
	}

	@Override
	public String toString() {
		return "\nSocioMensual:\n" + super.toString() + "\nPlan: " + plan + "\nNúmero de cuenta: " + numCuenta;
	}
	
	
}
