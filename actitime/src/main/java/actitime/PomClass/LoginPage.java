package actitime.PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);	
}
	
	//element identification
	@FindBy(id="username")
	private WebElement usernameTextField;

	@FindBy(name="pwd")
    private WebElement passwordTextField;
    
    @FindBy(xpath="//div[text()='Login ']")
    private WebElement loginButton;
    
    @FindBy(xpath="//a[text()='Forgot your password?']")
    private WebElement forgotYourPasswordLink;
    
    //getters methods
    public WebElement getUsernameTextField() {
		return usernameTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getForgotYourPasswordLink() {
		return forgotYourPasswordLink;
	}
	/**
	 * This method is used to login to actiTime application
	 * @param username
	 * @param password
	 */
	public void loginToDemo(String username,String password) {
		usernameTextField.sendKeys(username);
		passwordTextField.sendKeys(password);
		loginButton.click();
	}
}



