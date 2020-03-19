package SeleniumTest;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment 
{

	@SuppressWarnings("deprecation")
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\jar files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login"); // to get url from broswer
		String n=driver.getTitle();
		driver.getTitle();  
		System.out.println(n);
		System.out.println("the length is: "+n.length());
		String m=driver.getCurrentUrl();
		System.out.println(m);
		String x="http://demowebshop.tricentis.com/login";
/*		if(x.equals(m))
		{
			System.out.println("valid");
		}
		else
		{
			System.out.println("invalid");
		} */
		Assert.assertEquals(x, m);
		String str=driver.getPageSource();
		//System.out.println(str);
		System.out.println("the length is : " +str.length());
		driver.close();
		
	}

}
