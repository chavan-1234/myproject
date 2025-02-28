package com.myproject.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Basepage {
	
	
	
    public	   LoginPage (WebDriver driver){
		super(driver);
		
	  }
	   
	   
	     //locator
	   @FindBy(xpath = "//input[@id='input-email']")    
	   WebElement emailfield;
	   
	   @FindBy (xpath = "//input[@id='input-password']")     
	   WebElement pwdfield;
	   
	   @FindBy(xpath = "//input[@value='Login']")
	   WebElement loginButton;
	   
	   
	    //action methods
	   
	   public void enterEmail(String email) {
		   emailfield.clear();
		   
		   emailfield.sendKeys(email);
		  // elementutils.enterdatainField(emailfield, email);
		   
	   }
	   
	   public void enterpassword(String pwd) {
		   pwdfield.clear();
		   
		   pwdfield.sendKeys(pwd);
		  // elementutils.enterdatainField(emailfield, pwd);
	   }
	   
	   public void clickLoginButton() {
		   loginButton.click();
		   
		 //  elementutils.clickOnElement(loginButton);
	   }
	   
	   
	   
	   
	   
}
