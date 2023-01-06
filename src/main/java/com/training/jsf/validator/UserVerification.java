package com.training.jsf.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("com.training.jsf.validator.UserVerification")
public class UserVerification implements Validator{
	private static final String user1="ramu";
	
	private Pattern pattern;
	private Matcher matcher;
	
	public UserVerification() {
	pattern = Pattern.compile(user1);
	}
	
	
public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
		
	
	matcher = pattern.matcher(value.toString());
	if(!matcher.matches()) {
		FacesMessage msg = new FacesMessage("user Validation Failed..");
		msg.setSeverity(FacesMessage.SEVERITY_ERROR);
		throw new ValidatorException(msg);
	}
}
}
