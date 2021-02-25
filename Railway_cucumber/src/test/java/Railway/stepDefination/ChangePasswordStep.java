package Railway.stepDefination;

import Railway.Common.Utilities;
import Railway.pageobjects.ChangePasswordPage;
import Railway.pageobjects.HomePage;
import Railway.pageobjects.LoginPage;
import Railway.railway_objetcs.AccountInfo;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.When;

public class ChangePasswordStep {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    ChangePasswordPage changePasswordPage = new ChangePasswordPage();
    AccountInfo accountInfo;

    @Given("Login with valid account")
    public void login(){
        Utilities.selectBrowser("chrome");
        Utilities.maximizeBrowser();
        homePage.open();

        loginPage.clickTabLogin();
        accountInfo = new AccountInfo("demo@gmail.com","tranduytien");
        loginPage.login(accountInfo);
    }

    @When("Fill current password")
    public void fillCurrentPassword(){
        changePasswordPage.fillCurrentPassword("tranduytien");
    }

    @When("Fill new password")
    public void fillNewPassword(){
        changePasswordPage.fillNewPassword("tranduytien");
    }

    @When("Fill confirm password")
    public void fillConfirmPassword(){
        changePasswordPage.fillConfirmPassword("tranduytien");
    }

    @When("Click change password button")
    public void clickBtnChangePassword(){
        changePasswordPage.clickBtnChangePassword();
    }

}
