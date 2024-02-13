package PomScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends BasePage {
public RegisterPage	(WebDriver driver) {
	//PageFactory.initElements(driver,this);
		super(driver);
	}
	
@FindBy(id = "gender-female")
	private WebElement genderbutton;

@FindBy(id  = "FirstName")
private WebElement firsttext;

@FindBy(id = "LastName")
private WebElement lastname;

@FindBy(id = "Email")
private WebElement emailtext;
@FindBy(id = "Password")
private WebElement password;
@FindBy(id = "ConfirmPassword")
private WebElement confirmpassword;
public WebElement getGenderbutton() {
	return genderbutton;
}
public WebElement getFirsttext() {
	return firsttext;
}
public WebElement getLastname() {
	return lastname;
}
public WebElement getEmailtext() {
	return emailtext;
}
public WebElement getPassword() {
	return password;
}
public WebElement getConfirmpassword() {
	return confirmpassword;
}
//Business logic
public void registerFunction() {
	genderbutton.click();
	firsttext.sendKeys("sindhu");
	lastname.sendKeys("balu");
    emailtext.sendKeys("sindhu176@gmail.com");
    password.sendKeys("balu123");
    confirmpassword.sendKeys("balu123");
	
}

}
