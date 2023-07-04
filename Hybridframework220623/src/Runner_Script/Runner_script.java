package Runner_Script;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Generic_Script.Base_Test;
import Generic_Script.Generic_Ddt;
import Pom_Script.loginpage;

public class Runner_script extends Base_Test 
{
	@Test(dataProvider = "test1")
	public void test2(String un,String pwd) throws InterruptedException
	
	{
		loginpage p1=new loginpage(driver);
		//String passUN=Generic_Ddt.getData("Sheet2",0,0);
		//String passPwd=Generic_Ddt.getData("Sheet2",1,0);
		
		p1.passUN(un);
		p1.passPwd(pwd);
		Thread.sleep(2000);
		p1.btn();
		Assert.fail();
	}
	@DataProvider(name = "test1")
	public Object[][] createData1() {
	 return new Object[][] {
	   { "Navya", "1234" },
	   { "Moni", "4321"},
	 };
}
}

