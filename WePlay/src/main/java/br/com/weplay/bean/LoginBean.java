package br.com.weplay.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.weplay.entity.User;

@ManagedBean
@ViewScoped
public class LoginBean {
	
	private User user =  new User();
	private boolean userEx = false;

	public User getUser() {
	
		return user;
	}
	
	public String login(){
		
		
		if(userEx){
			return "index?faces-redirect-true";
		}
		return null;
	}
}
