package SeleniumTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkDemo 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "E:\\jar files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/?ext_vrnc=hi&tag=abkexpt1-21&ascsubtag=_k_Cj0KCQiAtOjyBRC0ARIsAIpJyGMFG7CwA9K4FeTWckqQUU_ym4NB6pncRbCFfa02HjHGuVxrtTvF1KMaAqcvEALw_wcB_k_&ext_vrnc=hi&gclid=Cj0KCQiAtOjyBRC0ARIsAIpJyGMFG7CwA9K4FeTWckqQUU_ym4NB6pncRbCFfa02HjHGuVxrtTvF1KMaAqcvEALw_wcB");
		List<WebElement>links=driver.findElements(By.tagName("h1"));
		System.out.println("no of links are: " +links.size());
		for(int i=0;i<links.size();i++)
		{
			System.out.println("link names are : "+links.get(i).getText());
		}
	}

}
