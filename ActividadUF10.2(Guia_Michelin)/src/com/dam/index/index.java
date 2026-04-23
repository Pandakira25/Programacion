package com.dam.index;

import java.util.ArrayList;

import com.dam.ctrl.Ctrl;
import com.dam.model.Restaurante;
import com.dam.model.TablaRestaurantesDAO;
import com.dam.view.VConsRes;
import com.dam.view.VModRes;
import com.dam.view.VPrincipal;
import com.dam.view.VRegRes;

public class index {

	public static void main(String[] args) {
		TablaRestaurantesDAO tpp = new TablaRestaurantesDAO();
    	
    	ArrayList<Restaurante> listaRes = tpp.realizarSelect();
    	
    	VPrincipal vp = new VPrincipal();
    	VRegRes vr = new VRegRes();
    	VModRes vm = new VModRes();
    	VConsRes vc = new VConsRes();
   
    	Ctrl c = new Ctrl(vp, vr, vm, vc);
    	
    	vp.showWindow();
    	vp.setCtrl(c);
	}

}
