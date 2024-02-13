package PomScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver){
	//PageFactory.initElements(driver,this);
		super(driver);
	}

	//@FindBy(id="Email") 
@FindAll({@FindBy(id="Email"),@FindBy(id="Email")})
	private WebElement emailtextfield;

	
	@FindBy(id="Password")
	private WebElement passwordtextfield;
	
	@FindBy(xpath ="//input[@value='Log in']")
	private WebElement loginbutton;

	public WebElement getEmailtextfield() {
		return emailtextfield;
	}

	public WebElement getPasswordtextfield() {
		return passwordtextfield;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}
	//Business logic
	public void loginFunction() {
		emailtextfield.sendKeys("sindhu176@gmail.com");
		passwordtextfield.sendKeys("balu123");
		loginbutton.click();
	}
	
	
}


