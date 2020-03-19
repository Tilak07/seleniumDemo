package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckmethodDemo {

	public static void main(String[] args) // donwload 
	{
		System.setProperty("webdriver.gecko.driver", "E:\\jar files\\geckodriver-v0.26.0-win32\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		//driver.manage().window().fullscreen();
		
		driver.get("http://demowebshop.tricentis.com/login"); // to get url from broswer
	    boolean checkpresence=driver.findElement(By.id("Email")).isDisplayed();
	    System.out.println(checkpresence);
	    
	    boolean checkenable=driver.findElement(By.id("Email")).isEnabled();
	    System.out.println(checkenable);
	    
	    if(checkpresence==true && checkenable==true)
	    {
	    	driver.findElement(By.id("Email")).sendKeys("tilakseegu12@gmail.com");
	    }
	}

}
