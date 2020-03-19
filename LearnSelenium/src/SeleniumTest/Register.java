package SeleniumTest;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Register 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
			System.setProperty("webdriver.chrome.driver", "E:\\jar files\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
		
			driver.get("http://demo.automationtesting.in/Register.html");
			driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Tilak");
			driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Seegu");
			driver.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']")).sendKeys("ksdfugi , Electronic city, Bangaluru,Karnataka");
			driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-valid-email ng-invalid ng-invalid-required']")).sendKeys("tilak123@gmail.com");
			driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-invalid ng-invalid-required ng-valid-pattern']")).sendKeys("1234579867");
			
			driver.findElement(By.xpath("//input[@name='radiooptions' and @value='Male']")).click(); //male or female
			//driver.findElement(By.id("//input[@type='checkbox' and @value='Cricket' and @value='Movies']")).click(); // hobbies
			
			/*WebElement ele = driver.findElement(By.xpath("//div[@id='msdd']"));
			Select sel = new Select(ele);
			sel.selectByVisibleText("English");
			sel.selectByVisibleText("Arabic");
			Thread.sleep(3000);	*/
			
			driver.findElement(By.xpath("//div[@id='msdd']")).click();
			driver.findElement(By.xpath("//a[contains(text(),'Arabic')]")).click();
			
			Select dropdown = new Select(driver.findElement(By.id("Skills")));  
			dropdown.selectByVisibleText("C");  
			Select dropdown1 = new Select(driver.findElement(By.id("countries")));  
			dropdown1.selectByVisibleText("India");  
			
			WebElement year1=driver.findElement(By.id("yearbox"));
			Select s = new Select(year1);
			s.selectByIndex(85);
			
			List<WebElement> yearcount=s.getOptions();
			System.out.println(yearcount.size());
			for(int i=0;i<yearcount.size();i++)
			{
				System.out.println(yearcount.get(i).getText());
			}
					
			WebElement month=driver.findElement(By.xpath("//select[@placeholder='Month']"));
			Select s1 = new Select(month);
			s1.selectByIndex(8);
			
			List<WebElement> monthcount=s1.getOptions();
			System.out.println(monthcount.size());
			for(int i=0;i<monthcount.size();i++)
			{
				System.out.println(monthcount.get(i).getText());
			}
			WebElement day=driver.findElement(By.xpath("//select[@id='daybox']"));
			Select s2 = new Select(day);
			s2.selectByValue("8");
			
			List<WebElement> daycount=s2.getOptions();
			System.out.println(daycount.size());
			for(int i=0;i<daycount.size();i++)
			{
				System.out.println(daycount.get(i).getText());
			}
			//Select s2 = new Select(driver.findElement(By.id("daybox")));
			//s2.selectByIndex(5);

			driver.findElement(By.id("firstpassword")).sendKeys("Tilak24");
			driver.findElement(By.id("secondpassword")).sendKeys("Tilak24");
			
			
			driver.findElement(By.id("submitbtn")).click();
			//driver.findElement(By.id("Button1")).click();
			
			
	}

}
