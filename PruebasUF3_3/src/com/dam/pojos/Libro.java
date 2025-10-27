package com.dam.pojos;

public class Libro {
	
	
	//Primero las constantes
	
	//Despues atributos
	private String titulo;
	private String autor;
	private int numPag;
	private boolean tapaDura;
	
	//Constructores
	//son públicos
	//no tienen indicador de retorno 
	//nombre igual a la clase
	
	//contructor por defecto
	public Libro() {}
	
	//constructor que inicializa todos los atributos, como hay cuatro atributos, necesita 4 parámetros
	public Libro(String valorTitulo, String valorAutor, int valorNumPag, boolean valorTapaDura) {
		titulo = valorTitulo;
		autor = valorAutor;
		numPag = valorNumPag;
		tapaDura = valorTapaDura;
	}
	
	//por último los métodos
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor; //this es para romper la ambiguedad y que le asigne el valor de la variable local a la global
	}

	public int getNumPag() {
		return numPag;
	}

	public void setNumPag(int numPag) {
		this.numPag = numPag;
	}

	public boolean isTapaDura() { //para los booleanos no se usa get se usa is
		return tapaDura;
	}

	public void setTapaDura(boolean tapaDura) {
		this.tapaDura = tapaDura;
	}
	
	public String toString() {
		String cadena = "Titulo: " + titulo + "\nAutor: " + autor + "\nNumero de paginas: " + numPag + "\nTiene tapas duras?? " + (tapaDura? "si" : "no");
		return cadena;
	}

	
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String valor) {
		titulo = valor;
		
	}

}
