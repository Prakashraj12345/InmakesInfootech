package org.link;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinkedPojo extends BaseClass {
	public LinkedPojo() {
		PageFactory.initElements(driver, this);
	}
   
	
@FindBy(id="session_key")
private WebElement email;
@FindBy(xpath = "//input[@autocomplete='current-password']")
private WebElement password;
public WebElement getEmail() {
	return email;
}
public WebElement getPassword() {
	return password;
}


}
