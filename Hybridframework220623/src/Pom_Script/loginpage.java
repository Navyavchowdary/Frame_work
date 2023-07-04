package Pom_Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic_Script.Base_page;

public class loginpage extends Base_page
{

		@FindBy(name="email")
		private WebElement unField;
		
		@FindBy(name="pass")
		private WebElement pwdField;
		
		@FindBy(name="login")
		private WebElement loginBtn;

		public loginpage(WebDriver driver)
		{
			super(driver);
		}
		
		public void passUN(String un)
		{
			unField.sendKeys(un);
		}
		public void passPwd(String pwd)
		{
			pwdField.sendKeys(pwd);
		}
		public void btn()
		{
			loginBtn.click();
		}
	 }
