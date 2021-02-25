package Railway.pageobjects;

import Railway.Constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class RegisterPage {
    public WebElement getTxtEmailRegister() {
        return Constant.WEBDRIVER.findElement(By.id("email"));
    }

    public WebElement getTxtPasswordRegister() {
        return Constant.WEBDRIVER.findElement(By.id("password"));
    }

    public WebElement getTxtConfirmPasswordRegister() {
        return Constant.WEBDRIVER.findElement(By.id("confirmPassword"));
    }

    public WebElement getTxtPidRegister() {
        return Constant.WEBDRIVER.findElement(By.id("pid"));
    }

    public WebElement getbtnRegister() {
        return Constant.WEBDRIVER.findElement(By.xpath("//input[@value='Register']"));
    }

    public void enterEmail(String email) {
        getTxtEmailRegister().clear();
        this.getTxtEmailRegister().sendKeys(email);
    }

    public void enterPassword(String password) {
        getTxtPasswordRegister().clear();
        this.getTxtPasswordRegister().sendKeys(password);
    }

    public void enterConfirmPassword(String confirmPassword) {
        getTxtConfirmPasswordRegister().clear();
        this.getTxtConfirmPasswordRegister().sendKeys(confirmPassword);
    }

    public void enterPid(String pid) {
        getTxtPidRegister().clear();
        this.getTxtPidRegister().sendKeys(pid);
    }

    public void clickBtnRegister() {
        getbtnRegister().click();
    }

    public String randomEmail(){
        Random rd = new Random();
        String rdEmail = "gmail"+rd.nextInt(10000)+"@gmail.com";
        return  rdEmail;
    }
}
