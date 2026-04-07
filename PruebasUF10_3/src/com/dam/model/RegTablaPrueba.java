package com.dam.model;

public class RegTablaPrueba {
	
	private int id;
	private String desc;
	
	public RegTablaPrueba(int id,String desc) {
		this.id=id;
		this.desc=desc;
	}
	
	public RegTablaPrueba(String desc) {
		this.desc=desc;
	}

	public String toString() {
		return "RegTablaPrueba: id: " + id + " desc: " + desc;
	}
	
	public String getDesc() {
		return desc;
	}
}
