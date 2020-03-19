package SeleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDemo
{

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.gecko.driver", "E:\\jar files\\geckodriver-v0.26.0-win32\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		//driver.manage().window().fullscreen();
		
		driver.navigate().to("http://demowebshop.tricentis.com/login");
	}

}
