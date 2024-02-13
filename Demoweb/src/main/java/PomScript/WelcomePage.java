package PomScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	
public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
@FindBy(linkText = "Register")
	private WebElement registerlink;

@FindBy(linkText = "Log in")
private WebElement loginlink;

@FindBy(linkText = "Shopping cart")
private WebElement shoppingcart;

@FindBy(linkText = "Wishlist")
private WebElement Wishlist;

@FindBy(linkText = "Log out")
private WebElement Logout;

public WebElement getRegisterlink() {
	return registerlink;
}

public WebElement getLoginlink() {
	return loginlink;
}

public WebElement getShoppingcart() {
	return shoppingcart;
}

public WebElement getWishlist() {
	return Wishlist;
}

public WebElement getLogout() {
	return Logout;
}


}
