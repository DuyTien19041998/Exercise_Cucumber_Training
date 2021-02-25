package Railway.stepDefination;

import Railway.Common.Utilities;
import Railway.Constant.Constant;
import Railway.pageobjects.BookTicketPage;
import Railway.pageobjects.GeneralPage;
import Railway.pageobjects.HomePage;
import Railway.pageobjects.LoginPage;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.When;

public class BookTicketStep {

    LoginPage loginPage = new LoginPage();
    BookTicketPage  bookTicketPage = new BookTicketPage();
    HomePage homePage = new HomePage();
    GeneralPage generalPage = new GeneralPage();

    @Given("Navigate to Railway website ang login")
    public void gotoRailWay(){
        Utilities.selectBrowser("chrome");
        Utilities.maximizeBrowser();

        homePage.open();
        System.out.println("Login with valid account");
        loginPage.enterUserName(Constant.USERNAME);
        loginPage.enterPassWord(Constant.PASSWORD);
        loginPage.getBtnLogin().click();

        generalPage.gotoBookTicketPage();
    }

    @When("Select depart date")
    public void selectDepartDate(){
        bookTicketPage.selectDepartDate("3/4/2021");
    }

    @When("Select depart from")
    public void selectDepartFrom(){
        bookTicketPage.selectDepartFrom("Sài Gòn");
    }

    @When("Select arrive at")
    public void selectArriveAt(){
        bookTicketPage.selectArriveAt("Phan Thiết");
    }

    @When("Select seat type")
    public void selectSeatType(){
        bookTicketPage.selectSeatType("Hard seat");
    }

    @When("Select ticket amount")
    public void selectTicketAmount(){
        bookTicketPage.selectTicketAmount("10");
    }

    @When("Click button book ticket")
    public void clickBtnBookTicket(){
        bookTicketPage.clickBtnBookTicket();
    }
}
