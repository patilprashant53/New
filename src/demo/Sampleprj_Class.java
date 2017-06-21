package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sampleprj_Class
{
 static WebDriver driver;
	
	public void setup() 
	
	{
		System.setProperty("webdriver.chrome.driver","Resource/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://dev.tracko.co.in/");
		driver.manage().window().maximize();
	
		
	}
	
	
	public static void main(String[] args) 
	{
		
		Sampleprj_Class ref=new Sampleprj_Class();
		ref.setup();
		
		Sign_Class ref1=new Sign_Class(driver);
		ref1.start();
		
		LogIn ref2 =new LogIn(driver);
		ref2.run();
		
		Download_Class ref3 =new Download_Class(driver);
		ref3.down();
		
		Link_Class ref4=new Link_Class(driver);
		ref4.pic();
		
		Products_Class ref5=new Products_Class(driver);
		ref5.pro();
		
		
	}

}
