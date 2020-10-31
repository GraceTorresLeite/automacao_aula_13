package Task;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import Framework.Waits;
import PageObjects.HomePage;

import Framework.Report;
import Framework.Screenshot;
import Framework.Waits;
import PageObjects.HomePage;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class TaskHome {

	private static WebDriver driver;

	private static HomePage homePage;

	private static Waits waits;

	public TaskHome(WebDriver driver) {
		this.driver = driver;
		this.homePage = new HomePage(this.driver);
		waits = new Waits(this.driver);
	}

	public void acessPageAutomationWeb() {
		homeValidation();
		waits.loadElement(homePage.startButton());
		homePage.startButton().click(); // classe taskHome executa a classe HomePage step by step

	}

	private void homeValidation() {
		try {

			Assertions.assertTrue(homePage.homeTitle().isDisplayed());
			Report.extentTest.log(Status.PASS, "Pagina Acessada com sucesso", Screenshot.capture(driver));

		} catch (Exception e) {

			Report.extentTest.log(Status.FAIL, "Não foi possivel acessar a pagina", Screenshot.capture(driver));

		}
	}

}
