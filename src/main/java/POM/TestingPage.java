package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage {
	//Declaration
	//address of facebook web element
	@FindBy(xpath="(//i[@class='fa fa-facebook'])[2]")
	private WebElement fbIcon;
	
	//Initization
	public TestingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public void fbIconWebElement() {
		fbIcon.click();
	}

}
