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
	
	public WebElement getFormLink(){

        return waits.visibilityOfElement(By.xpath("//div[@class='col s3']/ul[@class='collapsible collapsible-accordion']/li/a[@class='collapsible-header ']"));

    }

    public WebElement getCreateUserLink(){

       return waits.visibilityOfElement(By.xpath("//div[@class='col s3']/ul[@class='collapsible collapsible-accordion']/li[@class='bold active']/div[@class='collapsible-body']/ul/li/a[@href='/users/new']"));
    }

    public WebElement getTextTitle(){

        return this.driver.findElement(By.xpath("//div[@class='col s3']/h4"));
    }

    public WebElement getTextFormUserTitle(){

        return this.driver.findElement(By.xpath("//div[@class='col s9']/div[@class='row']/div[@class='tamanhodiv2']/h5"));
    }
	
}
