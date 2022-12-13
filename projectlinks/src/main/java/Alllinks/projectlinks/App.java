package Alllinks.projectlinks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class App 
{
	
	public static WebDriver driver;
    public static void main( String[] args ) throws InterruptedException
    
    {
    	
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Zaghu\\eclipse-workspace\\Maven\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();  // opening browser	
    	
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
      
    }
}
