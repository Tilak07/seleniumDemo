package SeleniumTest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo
{
	public static void main(String[] args) throws InterruptedException 
	{
	
			System.setProperty("webdriver.chrome.driver", "E:\\jar files\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
		
			driver.get("http://demo.automationtesting.in/Alerts.html");
			driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
			Alert alert1=driver.switchTo().alert();
			String alertmsg=driver.switchTo().alert().getText();
			System.out.println(alertmsg);
			Thread.sleep(3000);
			alert1.accept();
			
			driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel')]")).click();
			driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
			Alert alert2=driver.switchTo().alert();
			String alertmsg1=driver.switchTo().alert().getText();
			System.out.println(alertmsg1);
			alert2.dismiss(); 
			
			
			driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]")).click();
			driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
			Alert alert3=driver.switchTo().alert();
			alert3.sendKeys("yo yo");
			alert3.accept();
			
			
			
			//driver.close();
			
	}
}