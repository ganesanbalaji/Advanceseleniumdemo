package GenericUtility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class javaScriptUtility extends WebDriverUtility {
	/**
	 * used to scroll to the targeted web element
	 * @param x
	 * @param y
	 */
	public static void Scrollby(int x,int y) {
		js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
		
	}
	/**
	 * used to scroll anywhere in the web page
	 * @param x
	 * @param y
	 */
	public static void Scroll_To(int x, int y) {
		js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo("+x+","+y+")");
		
	}
	/**
	 * this method is usedto scroll until the method is visible
	 * @param b
	 * @param element
	 * @param index
	 */
	public static void scroll_into_View(Boolean b,WebElement element,int index) {
		js= (JavascriptExecutor) driver;
		js.executeScript("arguments("+index+").scrollintoview("+b+");,"+element+"");
		
	}
	/**
	 * it used to click on the disabled element
	 * @param element
	 */
	public static void Disabled_To_Click(WebElement element) {
		js= (JavascriptExecutor) driver;
		js.executeScript("arguments(0).click();,"+element+"");
		
	}

}
