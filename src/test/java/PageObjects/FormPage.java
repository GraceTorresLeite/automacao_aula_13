package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Framework.Waits;

public class FormPage {
	
	 private WebDriver driver;
	    private Waits waits;

	    public FormPage(WebDriver driver) {
	        this.driver = driver;
	        waits = new Waits(this.driver);
	    }

	    public WebElement getNameTextField(){

	        return this.driver.findElement(By.id("user_name"));
	    }

	    public WebElement getLastNameTextField(){

	        return this.driver.findElement(By.id("user_lastname"));
	    }

	    public WebElement getEmailTextField(){

	        return this.driver.findElement(By.id("user_email"));
	    }

	    public WebElement getAddressTextField(){

	        return this.driver.findElement(By.id("user_address"));
	    }

	    public WebElement getUniversityTextField(){

	        return this.driver.findElement(By.id("user_university"));
	    }

	    public WebElement getProfissionTextField(){

	        return this.driver.findElement(By.id("user_profile"));
	    }

	    public WebElement getGenreTextField(){

	        return this.driver.findElement(By.id("user_gender"));
	    }

	    public WebElement getAgeTextField(){

	        return this.driver.findElement(By.id("user_age"));
	    }

	    public WebElement getSendButton(){

	        return this.driver.findElement(By.name("commit"));
	    }

	    public WebElement getMessageTitle(){

	        return this.driver.findElement(By.id("notice"));
	    }

}
