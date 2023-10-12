package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InvoicePage {
	//Declaration
	//address of Invoice Web element
	@FindBy(xpath="//input[@name='downInvoice']")
	private WebElement InvoiceBtn;
	
	//initilization
	public InvoicePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void InvoiceButton() {
		InvoiceBtn.click();
	}

}
