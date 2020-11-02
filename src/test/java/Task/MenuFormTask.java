package Task;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import Framework.Report;
import Framework.Screenshot;
import PageObjects.MenuFormPage;

public class MenuFormTask {
	
	private WebDriver driver;
	private MenuFormPage menuFormPage;
	
	
	public MenuFormTask(WebDriver driver) {
		super();
		this.driver = driver;
		this.menuFormPage = new MenuFormPage(this.driver);
	}
	
	public void acessForm() {
		validPageForm();
		menuFormPage.getFormLink().click();
		menuFormPage.getCreateUserLink().click();
	}	
		
		private void validPageForm(){
			
			try {
			String text = menuFormPage.getTextTitle().getText();
			Assertions.assertEquals("Lista de Funcionalidades", text);
		
			Report.extentTest.log(Status.PASS,"passou",Screenshot.captureBase64(driver));
		}catch (Exception e) {
			Report.extentTest.log(Status.FAIL, "falhou", Screenshot.captureBase64(driver));
		}
		
		
	}	

}
