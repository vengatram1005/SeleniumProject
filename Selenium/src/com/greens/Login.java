package com.greens;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lnt.Base;

public class Login extends Base {
	
	
	@FindBy(name="username")
	private WebElement username;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(name="login")
	private WebElement login;

	public WebElement getUsername() {
		return username;
	}

	public void setUsername(WebElement username) {
		this.username = username;
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(WebElement password) {
		this.password = password;
	}

	public WebElement getLogin() {
		return login;
	}

	public void setLogin(WebElement login) {
		this.login = login;
	}
	
	
	public Login() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	

}
