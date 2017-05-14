package br.com.weplay.util;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class MessageUtil {
	
	public static void showMessage(String menssage){
		
		FacesMessage msg = new FacesMessage(menssage);
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}
}
