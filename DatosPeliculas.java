import java.util.ArrayList;

public class DatosPeliculas {
	
	private ArrayList<Pelicula> listaPeliculas;
	
	public DatosPeliculas() {
		listaPeliculas = new ArrayList<Pelicula>();
		cargaInicial();
	}
	
	private void cargaInicial() {
		listaPeliculas.add(new Pelicula("Avatar", "James Cameron", "Ciencia ficción", 2009, 2923.7));
		listaPeliculas.add(new Pelicula("Vengadores: Endgame", "Anthony y Joe Russo", "Superhéroes", 2019, 2799.4));
		listaPeliculas.add(new Pelicula("Avatar: El sentido del agua", "James Cameron", "Ciencia ficción", 2022, 2320.2));
		listaPeliculas.add(new Pelicula("Titanic", "James Cameron", "Drama romántico", 1997, 2264.7));
		listaPeliculas.add(new Pelicula("Star Wars: Episodio VII – El despertar de la Fuerza", "J.J.Abrams", "Ciencia ficción", 2015, 2071.3));
		listaPeliculas.add(new Pelicula("Vengadores: Infinity War", "Anthony y Joe Russo", "Superhéroes", 2018, 2052.4));
		listaPeliculas.add(new Pelicula("Spider Man: No Way Home", "Jon Watts", "Superhéroes", 2021, 1921.4));
		listaPeliculas.add(new Pelicula("Inside Out2 (Del Revés2)", "Kelsey Mann", "Animación", 2024, 1698.9));
		listaPeliculas.add(new Pelicula("Jurassic World", "Colin Trevorrow", "Ciencia ficción", 2015, 1671.5));
		listaPeliculas.add(new Pelicula("El Rey León (liveaction)", "Jon Favreau", "Animación", 2019, 1662.0));
		listaPeliculas.add(new Pelicula("Los Vengadores", "Joss Whedon", "Superhéroes", 2012, 1520.5));
		listaPeliculas.add(new Pelicula("Fast & Furious 7", "James Wan", "Acción", 2015, 1515.3));
		listaPeliculas.add(new Pelicula("Top Gun: Maverick", "Joseph Kosinski", "Acción", 2022, 1503.9));
		listaPeliculas.add(new Pelicula("FrozenII", "Chris Buck / Jennifer Lee", "Animación", 2019, 1453.7));
		listaPeliculas.add(new Pelicula("Barbie", "Greta Gerwig", "Comedia", 2023, 1447.1));
		listaPeliculas.add(new Pelicula("Vengadores: La era de Ultrón", "Joss Whedon", "Superhéroes", 2015, 1405.0));
		listaPeliculas.add(new Pelicula("Super Mario Bros.: La película", "Aaron Horvath / Michael Jelenic", "Animación", 2023, 1360.6));
		listaPeliculas.add(new Pelicula("Black Panther", "Ryan Coogler", "Superhéroes", 2018, 1349.9));
		listaPeliculas.add(new Pelicula("HarryPotter y las Reliquias de la Muerte – Parte2", "David Yates", "Fantasía", 2011, 1342.9));
		listaPeliculas.add(new Pelicula("Star Wars: Episodio VIII – Los últimos Jedi", "Rian Johnson", "Ciencia ficción", 2017, 1334.4));
		
	}

	public void addPelicula(Pelicula peli) {
		listaPeliculas.add(peli);
	}

	public ArrayList<Pelicula> getListaPeliculas() {
		return listaPeliculas;
	}
	
	public String realizarAnalisis() {
		// TODO:
		
		return null;
	}
	

}
