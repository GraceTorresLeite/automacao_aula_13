package TestCases;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import Framework.BaseTest;
import Framework.Report;
import Framework.Screenshot;
import Task.TaskHome;

	public class CreateUserTestCase extends BaseTest {

	    private WebDriver driver = this.getDriver();
	    private TaskHome  taskHome = new TaskHome(driver);


	    @Test
	    public void registerNewUser() {

	        try{

	            Report.startReport("Cadastrando Novo Usuario");

	            taskHome.acessPageAutomationWeb();

	        }catch (Exception e){

	             Report.extentTest.log(Status.ERROR, e.getMessage(), Screenshot.captureBase64(driver));
	        }
	    }

}
