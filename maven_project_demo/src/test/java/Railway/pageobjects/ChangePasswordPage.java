package Railway.pageobjects;

import Railway.Constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ChangePasswordPage {


    // element method
    public WebElement getCurrentPassword(){
        return Constant.WEBDRIVER.findElement(By.id("//input[@id='currentPassword']"));
    }

    public WebElement getNewPassword(){
        return Constant.WEBDRIVER.findElement(By.id("//input[@id='newPassword']"));
    }

    public WebElement getConfirmPassword(){
        return Constant.WEBDRIVER.findElement(By.id("//input[@id='confirmPassword']"));
    }

    public WebElement getBtnChangePassword(){
        return Constant.WEBDRIVER.findElement(By.xpath("//input[@value='Change Password']"));
    }
    //methods

    public void fillCurrentPassword(String currentPassword){
        getCurrentPassword().sendKeys(currentPassword);
    }

    public void fillNewPassword(String newPassword){
        getNewPassword().sendKeys(newPassword);
    }

    public void fillConfirmPassword(String confirmPassword){
        getConfirmPassword().sendKeys(confirmPassword);
    }

    public void clickBtnChangePassword(){
        getBtnChangePassword().click();
    }
}
