package genericsUtils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import actitime.PomClass.HomePage;
import actitime.PomClass.LoginPage;

public class BaseClass {

	// Generic util class Object creation 
	public WebDriver driver;
	public WebDriverUtility wUtil=new WebDriverUtility();
	public FileUtility fUtil=new FileUtility();
	public ExcelUtility EUtil=new ExcelUtility();
	//public static WebDriver staticdriver;

	@BeforeSuite() 
	public void configBS(){
		//connect to DB
	}

	@BeforeTest()
	public void configBT() {
		//launch browser in parallel mode
	}
	@BeforeClass()
	public void configBC( ) throws Throwable {

		String browserName=fUtil.getPropertyFileData("browser");

		if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver=new ChromeDriver();
		}
		//staticdriver=driver;
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@BeforeMethod()
	public void setUp() throws Throwable {
		//get the common data from property file

		String URL=fUtil.getPropertyFileData("url");
		String Username=fUtil.getPropertyFileData("username");
		String Password=fUtil.getPropertyFileData("password");

		//Step 1 : Application login
		driver.get(URL);
		LoginPage loginpage=new LoginPage(driver);
		loginpage.loginToDemo(Username, Password);
	}
	@AfterMethod()
	public void tearDown() throws Throwable {
		//signout from application
		HomePage homepage=new HomePage(driver);
		homepage.logoutactiTime();

	}

	@AfterClass()
	public void configAC() {
		driver.quit();
	}

	@AfterTest()
	public void configAT() {
		//close driver reference in parallel mode
	}

	@AfterSuite()
	public void configAS() {
		// close DB connection
	}


}


