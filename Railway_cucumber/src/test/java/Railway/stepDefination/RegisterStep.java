package Railway.stepDefination;

import Railway.Common.Utilities;
import Railway.testbase.testbase;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.When;
import Railway.pageobjects.HomePage;
import Railway.pageobjects.RegisterPage;
public class RegisterStep extends testbase {

    RegisterPage registerPage = new RegisterPage();
    HomePage homePage = new HomePage();

    @Given("Navigate to Railway website")
    public void gotoRailway(){
        Utilities.selectBrowser("chrome");
        Utilities.maximizeBrowser();
        homePage.open();
    }

    @When("Fill email")
    public void fillEmail(){
        registerPage.randomEmail();
    }

    @When(" Fill password")
    public void fillPassword(){
        registerPage.enterPassword("tranduytien");
    }

    @When("Fill confirmpassword")
    public void fillConfirmPassword(){
        registerPage.enterConfirmPassword("tranduytien");
    }

    @When("Fill PiD")
    public void fillPid(){
        registerPage.enterPid("12345678");
    }

    @When("Click button register")
    public void clickBtnRegister(){
        registerPage.clickBtnRegister();
    }

}
