package Railway.pageobjects;

import Railway.Constant.Constant;
import Railway.railway_objetcs.AccountInfo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage {
    //locator

    private final By tabLogin = By.xpath("//div[@id='menu']//a[@href='/Account/Login.cshtml']");

    public WebElement getTxtUsername() {
        return Constant.WEBDRIVER.findElement(By.id("username"));
    }

    public WebElement getTxtPassword() {
        return Constant.WEBDRIVER.findElement(By.id("password"));
    }

    public WebElement getBtnLogin() {
        return Constant.WEBDRIVER.findElement(By.xpath("//input[@value='Login']"));
    }

    public void clickTabLogin(){
        getBtnLogin().click();
    }

    public void enterUserName(String username) {
        getTxtUsername().clear();
        this.getTxtUsername().sendKeys(username);
    }

    public void enterPassWord(String password) {
        getTxtPassword().clear();
        this.getTxtPassword().sendKeys(password);
    }

    //method
    public void login(AccountInfo accountInfo) {
        enterUserName(accountInfo.getUsername());
        enterPassWord(accountInfo.getPassword());
        this.getBtnLogin().click();
    }
}
