package com.myproject.Testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login2 {
         public static void main(String[] args) {
			
        	WebDriver driver=new ChromeDriver();
        	driver.get("https://tutorialsninja.com/demo/");
        	driver.manage().window().maximize();
        	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        	
        	driver.findElement(By.xpath("//span[text()='My Account']")).click();
        	
        	driver.findElement(By.xpath("//a[text()='Login']")).click();
        	

        	
        	driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("ajay4321@gmail.com");
        	driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("12345");
        	driver.findElement(By.xpath("//input[@value='Login']")).click();
        	
        	
        	
		}
}
