package com.dam.pojos;

import java.util.ArrayList;

public class Casa {
	private ArrayList<Estancia> listaEstancias;
	private String direccion;
	
	public Casa(String direccion) {
		this.direccion=direccion;
		listaEstancias = new ArrayList<Estancia>();
	}
	
	public void addEstancia(Estancia estancia) {
		listaEstancias.add(estancia);
	}
	
	public ArrayList<Estancia> getListaEstancias() {
		return listaEstancias;
	}
	
	public double calcularTotalM2() {
		double sum = 0;
		for(Estancia estancia : listaEstancias) {
			sum += estancia.getMetrodCuad();
			if(estancia instanceof Cocina) {
				Cocina objCocina = (Cocina) estancia;
				if(objCocina.isTieneTendedero()) {
					sum += objCocina.getM2Tend();
				}
			}else if(estancia instanceof Salon) {
				if(((Salon)estancia).isTieneTerraza()) {
					sum+=((Salon)estancia).getM2Terr();
				}
			}
		}
		
		return sum;
	}
	
	
	public String toString() {
		String cadena = "";
		
		System.out.println("Estancias de la casa con direccion: " + direccion + " tiene " + listaEstancias.size());
		
		for(Estancia estancia : listaEstancias) {
			cadena += "\n" + estancia;
		}
		
		return cadena;
	}
}
