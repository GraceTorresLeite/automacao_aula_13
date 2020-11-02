package Task;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import Framework.Report;
import Framework.Screenshot;
import PageObjects.FormPage;
import Utils.FakerGeneration;

public class FormTask {
	
	private WebDriver driver;
    private FormPage formPage;
    private FakerGeneration faker;

    public FormTask(WebDriver driver) {
        this.driver = driver;
        formPage = new FormPage(this.driver);
        faker = new FakerGeneration(this.driver);
    }

    public void preencherForm(){

        formPage.getNameTextField().sendKeys(faker.getFirstName());
        formPage.getLastNameTextField().sendKeys(faker.getLastName());
        formPage.getEmailTextField().sendKeys(faker.getEmail());
        formPage.getAddressTextField().sendKeys(faker.getAddress());
        formPage.getUniversityTextField().sendKeys(faker.getUniversity());
        formPage.getProfissionTextField().sendKeys(faker.getProfession());
        formPage.getGenreTextField().sendKeys(faker.getGenre());
        formPage.getAgeTextField().sendKeys(faker.getAge());
        formPage.getSendButton().click();
        validCreateUser();

    }

    private void validCreateUser(){

        try{

            String text = formPage.getMessageTitle().getText();
            Assertions.assertEquals("Usuário Criado com sucesso",text);
            Report.extentTest.log(Status.PASS, "Usuario criado com sucesso" , Screenshot.captureBase64(driver));


        }
        catch (Exception e){

            Report.extentTest.log(Status.FAIL, "Pagina nao foi carregada", Screenshot.captureBase64(driver));
        }


    }

}
