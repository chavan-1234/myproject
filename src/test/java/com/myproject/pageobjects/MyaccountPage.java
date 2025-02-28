package com.myproject.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyaccountPage extends Basepage {
	
	
	
	      public  MyaccountPage(WebDriver driver) {
	    	  super(driver);
	    	  
	      }
	      
	      @FindBy(xpath = "//div[@class='list-group']/descendant::a[text()='Logout']")
	      WebElement logoutbutton;
	      
	      @FindBy(xpath = "//h2[text()='My Account']")
	      WebElement myaccountHeading;
	      
	      
	      
	      public void clicklogoutbutton() {
	    	 // elementutils.clickOnElement(logoutbutton);
	    	  logoutbutton.click();
	      }
	      
	      public boolean ismyAccpageexist() {
	    	//return  elementutils.iselementdisplayed(myaccountHeading);
	    	return  myaccountHeading.isDisplayed();
	    	
	      }
	      

}
