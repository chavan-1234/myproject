package baseTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Time;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BaseTest {
	
public	 WebDriver driver;
	 Properties pro;
	
	 
	 
	@Parameters("browser")
	
 @BeforeTest
  public void setup(String br) throws IOException {
	   FileInputStream fis=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\myproject\\src\\test\\resources\\Config.properties");
	    pro=new Properties();
	    pro.load(fis);
	    
	  //  String br="chrome";
	  if(br.equals("chrome")) {
		  driver=new ChromeDriver();
	  }
		  else if (br.equals("firefox")) {
			  driver=new FirefoxDriver();
			 
      }
		  else if (br.equals("edge")) {
			  driver=new EdgeDriver();
			  
		  }
			
	  
	  
	    driver.get("https://tutorialsninja.com/demo/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    
	    
		}
	  
	  
	           public void screenshot() {
	        	   TakesScreenshot ts=(TakesScreenshot)driver;
	        	 File  source     = ts.getScreenshotAs(OutputType.FILE);
	        	 
	        	   
	           }
	           
	           public String getappurl(WebDriver driver) {
	        	   return   driver.getCurrentUrl();
	        	   
	           }
	           
	           public String getpagetitle(WebDriver driver) {
	        	    return   driver.getTitle();
	        	   
	        	   
	           }
	           
	           
//	           @AfterTest
//	           public void teardown () {
//	        	  driver.quit();
//	        	  
//	           }
	  
	  
	  
}
