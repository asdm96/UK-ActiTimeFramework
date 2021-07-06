package actitime.PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TimeTrackPage {
	WebDriver driver;
	public TimeTrackPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	@FindBy(xpath="//td[text()='Enter Time-Track']")
	private WebElement timeTrackPageTitle;
	
    //getters method
	public WebElement getTimeTrackPageTitle() {
		return timeTrackPageTitle;
	}
	
	//business logic
	public String getTitleofTimeTrackPage() {
		 String text = driver.getTitle();
		return text;
	}
	
	

}
