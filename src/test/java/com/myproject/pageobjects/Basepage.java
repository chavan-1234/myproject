package com.myproject.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.myproject.Utilities.Elementutils;

public class Basepage {
       
	
	public WebDriver driver;
	//Elementutils elementutils;
	
	    Basepage(WebDriver driver){
	    	this.driver=driver;
	   // elementutils=new Elementutils(driver);
	    	
	    	PageFactory.initElements(driver, this);
	    }
	
	
}
