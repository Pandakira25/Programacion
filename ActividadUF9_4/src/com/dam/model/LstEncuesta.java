package com.dam.model;

import java.util.ArrayList;

public class LstEncuesta {
	
	private ArrayList<Encuesta> lstEncuesta;
	
	public LstEncuesta() {
		lstEncuesta = new ArrayList<Encuesta>();
	}
	
	public ArrayList<Encuesta> getLstEncuesta(){
		return lstEncuesta;
	}
	
	public void addLstEncuesta(Encuesta e) {
		lstEncuesta.add(e);
	}
	
	public void clear() {
		lstEncuesta.removeAll(lstEncuesta);
	}
}
