package com.dam.pojos;

import java.util.Objects;

public class Socio {
	protected String dni;
	protected String telefono;
	protected String email;
	
	public Socio(String dni, String telefono, String email) {
		this.dni = dni;
		this.telefono = telefono;
		this.email = email;
	}
	
	public Socio(String dni) {
		this.dni=dni;
	}
	
	public String getDni() {
		return dni;
	}
	
	public String toString() {
		return "DNI: " + dni + "\nTeléfono: " + telefono + "\nEmail: " + email;
	}

	public int hashCode() {
		return Objects.hash(dni);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		Socio other = (Socio) obj;
		return Objects.equals(dni, other.dni);
	}
	
	
}
