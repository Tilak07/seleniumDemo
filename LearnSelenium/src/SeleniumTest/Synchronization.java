package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization {
	
	
	

		public static void main(String[] args) 
		{

			System.setProperty("webdriver.chrome.driver", "E:\\jar files\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
			driver.findElement(By.id("txtUsername")).sendKeys("Admin");
			driver.findElement(By.id("txtPassword")).sendKeys("admin123");
			driver.findElement(By.name("Submit")).click ();
			WebDriverWait mywait=new WebDriverWait(driver,10); // explicit wait
			mywait.until(ExpectedCondition.visibilty
			driver.findElement(By.id("welcome")).click();
			WebDriver mywait1=(WebDriver) new WebDriverWait(driver,10);
			mywait.until(ExpectedCondition.visibilityoflocated(By.linkText("Logout")));
			
			//Select dropdown = new Select(driver.findElement(By.xpath("//a[@id='welcome']")));  
			//dropdown.selectByVisibleText("Logout"); 
			driver.findElement(By.linkText("Logout")).click();
		
			driver.findElement(By.xpath("//b[contains(text(),'Admin')]")).click();
		}

	}


}
