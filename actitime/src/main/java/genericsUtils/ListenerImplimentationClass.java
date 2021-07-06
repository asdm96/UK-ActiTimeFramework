package genericsUtils;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.google.common.io.Files;

public class ListenerImplimentationClass extends BaseClass implements ITestListener {

	public void onTestFailure(ITestResult result) {
		String screenshotName=result.getMethod().getMethodName();
		EventFiringWebDriver fire = new EventFiringWebDriver(BaseClass.staticdriver);
	    File source=fire.getScreenshotAs(OutputType.FILE);
	    File dest=new File("./screenshot/"+screenshotName+".PNG");
		try {
			Files.copy(source, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	

	

}
