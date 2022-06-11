package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Remove {
	
	public WebDriver driver;
	
	By username=By.xpath("//*[@id=\"email\"]");
	By password=By.xpath("//*[@id=\"passwd\"]");
	By login=By.xpath("//*[@id=\"SubmitLogin\"]/span");
	By additem=By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[1]/div/a[1]/img");
	By addtocart=By.xpath("//*[@id=\"add_to_cart\"]/button/span");
    By remove=By.xpath("//*[@id=\"1_1_0_687068\"]/i");
	
	public Remove(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement getUsername()
	{
		return driver.findElement(username);
	}
	
	public WebElement getPassword()
	{
		return driver.findElement(password);
	}
	
	public WebElement getLogin()
	{
		return driver.findElement(login);
	}
	
	public WebElement getAddItem()
	{
		return driver.findElement(additem);
	}
	public WebElement getAddToCart()
	{
		return driver.findElement(addtocart);
	}
	
	public WebElement getRemove()
	{
		return driver.findElement(remove);
	}

}
