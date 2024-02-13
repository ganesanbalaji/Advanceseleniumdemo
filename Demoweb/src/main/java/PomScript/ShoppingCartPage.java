package PomScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BasePage {
	public ShoppingCartPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "termsofservice")
	private WebElement termsofservicebox;
	
	@FindBy(id ="checkout")
	private WebElement checkoutbox;

	public WebElement getTermsofservicebox() {
		return termsofservicebox;
	}

	public WebElement getCheckoutbox() {
		return checkoutbox;
	}

	
	
	

}
