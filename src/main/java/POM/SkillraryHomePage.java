package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryHomePage {
	//Declaration
	//address of gears
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearbtn;
	
	//address of skillrary demo
	@FindBy(xpath="//a[text()=' SkillRary Demo APP']")
	private WebElement skillrarydemoapp;
	
	//address of search text field
	@FindBy(xpath="//input[@name='q']")
	private WebElement searchTf;
	
	//address of search icon
	@FindBy(xpath="//input[@value='go']")
	private WebElement searchIcon;
	
	//address of cookie cross icon
	@FindBy(xpath="//a[@class='close_cookies']")
	private WebElement cookies;
	
	//initialization
	public SkillraryHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Utilization

	public void getGearbutton() {
		gearbtn.click();
	}

	public void Skillrarydemoapplink() {
		skillrarydemoapp.click();;
	}

	public void SearchTextfield() {
		searchTf.sendKeys(null);
	}

	public void searchIcon() {
		searchIcon.click();
	}

	public void cookiesIcon() {
		cookies.click();
	}
	

}
