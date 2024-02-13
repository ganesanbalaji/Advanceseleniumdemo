package PomScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DigitalDownloadsPage extends BasePage {
	public DigitalDownloadsPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(partialLinkText = "Digital downloads")
	private WebElement Digitaldownloadslink;
	@FindBy(xpath  ="//a[text()='3rd Album']/../../..//input[@value='Add to cart']")
	private WebElement albumonelink;
	@FindBy(xpath  ="//a[text()='Music 2']/../..//input[@value='Add to cart']")
	private WebElement albumtwolink;
	@FindBy(xpath = "//a[text()='Music 2']/../..//input[@value='Add to cart']")
	private WebElement albumthreelink;
	public WebElement getDigitaldownloadslink() {
		return Digitaldownloadslink;
	}
	public WebElement getAlbumonelink() {
		return albumonelink;
	}
	public WebElement getAlbumtwolink() {
		return albumtwolink;
	}
	public WebElement getAlbumthreelink() {
		return albumthreelink;
	}

}
