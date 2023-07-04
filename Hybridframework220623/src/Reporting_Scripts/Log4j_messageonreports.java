package Reporting_Scripts;

import java.io.IOException;

import org.apache.log4j.Appender;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.testng.annotations.Test;

public class Log4j_messageonreports 
{
@Test

public void test3() throws IOException

{
	
	Layout lay=new PatternLayout("%d %c %m %n");
	Appender app=new FileAppender(lay, "./Reports/l1.log");
	BasicConfigurator.configure();
	Logger log = Logger.getLogger(this.getClass().getName());
	log.error("error");
	log.fatal("fatal");
	log.info("info");
	
	}
}

