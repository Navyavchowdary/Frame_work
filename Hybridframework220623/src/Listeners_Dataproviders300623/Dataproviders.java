package Listeners_Dataproviders300623;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataproviders 
{
@Test(dataProvider="test1")

public void validTest(String un, String pwd)
{
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys(un);
	driver.findElement(By.id("pass")).sendKeys(pwd);
	driver.findElement(By.name("login")).click();
	driver.close();

}
@DataProvider(name = "test1")
public Object[][] createData1() {
 return new Object[][] {
   { "Cedric", "admin" },
   { "Anne", "manager"},
 };
}


}
