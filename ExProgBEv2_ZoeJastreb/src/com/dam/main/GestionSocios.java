package com.dam.main;

import java.util.ArrayList;
import java.util.Scanner;
import com.dam.pojos.Socio;
import com.dam.pojos.SocioBono;
import com.dam.pojos.SocioMensual;

public class GestionSocios {
	
	static final int NS[] = {1,5,10,20};
	static final String P[] = {"2 sesiones/semana", "3 sesiones/semana", "Sesiones ilimitadas"};
	static final String PR[]= {"2SS","3SS","SI"};//opciones de planes abrebiadas
	static final String PLANES[]= {"B","M"};

	public static void main(String[] args) {
		ArrayList<Socio> socios = new ArrayList<Socio>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("** Gestión de socios de Broklyn Fitboxing **");
		
		int op;
		
		do {
			op=showMenu(sc);
			switch(op) {
			case 1:
				addSocio(socios,sc);
				break;
			case 2:
				showList(socios);
				break;
			case 3:
				refillBono(socios,sc);
				break;
			case 4:
				changePlan(socios,sc);
				break;
			case 5:
				System.out.println("** Cerrando la aplicación **");
				break;
			}
		}while(op!=5);
		
		sc.close();
	}

	private static void changePlan(ArrayList<Socio> socios, Scanner sc) {
		String dni = verDNI("Introduce el dni del socio de bono",sc);
		String plan;
		boolean valid=true;
		boolean noCont = true;
		
		for(int i = 0; i<socios.size();i++) {
			if(dni.equalsIgnoreCase(socios.get(i).getDni())) {
				if(socios.get(i) instanceof SocioMensual) {
					noCont=false;
					do {
						valid=true;
						System.out.println("Indica el palan al que se desea cambiar:");
						System.out.println(PR[0]+" - " + P[0]);
						System.out.println(PR[1]+" - " + P[1]);
						System.out.println(PR[2]+" - " + P[2]);
						plan=sc.nextLine();
						if(!plan.equalsIgnoreCase(PR[0]) && !plan.equalsIgnoreCase(PR[1]) && !plan.equalsIgnoreCase(PR[2])) {
							valid=false;
							System.out.println("Debe ser una de las opciones indicadas");
						}
					}while(!valid);
					((SocioMensual) socios.get(i)).cambiarPlan(plan);
					System.out.println("Plan cambiado");
				}else {
					System.out.println("No tiene plan mensual");
				}
			}
		}
		
		if(noCont == true) {
			System.out.println("No se encuentra en la lista");
		}
	}

	private static void refillBono(ArrayList<Socio> socios, Scanner sc) {
		String dni = verDNI("Introduce el dni del socio de bono",sc);
		int numSesiones;
		
		boolean noCont = true;
		boolean valid;
		
		for(int i = 0; i<socios.size() && noCont;i++) {
			if(dni.equalsIgnoreCase(socios.get(i).getDni())) {
				noCont = false;
				try {
					if((socios.get(i) instanceof SocioBono)) {
						do {
							valid=true;
							System.out.println("\nIntroduce el número de sesiones que quiere cargar(1,5,10,20)");
							numSesiones=Integer.parseInt(sc.nextLine());
							if(numSesiones != NS[0] && numSesiones != NS[1] && numSesiones != NS[2] && numSesiones != NS[3] ) {
								valid=false;
								System.out.println("Los bonos pueden ser solo por 1,5,10 o 20 sesiones");
							}
						}while(!valid);
						((SocioBono) socios.get(i)).recargarBono(numSesiones);
						System.out.println("Sesiones recargadas");
					}
				}catch(NumberFormatException e) {
					System.out.println("Debe ser un número entero");
				}
			}
		}
		
		if(noCont == true) {
			System.out.println("No se encuentra en la lista o No tiene plan de bono");
		}
		
	}

	private static void showList(ArrayList<Socio> socios) {
		for(Socio sc : socios) {
			System.out.println(sc.toString());
		}
	}

