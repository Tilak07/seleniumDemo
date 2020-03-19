package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\jar files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//driver.manage().window().fullscreen();
		
		driver.get("file:///E:/jar%20files/HTML/HTML.html");
		String toolname=driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]")).getText();
		
		System.out.println("the tool is  :" +toolname);
	}

}
