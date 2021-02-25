package Railway.pageobjects;

import Railway.Constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BookTicketPage {

    //element method
    public WebElement getCbbDepartDate() {
        return Constant.WEBDRIVER.findElement(By.xpath("//ol//select[@name='Date']"));
    }

    public WebElement getCbbDepartFrom() {
        return Constant.WEBDRIVER.findElement(By.xpath("//ol//select[@name='DepartStation']"));
    }

    public WebElement getCbbArriveAt() {
        return Constant.WEBDRIVER.findElement(By.xpath("//ol//select[@name='ArriveStation']"));
    }

    public WebElement getCbbSeatType() {
        return Constant.WEBDRIVER.findElement(By.xpath("//ol//select[@name='SeatType']"));
    }

    public WebElement getCbbTicketMount() {
        return Constant.WEBDRIVER.findElement(By.xpath("//ol//select[@name='TicketAmount']"));
    }

    public WebElement getBtnBookTicket() {
        return Constant.WEBDRIVER.findElement(By.xpath("//form//input[@value='Book ticket']"));
    }

    //method
    public void selectDepartDate(String departDate){
        Select dpDate = new Select(getCbbDepartDate());
        dpDate.selectByVisibleText(departDate);
    }

    public void selectDepartFrom(String departFrom){
        Select dpFrom = new Select(getCbbDepartFrom());
        dpFrom.selectByVisibleText(departFrom);
    }

    public void selectArriveAt(String arriveAt){
        Select arriveAts = new Select(getCbbArriveAt());
        arriveAts.selectByVisibleText(arriveAt);
    }

    public void selectSeatType(String seatType){
        Select seatTypes = new Select(getCbbSeatType());
        seatTypes.selectByVisibleText(seatType);
    }

    public void selectTicketAmount(String ticketAmount){
        Select ticketAmounts = new Select(getCbbTicketMount());
        ticketAmounts.selectByVisibleText(ticketAmount);
    }

    public void clickBtnBookTicket(){
        getBtnBookTicket().click();
    }
}
