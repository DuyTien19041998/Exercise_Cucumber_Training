package Railway.stepDefination;

import Railway.Common.Utilities;
import Railway.Constant.Constant;
import Railway.pageobjects.HomePage;
import Railway.pageobjects.LoginPage;
import Railway.testbase.testbase;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import org.testng.Assert;

public class LoginStep extends testbase {
    HomePage homepage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Given("Navigate to Railway website")
    public void gotoRailway() {
        Utilities.selectBrowser("chrome");
        Utilities.maximizeBrowser();
        homepage.open();
    }

    @When("Click button login")
    public void clickBtnLogin() {
        loginPage.getBtnLogin().click();
    }

    @When("Click login tab")
    public void clickLoginTab() {
        loginPage.clickTabLogin();
    }

    @When(" Fill password")
    public void enterPassword() {
        loginPage.getTxtPassword().sendKeys(Constant.PASSWORD);
    }

    @When("Fill username")
    public void enterUsername() {
        loginPage.getTxtUsername().sendKeys(Constant.USERNAME);
    }

    @Then("Login successfully")
    public void userLoginSuccessfully() {
        String actual = "demo@gmail.com";
        Assert.assertEquals("Welcome", actual);
    }
}
