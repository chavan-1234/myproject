package com.myproject.Utilities;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Elementutils {
	WebDriver driver;
	
	  public Elementutils(WebDriver driver){
		this.driver=driver;
	}
	
	public void clickOnElement( WebElement element){
		if(iselementdisplayed(element) && iselementEnabled(element)) {
			element.click();
		}
		
		
		
	}
	
	public boolean iselementdisplayed(WebElement element) {
		
		  boolean b=false;
		  
		  try {
			b = element.isDisplayed();
			  
		  }
		  catch (NoSuchElementException e) {
			  b=false;
			 }
		  return b;
	}
	
	public boolean iselementEnabled(WebElement element) {
		boolean b=false;
		try {
			b   =element.isEnabled();
			
		}
		catch (NoSuchElementException e) {
			b=false;
			
		}
		return b;
		
	}
	
	public void enterdatainField(WebElement element ,String data) {
		if(iselementdisplayed(element ) && iselementEnabled(element)) {
			  element.clear();
			element.sendKeys(data);
		}
	}
	
	
	   //select class method
	    public void   elementselectByvisibletext(WebElement element , String text) {
	    	Select sel=new Select(element);
	    	sel.selectByVisibleText(text);
	    }
	
	    public void elementselectByindex(WebElement element, int index) {
	    	Select sel=new Select(element);
	    	sel.selectByIndex(index);
	    	
	    }
	
	    public int elementgetalloption(WebElement element) {
	    	Select sel=new Select(element);
	    	   List<WebElement> options = sel.getOptions();
	    	     int size = options.size();
	    	   for(   WebElement op  :options) {
	    		System.out.println(op.getText());
	    		   
	    	   }
	    	   return size;
	    	   
	    	
	    }
	    
	    //mouse action methods
	    public void doubleclickonelement(WebElement element) {
	    	Actions act=new Actions(driver);
	    	act.doubleClick(element);
	    	
	    }
	
	    public void rightclickonelement(WebElement element) {
	    	Actions act=new Actions(driver);
	    	act.contextClick(element);
	    	
	    }
	    
	    public void mousehoveronelement(WebElement element) {
	    	Actions act=new Actions(driver);
	    	act.moveToElement(element);
	    	
	    }
	
	
	
	
	
	

}//class
