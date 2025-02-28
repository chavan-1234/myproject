package com.myproject.Testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.myproject.Utilities.Dataprovider;
import com.myproject.pageobjects.Homepage;
import com.myproject.pageobjects.LoginPage;
import com.myproject.pageobjects.MyaccountPage;

import baseTest.BaseTest;

public class LoginTest extends BaseTest {
	Homepage hp;
	LoginPage lp;
	 MyaccountPage myacc;
	
      @Test  (dataProvider = "logindata" , dataProviderClass = Dataprovider.class)//dataProvider = "logindata" , dataProviderClass = Dataprovider.class
    public void logintest(String email, String pwd, String exp) {  //String email, String pwd, String exp
	   
        hp=new  Homepage(driver);
        hp.clickmyacc();
	    hp.clickLoginheadreButton();
	    lp=new  LoginPage (driver);
	    lp.enterEmail(email);
	    lp.enterpassword(pwd);
	    lp.clickLoginButton();
	    
	       myacc=new  MyaccountPage(driver);
	       boolean targetpage = myacc.ismyAccpageexist();
	      
	       Assert.assertTrue(targetpage);
	       
	    //valid       login succes         pass    logout
	 	   //valid      login unsuccces       failed
		  //invalid      login  success       failed   logout
		   //invalid     t.unsuccces       pass      
	     if(exp.equalsIgnoreCase("valid")) {
	    	 if(targetpage==true) {
	    		 myacc.clicklogoutbutton();
	    		 Assert.assertTrue(true);
	    	 }
	    	 else {
				Assert.assertTrue(false);
			}
	    	 
	     }
	  
	       if(exp.equalsIgnoreCase("invalid")) {
	    	   
	    	   if(targetpage==true) {
	    		   myacc.clicklogoutbutton();
		    		 Assert.assertTrue(false);
	    		   
	    	   }
	    	   else {
				Assert.assertTrue(true);
			}
	    	   
	       }
	  
  }
}
