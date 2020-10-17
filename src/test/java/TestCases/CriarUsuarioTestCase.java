package TestCases;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import Framework.BaseTest;
import Task.TaskHome;

public class CriarUsuarioTestCase extends BaseTest{
	
	private WebDriver driver = this.getDriver();
	private TaskHome taskHome = new TaskHome(driver);
	
	@Test
	public void realizarCadastro() throws InterruptedException {
		taskHome.acessPageAutomationWeb();
	}

}
