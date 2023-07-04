package Runner_Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelExceution 
{
public WebDriver driver;
@Test
@Parameters({"browsers"})
public void exce (String browser) 

{
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	if(browser.equals("firefox"))
	{
		driver=new FirefoxDriver();
		driver.get("https://www.google.com");
	}
	else 
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}



}
	
}
