package Academy;
import java.io.IOException;
import java.io.IOException;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import resources.Base;
public class validateLoginPage extends Base {
	 
	 @BeforeTest
	 public void initialize() throws IOException, InterruptedException
		{
		
			 driver =initializeDriver();
			 driver.get(prop.getProperty("url"));
			 LoginPage lp =new LoginPage(driver);
			 lp.getUsername().sendKeys("demo251999demo@gmail.com");
		     lp.getPassword().sendKeys("demo1234");
		     lp.getLogin().click();
		     
		     driver.close();
			 driver=null; 
		 
			 
				 
			 }
	 
	
		}