package Listeners_Dataproviders300623;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Runnerscript_Listener 
{
@Test

public void test1()
{
	System.out.println("hello India");
}
@Test
public void test2()
{
	System.out.println("hello Gokarna");
	Assert.fail();
}
@Test(dependsOnMethods = "test2")
public void test3()
{
	System.out.println("hello Bangalore");
}
}
