package SeleniumTest;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import javax.print.attribute.standard.Fidelity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class Robotfiledemo
{
	WebDriver driver;
	public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "E:\\jar files\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://smallpdf.com/word-to-pdf");
        driver.manage().window().maximize();
        
        Robot robot=new Robot();
        
        driver.findElement(By.xpath("//span[@class='sc-1rkezdt-7 cxlSWI']")).click();
        robot.setAutoDelay(3000);
        
        StringSelection stringselect=new StringSelection("E:\\tilak backup\\tilak ibm\\tilak.docx");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselect, null);
      
        
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        
//from SCM faculty to All Participants:
robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        //robot.setAutoDelay(1000);
        
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        
    }
}
