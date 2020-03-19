package SeleniumTest;

import java.io.FileInputStream;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDriven 
{

	public static void main(String[] args)
	{ 
		System.setProperty("webdriver.chrome.driver", "E:\\jar files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com/login");
	
	}

}
