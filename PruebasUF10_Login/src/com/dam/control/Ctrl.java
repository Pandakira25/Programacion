package com.dam.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.dam.model.Usuario;
import com.dam.model.UsuariosDAO;
import com.dam.view.VLogin;
import com.dam.view.VPrincipal;

public class Ctrl implements ActionListener{
	
	private VLogin vl;
	private VPrincipal vp;
	private UsuariosDAO users;
	
	public Ctrl(VLogin vl, VPrincipal vp) {
		this.vl=vl;
		this.vp=vp;
		this.users = new UsuariosDAO();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equalsIgnoreCase(VLogin.BTN_ACCEDER)) {
			//Validar el acceso:
			//Solicitar los datos a la ventana
			System.out.println(VLogin.BTN_ACCEDER);
			Usuario user = vl.getUser();
			if(user != null) {
				//Comprobar que el usuario existe en la tabla usuarios
				//Comprobar qeu la password almacenada coincide con la password introducida
				String pwd = users.consultarPassword(user.getUsuario());
				
				if(pwd == null) {
					vl.showError("El usuario es incorrecto");
				}else {
					if(pwd.equals(user.getPassword())) {
						vl.dispose();
						vp.showWindow();
					}else {
						vl.showError("La cotraseña es incorrecta");
					}
				}
			}
		}
	}
}
