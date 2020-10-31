package TestCases;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import Framework.BaseTest;
import Task.TaskHome;
	
import Framework.Report;
import Framework.Screenshot;
	
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

	public class CriarUsuarioTestCase extends BaseTest {

	    private WebDriver driver = this.getDriver();
	    private TaskHome  taskHome = new TaskHome(driver);


	    @Test
	    public void realizarCadastro() {

	        try{

	            Report.startReport("Cadastrando Novo Usuario");

	            taskHome.acessPageAutomationWeb();

	        }catch (Exception e){

	             Report.extentTest.log(Status.ERROR, e.getMessage(), Screenshot.captureBase64(driver));
	        }
	    }

}
