package Academy;

import java.io.IOException;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.AddItem;
import pageObjects.Checkout;
import pageObjects.LoginPage;
import resources.Base;


public class validateLoginPage extends Base{
	 public static Logger log =LogManager.getLogger(Base.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{
	
		 driver =initializeDriver();
		
			
		driver.get(prop.getProperty("url"));
		 
	}
	@Test
	
	public void validateLoginPage() throws IOException, InterruptedException
	{
		
		//one is inheritance
		// creating object to that class and invoke methods of it
		Checkout ai=new Checkout(driver);
		ai.getUsername().sendKeys("demo251999demo@gmail.com");
		ai.getPassword().sendKeys("demo1234");
		ai.getLogin().click();
		((JavascriptExecutor)driver).executeScript("scroll(0,400)");
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/a")).click();
		Thread.sleep(2000);
		ai.getAddItem().click();
		((JavascriptExecutor)driver).executeScript("scroll(0,400)");
		Thread.sleep(2000);
		ai.getAddToCart().click();
		((JavascriptExecutor)driver).executeScript("scroll(0,400)");
		Thread.sleep(2000);
		ai.getCheckout().click();
		Thread.sleep(2000);
		Assert.assertFalse(false);
		
		
		}
	@AfterTest
	public void teardown()
	{
		
		driver.close();
		driver=null;
		
	}

	

	
}
