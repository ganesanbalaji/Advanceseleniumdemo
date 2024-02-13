package PomScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOut extends BasePage {
	public CheckOut(WebDriver driver) {
		super(driver);
	}

@FindBy(id  = "FirstName")
private WebElement firsttext;

@FindBy(id = "LastName")
private WebElement lastname;

@FindBy(id = "Email")
private WebElement emailtext;

@FindBy(id = "BillingNewAddress_Company")
private WebElement companytext;

@FindBy(id = "BillingNewAddress_CountryId")
private WebElement countryDropdown;

@FindBy(id = "BillingNewAddress_StateProvinceId")
private WebElement Provincedropdown;

@FindBy(id = "BillingNewAddress_City")
private WebElement citytext;
@FindBy(id = "BillingNewAddress_Address1")
private WebElement addressonetext;
@FindBy(id = "BillingNewAddress_Address2")
private WebElement addresstwotext;
@FindBy(id = "BillingNewAddress_ZipPostalCode")
private WebElement postalcodetext;
@FindBy(id = "BillingNewAddress_PhoneNumber")
private WebElement phonenumbertext;
@FindBy(name = "BillingNewAddress.FaxNumber")
private WebElement faxnumbertext;
@FindBy(xpath = "//input[@value='Continue']")
private WebElement continuebutton;


public WebElement getFirsttext() {
	return firsttext;
}
public WebElement getLastname() {
	return lastname;
}
public WebElement getEmailtext() {
	return emailtext;
}
public WebElement getCompanytext() {
	return companytext;
}
public WebElement getCountryDropdown() {
	return countryDropdown;
}
public WebElement getProvincedropdown() {
	return Provincedropdown;
}
public WebElement getCitytext() {
	return citytext;
}
public WebElement getAddressonetext() {
	return addressonetext;
}
public WebElement getAddresstwotext() {
	return addresstwotext;
}
public WebElement getPostalcodetext() {
	return postalcodetext;
}
public WebElement getPhonenumbertext() {
	return phonenumbertext;
}
public WebElement getFaxnumbertext() {
	return faxnumbertext;
}
public WebElement getContinuebutton() {
	return continuebutton;
}



	

}
