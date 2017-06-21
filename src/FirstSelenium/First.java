package FirstSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;



public class First {

	 static WebDriver driver;//define
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("hii");
		
		
		First ref=new First();
		ref.setup();
		
		Login_Class ref3= new Login_Class(driver);
		ref3.login();
		
        Gmail_Class ref4= new Gmail_Class(driver);
        ref4.run();
		
		ref.teardown();
	
		
		
		//Second ref1=new Second();
		//ref1.name();
		
		
		
	}  
	
	
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","Resource/chromedriver.exe");
				System.setProperty("webdriver.gecko.driver","Resource/geckodriver.exe" );
				//System.setProperty("webdriver.ie.driver","Resource/IEDriverServer.exe" );
			 driver=new ChromeDriver();
				//WebDriver driver=new InternetExplorerDriver();
				//driver=new FirefoxDriver();//initi
				driver.get("https://www.facebook.com/");

				
				
				//driver.get("https://www.youtube.com/");
				driver.manage().window().maximize();
				
				//Thread.sleep(5000);
				
			
	}
	public void teardown()
	{
		//driver.quit();
		driver.close();

		
}
	
}