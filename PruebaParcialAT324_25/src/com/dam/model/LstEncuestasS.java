package com.dam.model;

import java.util.ArrayList;

public class LstEncuestasS {
	
	private ArrayList<EncuestaSerie> lstESeries;
	
	public LstEncuestasS() {
		lstESeries = new ArrayList<EncuestaSerie>();
	}
	
	public ArrayList<EncuestaSerie> getLstESeries(){
		return lstESeries;
	}
	
	public void addLstESeries(EncuestaSerie e) {
		lstESeries.add(e);
	}
	
	public void clear() {
		lstESeries.removeAll(lstESeries);
	}
	
	public String perREdad() {
		int e517 = 0;
		int e1830 = 0;
		int e3140 = 0;
		int e4165 = 0;
		int e66m = 0;
		
		for(EncuestaSerie es : lstESeries) {
			if(es.getEdad().equals(EncuestaSerie.ageRange[0])) {
				e517++;
			}else if(es.getEdad().equals(EncuestaSerie.ageRange[1])) {
				e1830++;
			}else if(es.getEdad().equals(EncuestaSerie.ageRange[2])) {
				e3140++;
			}else if(es.getEdad().equals(EncuestaSerie.ageRange[3])) {
				e4165++;
			}else if(es.getEdad().equals(EncuestaSerie.ageRange[4])) {
				e66m++;
			}
		}
		
		return "De 5 a 17: " + e517 + ", De 18 a 30: " + e1830 + ", De 31 a 40: " + e3140 + ", De 41 a 65: " + e4165 + ", De más de 65: " + e66m;
	}
	
	public String frecMasUsada() {
		String fMasUsada;
		int f1 = 0;
		int f2 = 0;
		int f3 = 0;
		int f4 = 0;
		int f5 = 0;
		
		for(EncuestaSerie es : lstESeries) {
			if(es.getFrecuencia().equals(EncuestaSerie.opFrecuencia[0])) {
				f1++;
			}else if(es.getFrecuencia().equals(EncuestaSerie.opFrecuencia[1])) {
				f2++;
			}else if(es.getFrecuencia().equals(EncuestaSerie.opFrecuencia[2])) {
				f3++;
			}else if(es.getFrecuencia().equals(EncuestaSerie.opFrecuencia[3])) {
				f4++;
			}else if(es.getFrecuencia().equals(EncuestaSerie.opFrecuencia[4])) {
				f5++;
			}
		}
		
		if(f1>f2 && f1>f3 && f1>f4 && f1>f5) {
			fMasUsada = EncuestaSerie.opFrecuencia[0];
		}else if(f2>f3 && f2>f4 && f2>f5) {
			fMasUsada = EncuestaSerie.opFrecuencia[1];
		}else if(f3>f4 && f3>f5) {
			fMasUsada = EncuestaSerie.opFrecuencia[2];
		}else if(f4>f5) {
			fMasUsada = EncuestaSerie.opFrecuencia[3];
		}else {
			fMasUsada = EncuestaSerie.opFrecuencia[4];
		}
		
		return "Frecuencia más frecuente: " + fMasUsada;
	}
	
	public String serieMasVista() {
		int s1 = 0;
		int s2 = 0;
		int s3 = 0;
		int s4 = 0;
		int s5 = 0;
		int s6 = 0;
		int s7 = 0;
		int s8 = 0;
		
		String sMasVista;
		
		for(int i = 0; i < lstESeries.size(); i++) {
			for(int j = 0; j < lstESeries.get(i).getSeriesVistas().size(); j++) {
				for(int x = 0; x < EncuestaSerie.posiblesSeries.length; x++) {
					if(lstESeries.get(i).getSeriesVistas().get(j).equals(EncuestaSerie.posiblesSeries[x])) {
						switch(x) {
						case 0:
							s1++;
							break;
						case 1:
							s2++;
							break;
						case 2:
							s3++;
							break;
						case 3:
							s4++;
							break;
						case 4:
							s5++;
							break;
						case 5:
							s6++;
							break;
						case 6:
							s7++;
							break;
						case 7:
							s8++;
							break;
						}
					}
				}
			}
		}
		
		if(s1 > s2 && s1 > s3 && s1 > s4 && s1 > s5 && s1 > s6 && s1 > s7 && s1 > s8) {
			sMasVista = EncuestaSerie.posiblesSeries[0];
		}else if(s2 > s3 && s2 > s4 && s2 > s5 && s2 > s6 && s2 > s7 && s2 > s8) {
			sMasVista = EncuestaSerie.posiblesSeries[1];
		}else if(s3>s4 && s3>s5 && s3>s6 && s3>s7 && s3>s8) {
			sMasVista = EncuestaSerie.posiblesSeries[2];
		}else if(s4>s5 && s4>s6 && s4>s7 && s4>s8) {
			sMasVista = EncuestaSerie.posiblesSeries[3];
		}else if(s5>s6 && s5>s7 && s5>s8) {
			sMasVista = EncuestaSerie.posiblesSeries[4];
		}else if(s6>s7 && s6>s8) {
			sMasVista = EncuestaSerie.posiblesSeries[5];
		}else if(s7>s8) {
			sMasVista = EncuestaSerie.posiblesSeries[6];
		}else {
			sMasVista = EncuestaSerie.posiblesSeries[7];
		}
		
		return "Serie más vista" + sMasVista;
	}
}
