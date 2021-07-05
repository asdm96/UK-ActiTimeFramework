package actitime.PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(id="container_tt")
	private WebElement timeTractLink;

	@FindBy(id="container_tasks")
	private WebElement taskLink;
	
	@FindBy(id="container_reports")
	private WebElement reportLink;
	
	@FindBy(id="container_users")
	private WebElement usersLink;
	
	@FindBy(id="logoutLink")
	private WebElement logoutlink;
	
	//getters methods
	public WebElement getTimeTractLink() {
		return timeTractLink;
	}
	public WebElement getTaskLink() {
		return taskLink;
	}
	public WebElement getReportLink() {
		return reportLink;
	}
	public WebElement getUsersLink() {
		return usersLink;
	}
	public WebElement getLogoutlink() {
		return logoutlink;
	}
	/**
	 * This method used to logout from actiTime application
	 */
	public void logoutactiTime() {
		logoutlink.click();
	}
	
	

}
