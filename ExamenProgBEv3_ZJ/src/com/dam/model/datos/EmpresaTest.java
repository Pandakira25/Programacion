package com.dam.model.datos;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class EmpresaTest {
	
	@Test
	public void testValidarCif() {
		assertTrue(Empresa.validarCif("A12345678"));
	}

	@Test
	public void testValidarCorreo() {
		assertTrue(Empresa.validarCorreo("pepe@pepe.com"));
	}

	@Test
	public void testValidarTelefono() {
		assertTrue(Empresa.validarTelefono("612345678"));
	}

	@Test
	public void testValidarWeb() {
		assertTrue(Empresa.validarWeb("www.pepe.com"));
	}
	
	@Test
	public void testValidarTelefonofalse() {
		assertFalse(Empresa.validarTelefono("523456789"));
	}

}
