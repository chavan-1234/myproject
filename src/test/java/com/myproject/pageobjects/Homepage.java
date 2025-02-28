package com.myproject.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends Basepage {
	          
	          
          public  Homepage(WebDriver driver) {
        	  super(driver);
        	  
          }
          
          @FindBy(xpath = "//span [normalize-space()='My Account']")
          WebElement myaccount;
//          @FindBy(xpath = "//span[text()='My Account']")
//          WebElement regbutton;
          @FindBy(xpath = "//a[text()='Login']")
          WebElement loginbutton;
          
          
          public void clickmyacc() {
        	 //elementutils.clickOnElement(myaccount);
        	  myaccount.click(); 
          }
          
          
//          public void clickonregisterbutton() {
//        	 // elementutils.clickOnElement(regbutton);
//        	  regbutton.click();
//          }
          
          public void clickLoginheadreButton() {
        	 // elementutils.clickOnElement(loginbutton); 
        	  loginbutton.click();
        	  
          }
          
	
	

}
