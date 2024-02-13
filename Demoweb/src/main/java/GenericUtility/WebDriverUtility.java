package GenericUtility;

import java.time.Duration;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
/**
 * 
 * @return
 */

public class WebDriverUtility {
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static Select s;
	public static Actions a;
	public static JavascriptExecutor js;
	public static Properties p;
	/**
	 * this is a parameterised method
	 * @param url
	 */
	/**
	 * this method is used to navigate to the appliction
	 * @return
	 */
	public static void getUrl(String url) {
		driver.get(url);
	}
	public static void maximize() {
		driver.manage().window().maximize();
	}
	public static void implicitwait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
	}
	/**
	 * this is used to get currenturl of the webpage
	 * @return
	 */
	public static String getCurrentUrl() {
	  return driver.getCurrentUrl();
	  
	}
	/**
	 * this is used to get currently executing webpage
	 * @return

	 */
		
	public static String getPageSource() {
		return driver.getPageSource();
	}
	/**
	 * this is used to gettitle of the webpage for validtion purpose	
	 * @return
	 */
	public static String getTitle() {
		return driver.getTitle();
		
	}
	/**
	 * used to close the webpage and won't close the window
	 */
	public static void close() {
		driver.close();
		
	}
	/**
	 * used to close the webpage and window
	 */
	public static void Quit() {
		driver.quit();
		
	}
	/**
	 * used to capture id of the webpage
	 * @return
	 */

	public static String currentWindow() {
		return driver.getWindowHandle();
	}
	/**
	 * used to capture both parrent as well as 
	 * @return
	 */
	public static Set<String> allWindow(){
		return driver.getWindowHandles();
		
	}
	/**
	 * used to navigate to the application
	 * @return
	 */
	public static  Navigation tonavigate(){
		return driver.navigate();
	}
	/**
	 * used to go back to previous page
	 */
	public static void backward() {
		driver.navigate().back();
	}
	/**
	 * used to go forward to previous page
	 */
	
	public static void forward() {
		driver.navigate().forward();
	}
	/**
	 * used to refresh the web page
	 */
	public static void refresh() {
		driver.navigate().refresh();
	}	
	/**
	 * used to enter into the web page
	 */
	public static void toStringUrl( String url) {
		driver.navigate().to(url);
	}
	/**
	 * used to give explicitly wait to the web element  
	 */
	public static void ExplicitWait(WebElement element) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	/**
	 * used to handle dropdown by choosing index
	 */
	public static void Dropdown(int i,WebElement element) {
		s= new Select(element);
		s.selectByIndex(i);
	}
	/**
	 * used to handle dropdown by choosing value
	 */
	public static void Dropdown1(String Value,WebElement element) {
		s= new Select(element);
		s.selectByValue(Value);
	}
	/**
	 * used to handle dropdown by choosing visibletext
	 */
	public static void Dropdown(String Visible,WebElement element) {
		s= new Select(element);
		s.selectByVisibleText(Visible);
	}
	/**
	 * used to move for the particular element
	 * @param element
	 */
	public static void moveElement(WebElement element) {
		a= new Actions(driver);
		a.moveToElement(element).perform();;
	}
	/**
	 * used to perform right click on the element
	 * @param element
	 */

	public static void context_click(WebElement element) {
		a= new Actions(driver);
		a.contextClick(element).perform();;
	}
	/**
	 * used to perform double click on the webelement
	 * @param element
	 */
	public static void double_click(WebElement element) {
		a= new Actions(driver);
		a.doubleClick(element).perform();;
	}
	/**
	 * used to perform drag and drop actions
	 * @param source
	 * @param destination
	 */
	public static void dragAndDrop(WebElement source,WebElement destination) {
		a= new Actions(driver);
        a.dragAndDrop(source, destination).perform();
	
	}
	/**
	 * used to perform click actions on the 
	 * @param element
	 */
	public static void click(WebElement element) {
		a= new Actions(driver);
		a.click(element).perform();;
	
	}
	/**
	 * used to perform click actions
	 */
	public static void toclick() {
		a= new Actions(driver);
		a.click().perform();;
	
	}
	
}
