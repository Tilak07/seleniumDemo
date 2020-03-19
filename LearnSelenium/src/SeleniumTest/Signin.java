package SeleniumTest;
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																			
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Signin 
{

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\jar files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().fullscreen();
		
		driver.get("http://demowebshop.tricentis.com/login"); // to get url from broswer
		
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click ();
		driver.findElement(By.className("ico-logout")).click();
		//driver.findElement(By.linkText("Log out")).click();
		
		//String ExpectedResult="Demo Web Shop"; // verify the title
		//String ActualResult=driver.getTitle();
		//System.out.println(ActualResult);
		
		//if(ExpectedResult.equals(ActualResult))
		//{
	//		System.out.println("valid");
	//	}
		//else
	//	{
		//	System.out.println("invalid");
	//	}
		//driver.close();
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).getAttribute("")
	} 

}
