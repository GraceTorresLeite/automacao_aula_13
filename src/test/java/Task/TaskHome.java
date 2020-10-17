package Task;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import PageObjects.HomePage;

public class TaskHome {
	
	private static WebDriver driver;
	
	private static HomePage homePage;
	
	
	public TaskHome(WebDriver driver) {
		this.driver = driver;
		this.homePage = new HomePage(this.driver);
	}
	
	public void acessPageAutomationWeb() throws InterruptedException {
		homeValidation();
		Thread.sleep(5000);// aguardando a professora incluir o wait na classe framWork - new classe Waits
		homePage.startButton().click(); // classe taskHome executa a classe HomePage step by step
		
	}
	
	private void homeValidation() {		
		Assertions.assertTrue(homePage.homeTitle().isDisplayed());
	}
	
	

}
