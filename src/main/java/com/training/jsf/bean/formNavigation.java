package com.training.jsf.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="nav")
@RequestScoped
public class formNavigation {
	public String displayTestPage() {
		return "test";
	}
	public String displayWelcomePage() {
		return "welcome";
	}
	

}
