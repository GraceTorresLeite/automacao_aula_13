package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Framework.Waits;

public class MenuFormPage {

	private WebDriver driver;
	
	private Waits waits;

	public MenuFormPage(WebDriver driver) {
		this.driver = driver;
		this.waits = new Waits(this.driver);
	}
	
	public WebElement getFormLink() {
		return waits.visibilityOfElement(By.xpath("//[div@class='col s3]ul@class=collapseble collapsble-accordion]/li/a[@class=collapsible-header]"));
	}
	
	public WebElement validPageForm() {
		return waits.visibilityOfElement(By.xpath(""));
	}
		
		public WebElement getTextTitle() {
			return this.driver.findElement(By.xpath("//div[@class='col s3]/h4"));
		}
	
		public WebElement getCreateUserLink() {
			return waits.visibilityOfElement(By.xpath(""));
		}
	
}
