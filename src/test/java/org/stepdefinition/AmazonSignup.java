package org.stepdefinition;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonSignup extends BaseClass{
	public AmazonSignup() {
	PageFactory.initElements(driver, this);
	
	}
	@FindBy(name="email")
	private WebElement email;
	@FindBy(xpath = "//input[@id='continue']")
    private WebElement continueBtn;
	@FindBy(name = "password")
	private WebElement password;
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement signinBtn;
	
	public WebElement getEmail() {
		return email;
	}
	public WebElement getContinueBtn() {
		return continueBtn;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getSigninBtn() {
		return signinBtn;
	}
	
	
	

}
