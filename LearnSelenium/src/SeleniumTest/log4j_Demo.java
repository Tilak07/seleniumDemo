package SeleniumTest;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class log4j_Demo
{

	public static void main(String[] args)
	{
		Logger log=Logger.getLogger(log4j_Demo.class);
		System.setProperty("webdriver.chrome.driver", "E:\\jar files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");	
		log.info("URL Launched");
		
		String ExpectedResult="Google"; // verify the title
		String ActualResult=driver.getTitle();
		log.warn("check Title");
		
		//System.out.println(ActualResult);
				
		if(ExpectedResult.equals(ActualResult))
		{
				System.out.println("valid");
				log.info("the URL is correct");
		}
		else
			
		{
			System.out.println("invalid");
			log.error("the URl is not corret");
			}
		}

}
