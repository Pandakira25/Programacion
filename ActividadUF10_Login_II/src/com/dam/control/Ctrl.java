package com.dam.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.dam.model.Usuario;
import com.dam.model.UsuariosDAO;
import com.dam.view.VLogin;
import com.dam.view.VPrincipal;
import com.dam.view.VRegistro;

public class Ctrl implements ActionListener{
	
	private static final String BTN_ACCEDER = VLogin.BTN_ACCEDER;
	private static final String BTN_REGISTRARSE = VLogin.BTN_REGISTRARSE;
	private static final String BTN_OK = VRegistro.BTN_OK;
	private static final String BTN_CANCEL = VRegistro.BTN_CANCEL;
	
	private VLogin vl;
	private VRegistro vr;
	private VPrincipal vp;
	private UsuariosDAO users;
	
	public Ctrl(VLogin vl, VPrincipal vp, VRegistro vr) {
		this.vl=vl;
		this.vp=vp;
		this.vr=vr;
		this.users = new UsuariosDAO();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand()) {
		case BTN_ACCEDER:
			//Validar el acceso:
			//Solicitar los datos a la ventana
			System.out.println(BTN_ACCEDER);
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
			break;
		case BTN_REGISTRARSE:
			//carga la ventana de registrarse
			vl.dispose();
			vr.showWindow();
			break;
		case BTN_OK:
			//comprueba que la contraseña y la confirmación sean iguales,  
			if(vr.pwdNotEmpty()) {
				if(vr.isEqualPassword()) {
					Usuario userVr = vr.getUser();
					if(userVr != null) {
						//dsp que usuario no exista ya
						if(userExist(userVr)) {
							vr.showError("El usuario ya existe");
						}else {
							//y si todo está ok carga el de login ya con el usuario
							users.insertNewUser(userVr);
							System.out.println(users.consultarUsuarios());
							vr.dispose();
							vl.showWindowWithUser(userVr.getUsuario());
						}
					}
				}else {
					vr.showError("Las contraseñas no coinciden");
				}
			}else {
				vr.showError("Ambas contraseñas deben coincidir y no estar vacías");
			}
			break;
		case BTN_CANCEL:
			//se cierra la ventana de registro y se carga la de login
			vr.dispose();
			vl.showWindow();
			break;
		}
	}

	private boolean userExist(Usuario u) {
		boolean exist = false;
		for(int i = 0; i < users.consultarUsuarios().size(); i ++) {
			if(users.consultarUsuarios().get(i).getUsuario().equals(u.getUsuario())) {
				exist = true;
			}
		}
		return exist;
	}
}
