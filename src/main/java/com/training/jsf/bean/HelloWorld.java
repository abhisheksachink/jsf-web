package com.training.jsf.bean;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="helloWorld")
@SessionScoped
public class HelloWorld {
	public String getMessage() {
		return "Hello World From JSF...";
	}
	public int getValue() {
		return 89;
	}

}
