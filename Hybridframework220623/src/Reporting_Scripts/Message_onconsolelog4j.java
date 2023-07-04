package Reporting_Scripts;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class Message_onconsolelog4j 
{
@Test

public void test2()

{
	BasicConfigurator.configure();
	Logger log = Logger.getLogger(this.getClass().getName());
	log.error("error");
	log.fatal("fatal");
	log.info("info");
	
	}

}
