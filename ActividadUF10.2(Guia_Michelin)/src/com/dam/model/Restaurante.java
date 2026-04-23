package com.dam.model;

public class Restaurante {
	
	private int id;
	private String desc;
	
	public Restaurante(int id,String desc) {
		this.id=id;
		this.desc=desc;
	}
	
	public Restaurante(String desc) {
		this.desc=desc;
	}

	public String toString() {
		return "RegTablaPrueba: id: " + id + " desc: " + desc;
	}
	
	public String getDesc() {
		return desc;
	}
}
