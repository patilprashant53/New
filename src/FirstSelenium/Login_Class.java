package FirstSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login_Class {
	
	WebDriver driver;//...initilize.....
	public Login_Class(WebDriver driver2)//....constructor call..
	{
		driver=driver2;//......actual call means driver 
	}

	public void login()
	{
		//driver.get("https://www.facebook.com/");
		//driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div/div[2]/form/table/tbody/tr[2]/td/input")).sendKeys("ppppppp");
		//driver.findElement(By.id("pass")).sendKeys("9423791362");
		//driver.findElement(By.id("u_0_q")).click();
		driver.findElement(By.className("inputtext")).sendKeys("pppppp");
		//driver.findElement(By.)
	}

}
