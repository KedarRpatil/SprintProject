package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
public WebDriver driver;
	
	By text=By.xpath("//*[@id=\"header_container\"]/div[2]/span");
			
	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}

	public WebElement gettext()
	{
		return driver.findElement(text);
	}
	


	
}


