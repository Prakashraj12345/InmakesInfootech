package org.fbsign;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbSignup extends BaseClass{
	public FbSignup() {
		PageFactory.initElements(driver, this);
	}
  
	@FindBy(id="u_0_0_J3")
	private WebElement ClickBtn;
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement Name;
	@FindBy(xpath="(//input[@type='text'])[3]")
	private WebElement SurName;
	@FindBy(id="u_7_g_H8")
	private WebElement Email;
	@FindBy(name="reg_passwd__")
	private WebElement Password;
	public WebElement getClickBtn() {
		return ClickBtn;
	}
	public WebElement getName() {
		return Name;
	}
	public WebElement getSurName() {
		return SurName;
	}
	public WebElement getEmail() {
		return Email;
	}
	public WebElement getPassword() {
		return Password;
	}
	
	
	
}
