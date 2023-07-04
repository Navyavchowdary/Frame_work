package Runner_Script;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Property 
{
@Test

public void test1() throws FileNotFoundException, IOException
{
	Properties p=new Properties();
	p.load(new FileInputStream("./p.properties"));
	String u=p.getProperty("baseurl");
	System.out.println(u);
	
}
}
