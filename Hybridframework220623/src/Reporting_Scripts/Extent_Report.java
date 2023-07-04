package Reporting_Scripts;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Extent_Report
{
@Test

public void test1()

{
ExtentReports rep = new ExtentReports("./Reports/r.html",false);
ExtentTest t1 = rep.startTest("TC1");
t1.log(LogStatus.PASS, "passed tc");
t1.log(LogStatus.FAIL, "passed tc");
t1.log(LogStatus.SKIP, "passed tc");

rep.endTest(t1);
rep.flush();

}
}
