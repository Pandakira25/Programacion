package com.dam.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class DatosPeliculas {
	
	private ArrayList<Pelicula> lstP;
	
	public DatosPeliculas() {
		lstP = new ArrayList<Pelicula>();
		cargaInicial();
	}
	
	private void cargaInicial() {
		lstP.add(new Pelicula("Avatar", "James Cameron", "Ciencia ficción", 2009, 2923.7));
		lstP.add(new Pelicula("Vengadores: Endgame", "Anthony y Joe Russo", "Superhéroes", 2019, 2799.4));
		lstP.add(new Pelicula("Avatar: El sentido del agua", "James Cameron", "Ciencia ficción", 2022, 2320.2));
		lstP.add(new Pelicula("Titanic", "James Cameron", "Drama romántico", 1997, 2264.7));
		lstP.add(new Pelicula("Star Wars: Episodio VII – El despertar de la Fuerza", "J.J.Abrams", "Ciencia ficción", 2015, 2071.3));
		lstP.add(new Pelicula("Vengadores: Infinity War", "Anthony y Joe Russo", "Superhéroes", 2018, 2052.4));
		lstP.add(new Pelicula("Spider Man: No Way Home", "Jon Watts", "Superhéroes", 2021, 1921.4));
		lstP.add(new Pelicula("Inside Out2 (Del Revés2)", "Kelsey Mann", "Animación", 2024, 1698.9));
		lstP.add(new Pelicula("Jurassic World", "Colin Trevorrow", "Ciencia ficción", 2015, 1671.5));
		lstP.add(new Pelicula("El Rey León (liveaction)", "Jon Favreau", "Animación", 2019, 1662.0));
		lstP.add(new Pelicula("Los Vengadores", "Joss Whedon", "Superhéroes", 2012, 1520.5));
		lstP.add(new Pelicula("Fast & Furious 7", "James Wan", "Acción", 2015, 1515.3));
		lstP.add(new Pelicula("Top Gun: Maverick", "Joseph Kosinski", "Acción", 2022, 1503.9));
		lstP.add(new Pelicula("FrozenII", "Chris Buck / Jennifer Lee", "Animación", 2019, 1453.7));
		lstP.add(new Pelicula("Barbie", "Greta Gerwig", "Comedia", 2023, 1447.1));
		lstP.add(new Pelicula("Vengadores: La era de Ultrón", "Joss Whedon", "Superhéroes", 2015, 1405.0));
		lstP.add(new Pelicula("Super Mario Bros.: La película", "Aaron Horvath / Michael Jelenic", "Animación", 2023, 1360.6));
		lstP.add(new Pelicula("Black Panther", "Ryan Coogler", "Superhéroes", 2018, 1349.9));
		lstP.add(new Pelicula("HarryPotter y las Reliquias de la Muerte – Parte2", "David Yates", "Fantasía", 2011, 1342.9));
		lstP.add(new Pelicula("Star Wars: Episodio VIII – Los últimos Jedi", "Rian Johnson", "Ciencia ficción", 2017, 1334.4));

	}

	public ArrayList<Pelicula> getLstP(){
		return lstP;
	}
	
	public void addLstP(Pelicula p) {
		lstP.add(p);
	}
	
	public String realizarAnalisis() {
		String info = "";
		
		HashMap<String, Integer> cG = new HashMap<String, Integer>();
		for (String genero : Pelicula.GENEROS) {
			cG.put(genero, 0);
		}
		
		for(Pelicula p : lstP) {
			cG.put(p.getGenero(), cG.get(p.getGenero()) + 1);
		}
		
		info += "**Pelis por género: \n";
		for(Entry<String, Integer> entry : cG.entrySet()) {
			info += "\t" + entry.getKey() + ": " + entry.getValue() + "\n";
		}
		
		double sumR = 0;
		int pMA = lstP.get(0).getaPublicacion();
		Pelicula peliMA = null;
		
		for(int i = 0; i < lstP.size(); i++) {
			sumR += lstP.get(i).getRecaudacion();
			if(pMA > lstP.get(i).getaPublicacion()) {
				pMA = lstP.get(i).getaPublicacion();
				peliMA = lstP.get(i);
			}
		}
		
		info += "** Total de recaudación: " + sumR + "M USD\n";
		
		info += "** La peli más antigua es: " + peliMA.getNombre() + "(" + peliMA.getaPublicacion() + ")";
		
		return info;
	}
}
