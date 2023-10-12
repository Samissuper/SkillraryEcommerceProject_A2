package genericLibraries;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilities {
	
	//Handling Dropdowns
	public void dropDowns(WebElement ele, String text) {
		Select s= new Select(ele);
		s.selectByVisibleText(text);
	
	}
	
	//2. RightClick
	public void RightClick(WebDriver driver, WebElement ele) {
		Actions a= new Actions(driver);
		a.contextClick(ele).perform();
	}
	
	//3. DoubleClick
	public void DoubleClick(WebDriver driver, WebElement ele) {
		Actions a= new Actions(driver);
		a.contextClick(ele).perform();
	}
	
	//4. MouseOver
	public void MouseOvering(WebDriver driver, WebElement ele) {
		Actions a= new Actions(driver);
		a.moveToElement(ele).perform();
	}
	
	//5. DragAndDrop
	public void DragAndDroping(WebDriver driver, WebElement ele, WebElement ele1) {
		Actions a= new Actions(driver);
		a.dragAndDrop(ele, ele1).perform();
	}
	
	//6. AlterPopUp
	public void alterPopup(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	
	//7. HandlingChildBrowser
	public void childBrowser(WebDriver driver) {
		Set<String>child= driver.getWindowHandles();
		for(String b : child) {
			driver.switchTo().window(b);
		}
	}
			
		//8. scrolling using get location
		public void scrollBar(WebDriver driver, int x, int y) {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(" + x + "," + y + ")");
	
	}
		//9. Scrolling with webElement
		public void scrollBar(WebDriver driver, WebElement ele) {
			JavascriptExecutor js= (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoview()", ele);
		}
		
		//10. for click using javascript executor
		public void clicking(WebDriver driver, WebElement ele) {
			JavascriptExecutor jse= (JavascriptExecutor) driver;
			jse.executeScript("window.click()", ele);
		}
}
