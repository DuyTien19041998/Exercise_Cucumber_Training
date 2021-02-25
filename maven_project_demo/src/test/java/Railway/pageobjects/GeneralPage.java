package Railway.pageobjects;

import Railway.Constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GeneralPage {

    // locator
    public final By tabLogout = By.xpath("//div[@id='menu']//a[@href='/Account/Logout']");
    private final By tabLogin = By.xpath("//div[@id='menu']//a[@href='/Account/Login.cshtml']");
    private final By tabBookTicket = By.xpath("//div[@id='menu']//a[@href='/Page/BookTicketPage.cshtml']");

    // element methods
    public WebElement getTabLogin(){
        return Constant.WEBDRIVER.findElement(tabLogin);
    }

     public WebElement getTabLogout(){
        return Constant.WEBDRIVER.findElement(tabLogout);
     }

     public WebElement getBookTicketTab(){
        return Constant.WEBDRIVER.findElement(tabBookTicket);
     }

     //methods
    public void gotoLoginPage(){
        this.getTabLogin().click();
    }

    public void gotoLogoutPage(){
        this.getTabLogout().click();
    }

    public void gotoBookTicketPage(){
        this.getBookTicketTab().click();
    }
}
