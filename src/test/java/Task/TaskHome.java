package Task;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import Framework.Waits;
import PageObjects.HomePage;

public class TaskHome {
	
	private static WebDriver driver;
	
	private static HomePage homePage;
	
	private static Waits waits;
	
	
	public TaskHome(WebDriver driver) {
		this.driver = driver;
		this.homePage = new HomePage(this.driver);
		waits = new Waits(this.driver);
	}
	
	public void acessPageAutomationWeb(){
		homeValidation();
		waits.loadElement(homePage.startButton());
		homePage.startButton().click(); // classe taskHome executa a classe HomePage step by step
		
	}
	
	private void homeValidation() {		
		Assertions.assertTrue(homePage.homeTitle().isDisplayed());
	}
	
	

}
