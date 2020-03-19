package SeleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest
{

	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chorome.driver", "E:\\jar files\\chromedriver_win32\\chromedriver.exe");	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://demowebshop.tricentis.com/login");
	}

}
