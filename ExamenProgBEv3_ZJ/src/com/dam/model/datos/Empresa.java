package com.dam.model.datos;

public class Empresa {

	private String cif;
	private String razonSocial;
	private String domicilio;
	private String representante;
	private String correoRL;
	private String convenio;
	private int numEmpleados;
	private String telefono;
	private String web;

	public Empresa(String cif, String razonSocial, String domicilio, String representante, String correoRL,
			String convenio, int numEmpleados, String telefono, String web) {
		this.cif = cif;
		this.razonSocial = razonSocial;
		this.domicilio = domicilio;
		this.representante = representante;
		this.correoRL = correoRL;
		this.convenio = convenio;
		this.numEmpleados = numEmpleados;
		this.telefono = telefono;
		this.web = web;
	}

	public String getCif() {
		return cif;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public String getRepresentante() {
		return representante;
	}

	public String getCorreoRL() {
		return correoRL;
	}

	public String getConvenio() {
		return convenio;
	}

	public int getNumEmpleados() {
		return numEmpleados;
	}

	public String getTelefono() {
		return telefono;
	}

	public String getWeb() {
		return web;
	}

	public String traducirConvenio() {
		if (convenio.equalsIgnoreCase("SI")) {
			return "Firmado";
		} else {
			return "Pendiente";
		}
	}

	public static boolean validarCif(String cif) {
		boolean esValido = true;

		/*
		 *  OPCIÓN 1: Validación de cif: Tiene que tener 9 caracteres El primer
		 * caracter debe ser una letra: utiliza el método Character.isLetter(c) Los 7
		 * caracteres centrales deben ser dígitos Si no se cumple algo de esto no es
		 * válido
		 */
		int n = 0;
		String cifSinL = "";
		for(int i = 1; i < cif.length(); i++) {
			cifSinL += cif.charAt(i);
		}
		//System.out.println(Character.isLetter(cif.charAt(0)));
		//System.out.println(cifSinL);
		if(Character.isLetter(cif.charAt(0))) {
			try {
				n = Integer.parseInt(cifSinL);
				//System.out.println(n);
			} catch (NumberFormatException e) {
				//System.out.println(n + "numFE");
				esValido=false;
			}
		}

		/*
		 *  OPCIÓN 2: Validación de cif: Tiene que tener 9 caracteres El primer
		 * caracter debe ser una letra: utiliza el método Character.isLetter(c) Los 7
		 * caracteres centrales deben ser dígitos Si son dígitos, calcular el dígito de
		 * control, dc Obtener el último caracter, uc, que puede ser un número o una
		 * letra Si es un número, convierte uc a número usando
		 * Character.getNumericValue(uc) y tiene que ser igual al dígito de control, dc
		 * Si es una letra, convertimos en letra el dígito de control, ldc, según la
		 * posición del siguiente array char[] letrasControl =
		 * {'J','A','B','C','D','E','F','G','H','I'}; es decir, si dc = 3 --> ldc = 'C'
		 * y uc tiene que ser igual a ldc Si no se cumple algo de esto no es válido
		 */

		return esValido;
	}

	private static int calcularDigitoControl(String cif) {
		int dc = -1;
		/*
		 * TODO: Calcular el dígito de control, dc, para la OPCIÓN 2 Paso 1: Recorriendo
		 * los 7 caracteres centrales, es decir, los que ocupan las posiciones entre la
		 * 1 y la 7 convierte a número cada caracter usando Character.getNumericValue(c)
		 * sumar por un lado, sumaP, aquellos que ocupan posiciones pares sumar por otro
		 * lado, sumaI, la suma de los dígitos del doble de aquellos que ocupan
		 * posiciones impares
		 * 
		 * Paso 2: Suma estas dos cantidades y quédate con el último número del
		 * resultado, u
		 * 
		 * El dígito de control, dc, será cero si u es 0 si u no es 0, entonces es el
		 * resultado de restar u a 10
		 * 
		 */
		return dc;
	}

	public static boolean validarCorreo(String email) {
		boolean esValido = true;

		/*
		 *  OPCIÓN 1: Validación de email: No puede estar vacío ni contiene
		 * espacios Utiliza el método indexOf y lastIndexOf para comprobar que haya una
		 * y solo una @ Extrae el dominio usando substring, siendo el dominio lo que hay
		 * después de la @ el dominio debe tener al menos 3 caracteres, y debe contener
		 * un punto Si no se cumple algo de esto no es válido
		 */
		int indexAt = 0;
		if(email == null || email.contains(" ") || email.isEmpty()) {
			esValido = false;
		}
		if(email.indexOf("@") < 0 || email.lastIndexOf("@") != email.indexOf("@")) {
			esValido = false;
		}
		String dom = email.substring(indexAt);
		
		if(dom.length()<3) {
			return false;
		}else {
			if(!dom.contains(".")) {
				esValido = false;
			}
		}
		

		/*
		 *  OPCIÓN 2: Validación de email: No puede estar vacío ni contiene
		 * espacios Utiliza el método indexOf y lastIndexOf para comprobar que haya una
		 * y solo una @ y que no puede estar ni al principio y tiene que tener detrás un
		 * dominio que tenga al menos 3 caracteres Extrae el dominio usando substring,
		 * siendo el dominio lo que hay después de la @ el dominio debe tener al menos 3
		 * caracteres, debe contener un punto que no puede estar ni en la primera
		 * posición ni en la última Si no se cumple algo de esto no es válido
		 */

		return esValido;
	}

	public static boolean validarTelefono(String telefono) {
		boolean esValido = true;

		/*
		 *  Validación de telefono Debe tener 9 caracteres Debe empezar por 6, 7, 8
		 * o 9 Todos los caracteres deben ser dígitos Si no se cumple algo de esto no es
		 * válido
		 */
		
		int n;
		
		if(telefono.length() != 9) {
			System.out.println("longitud no");
			esValido = false;
		}else {
			try {
				n = Integer.parseInt(telefono);
				if(telefono.charAt(0) != '6' && telefono.charAt(0) != '7' && telefono.charAt(0) != '8'
						&& telefono.charAt(0) != '9') {
					System.out.println("num inicial no");
					esValido = false;
				}
			} catch (NumberFormatException e) {
				System.out.println("numberformat");
				esValido = false;
			}
		}

		return esValido;
	}

	public static boolean validarWeb(String url) {
		boolean esValido = true;

		/*
		 *  OPCIÓN 1: Validación de email: No puede estar vacío ni contiene
		 * espacios Utiliza la función startsWith para comprobar que empieza por www.
		 * Extrae el dominio usando substring, siendo el dominio lo que hay después de
		 * www. el dominio no puede estar vacío, y debe contener al menos un punto Si no
		 * se cumple algo de esto no es válido
		 */
		String dom = url.substring(3);
		
		if(!url.startsWith("www.")) {
			esValido = false;
		}else {
			if(dom.isEmpty()) {
				esValido = false;
			}
			if(dom.indexOf(".")<0) {
				esValido = false;
			}
		}
		
		/*
		 *  OPCIÓN 2: Validación de email: No puede estar vacío ni contiene
		 * espacios Utiliza la función startsWith para comprobar que empieza por www.
		 * Extrae el dominio usando substring, siendo el dominio lo que hay después de
		 * www. el dominio no puede estar vacío, debe contener al menos un punto y no
		 * puede terminar ni en . ni en - ni en / Si no se cumple algo de esto no es
		 * válido
		 */

		return esValido;
	}

	@Override
	public String toString() {
		return "Empresa [cif=" + cif + ", razonSocial=" + razonSocial + ", domicilio=" + domicilio + ", representante="
				+ representante + ", correoRL=" + correoRL + ", convenio=" + convenio + ", numEmpleados=" + numEmpleados
				+ ", telefono=" + telefono + ", web=" + web + "]";
	}

}
