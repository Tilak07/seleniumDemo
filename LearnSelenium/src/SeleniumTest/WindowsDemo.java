package SeleniumTest;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsDemo {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", "E:\\jar files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.findElement(By.xpath("//a[contains(text(),'Open New Tabbed Windows')]")).click();
		driver.findElement(By.xpath("//div[@id='Tabbed']//button[@class='btn btn-info'][contains(text(),'click')]")).click();

		Set<String> windowIds= driver.getWindowHandles();
		Iterator<String> iter= windowIds.iterator();
		 //System.out.println(iter);
		String mainWindow= iter.next();
		String childWindow= iter.next();
		Thread.sleep(1000);
		driver.switchTo().window(childWindow);
		Thread.sleep(1000);
		driver.close();
		driver.switchTo().window(mainWindow);
		
		
		//driver.findElement(By.xpath("//a[contains(text(),'Open New Seperate Windows')]")).click();
		//driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		//email:bhavanakinhekar@gmail.com
		
		
	}

}
