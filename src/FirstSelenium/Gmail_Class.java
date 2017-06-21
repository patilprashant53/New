package FirstSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Gmail_Class{


WebDriver driver;

public Gmail_Class(WebDriver driver)
{
	this.driver=driver;
}


 
	public void run()
	
	{
		driver.findElement(By.xpath("//input[@type='text'][@name='firstname']")).sendKeys("prashant");
		driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("patil");
	} 
}