	private static void addSocio(ArrayList<Socio> socios, Scanner sc) {
		String dni = verDNI("Introduce el dni del nuevo socio",sc);
		String telefono;
		String email;
		
		Socio s = new Socio(dni);
		
		String op;
		
		boolean valid=true;
		boolean noCont = true;
		
		for(int i = 0; i<socios.size() && noCont;i++) {
			if(dni.equalsIgnoreCase(socios.get(i).getDni())) {
				noCont=false;
				System.out.println("El socio ya se encuentra en el listado");
			}
		}
		
		if(noCont == true) {
			do {
				try {
					valid=true;
					telefono = verT(sc);
					email = solicitarC("Introduce el email",sc);
					System.out.println("Indica si el socio se va a acoger a bono o mensualidad(B/M)");
					op=sc.nextLine();
					if(op.equalsIgnoreCase(PLANES[0])) {
						//addBono
						addBono(socios, sc, dni, telefono, email);
					}else if(op.equalsIgnoreCase(PLANES[1])) {
						//addMensual
						addMensual(socios, sc, dni, telefono, email);
						
					}else {
						valid=false;
						throw new Exception("Debe ser una de las opciones");
					}
				}catch(NumberFormatException e) {
					System.out.println("Debe ser un número entero");
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}while(!valid);
		}
		
		
	}

	private static void addMensual(ArrayList<Socio> socios, Scanner sc, String dni, String telefono, String email) {
		String plan;
		String numCuenta;
		Socio sm;
		
		boolean valid = true;
		
		do {
			valid=true;
			System.out.println("Indica el palan al que se acoge:");
			System.out.println(PR[0]+" - " + P[0]);
			System.out.println(PR[1]+" - " + P[1]);
			System.out.println(PR[2]+" - " + P[2]);
			plan=sc.nextLine();
			
			if(!plan.equalsIgnoreCase(PR[0]) && !plan.equalsIgnoreCase(PR[1]) && !plan.equalsIgnoreCase(PR[2])) {
				valid=false;
				System.out.println("Ingrese una de las opciones");
			}
		}while(!valid);
		System.out.println("Introduce la cuenta bancaria");
		numCuenta=sc.nextLine();
		sm = new SocioMensual(dni,telefono,email,plan,numCuenta);
		socios.add(sm);
		System.out.println("¡Socio registrado!");
	}

	private static void addBono(ArrayList<Socio> socios, Scanner sc, String dni, String telefono, String email) {
		int numSesiones;
		SocioBono sb;
		boolean valid = true;
		do {
			valid=true;
			System.out.println("\nIntroduce el número de sesiones que quiere cargar(1,5,10,20)");
			numSesiones=Integer.parseInt(sc.nextLine());
			if(numSesiones != NS[0] && numSesiones != NS[1] && numSesiones != NS[2] && numSesiones != NS[3] ) {
				valid=false;
				System.out.println("Los bonos pueden ser solo por 1,5,10 o 20 sesiones");
			}
		}while(!valid);
		sb = new SocioBono(dni,telefono,email,numSesiones);
		socios.add(sb);
		System.out.println("¡Socio registrado!");
	}

	//---
	private static String verDNI(String mensaje,Scanner sc) {
		boolean valid=true;
		String dni;
		do{
			valid=true;
			dni=solicitarC(mensaje, sc);
			if(dni.length() != 9) {
				valid=false;
				System.out.println("Debe tener exactamente 9 caracteres");
			}
		}while(!valid);
		return dni;
	}
	
	//---
	private static String verT(Scanner sc) {
		boolean valid=true;
		String telefono;
		do{
			telefono=solicitarC("Introduce el número de telefono", sc);
			if(telefono.length() <= 12) {
				valid=true;
			}else {
				valid=false;
				System.out.println("El teléfono no debe superar los 12 caracteres");
			}
		}while(!valid);
		return telefono;
	}

	//---
	private static String solicitarC(String mensaje, Scanner sc) {
		System.out.println(mensaje);
		String c = sc.nextLine();
		while(c.isEmpty()) {
			System.out.println("No puede estar vacío");
			c = sc.nextLine();
		}
		return c;
	}
	
	//---

	private static int showMenu(Scanner sc) {
		int op = 0;

		try {
			System.out.println("\nIndica la acción que deseas realizar:");
			System.out.println("1- Para añadir un socio");
			System.out.println("2- Para mostrar el listado");
			System.out.println("3- Para recargar un bono");
			System.out.println("4- Para cambiar de plan");
			System.out.println("5- Para salir de la aplicación");
			op = Integer.parseInt(sc.nextLine());
			if(op != 1 && op != 2 && op != 3 && op != 4 && op != 5) {
				throw new NumberFormatException();
			}		
		} catch (NumberFormatException e) {
			System.out.println("Introduce un numero entero de las opciones");
		}
		return op;
	}

}
