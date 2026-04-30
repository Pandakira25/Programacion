package com.dam.model;

public class Restaurante {
	
	public static final int DISTINCIONES []= {1,2,3};
	public static final String REGIONES [] = {"Andalucía","Aragón","Asturias","Islas Baleares","Cantabria","Islas Canarias","Castilla - La Mancha","Castilla y León", "Cataluña","Galicia", "Extremadura","Madrid", "Murcia", "Navarra", "País Vasco", "La Rioja", "Comunidad Valenciana"};
	public static final String COCINAS[] = {"Creativa","Moderna","Tradicional","Regional","Fusión"};
	
	private int id, distincion;
	private String nombre , region , ciudad, direccion, cocina, telefono, web;
	private double precioMin, precioMax;

	//Constructor
	public Restaurante(int id, String nombre, String region, String ciudad, int distincion, String direccion, double precioMin, double precioMax, String cocina, String telefono, String web) {
		this.id = id;
		this.nombre = nombre;
		this.region = region;
		this.ciudad = ciudad;
		this.distincion = distincion;
		this.direccion = direccion;
		this.precioMin = precioMin;
		this.precioMax = precioMax;
		this.cocina = cocina;
		this.telefono = telefono;
		this.web = web;
	}
	
	
	//Getters
	public int getDistincion() {
		return distincion;
	}
	public String getNombre() {
		return nombre;
	}
	public String getRegion() {
		return region;
	}
	public String getCiudad() {
		return ciudad;
	}
	public String getCocina() {
		return cocina;
	}
	public double getPrecioMin() {
		return precioMin;
	}
	public double getPrecioMax() {
		return precioMax;
	}
	public int getId() {
		return id;
	}

	//ToString
	public String toString() {
		return "ID: " + id + ", Nombre:" + nombre + ", Region: " + region + ", Ciudad: " + ciudad + ", Distincion: " + distincion + ", Direccion: " + direccion + ", PrecioMin: " + precioMin + ", PrecioMax: " + precioMax + ", Cocina: " + cocina + ", Telefono: " + telefono + ", Web:" + web;
	}
}
