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
import pageObjects.Remove;
import resources.Base;


public class validateRemove extends Base{
	 public static Logger log =LogManager.getLogger(Base.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{
	
		 driver =initializeDriver();
		
			
		driver.get(prop.getProperty("url"));
		 
	}
	@Test
	
	public void validateRemove() throws IOException, InterruptedException
	{
		
		//one is inheritance
		// creating object to that class and invoke methods of it
		Remove ai=new Remove(driver);
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
		driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a")).click();
		ai.getRemove().click();
		Thread.sleep(5000);
		Assert.assertFalse(false);
		
		
		}
	@AfterTest
	public void teardown()
	{
		
		driver.close();
		driver=null;
		
	}

	

	
}

