package Railway.stepDefination;

import Railway.Common.Utilities;
import Railway.Constant.Constant;
import Railway.pageobjects.LoginPage;
import Railway.pageobjects.HomePage;
import Railway.pageobjects.GeneralPage;
import Railway.testbase.testbase;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.When;

public class LogoutStep extends testbase {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    GeneralPage generalPage = new GeneralPage();

    @Given("Navigate to Railway website")
    public void gotoRailway(){
        Utilities.selectBrowser("chrome");
        Utilities.maximizeBrowser();
        homePage.open();
    }

    @When("Click login tab")
    public void clickLoginTab(){
        loginPage.clickTabLogin();
    }

    @When("Fill username")
    public void enterUsername(){
        loginPage.getTxtUsername().sendKeys(Constant.USERNAME);
    }

    @When(" Fill password")
    public void enterPassword(){
        loginPage.getTxtPassword().sendKeys(Constant.PASSWORD);
    }

    @When("Click button login")
    public void clickBtnLogin(){
        loginPage.getBtnLogin().click();
    }

    @When(" logout ")
    public void gotoLogout(){
        generalPage.getTabLogout().click();
    }

}
