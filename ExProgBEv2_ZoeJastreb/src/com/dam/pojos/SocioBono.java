package com.dam.pojos;

public class SocioBono extends Socio {
	private int numSesiones;

	public SocioBono(String dni, String telefono, String email, int numSesiones) {
		super(dni, telefono, email);
		this.numSesiones = numSesiones;
	}
	
	public void recargarBono (int num) {
			numSesiones += num;
	}

	public String toString() {
		return "\nSocioBono:\n " + super.toString() + "\nSesiones en bono: " + numSesiones;
	}
}
