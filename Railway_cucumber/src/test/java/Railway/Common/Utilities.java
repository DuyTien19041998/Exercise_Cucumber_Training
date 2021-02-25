package Railway.Common;

import Railway.Constant.Constant;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Utilities {

    public static void selectBrowser(String browserName) {
        switch (browserName) {
            case "chrome":
                String path = System.getProperty("user.dir") + "Railway/executables/chromedriver.exe";
                System.setProperty("webdriver.chrome.driver", path);
                Constant.WEBDRIVER = new ChromeDriver();
                break;
            case "fireFox":
                path = System.getProperty("user.dir") + "Railway/executables/geckodriver.exe";
                System.setProperty("webdriver.gecko.driver", path);
                Constant.WEBDRIVER = new FirefoxDriver();
                break;
        }
    }

    public static void maximizeBrowser() {
        Constant.WEBDRIVER.manage().window().maximize();
    }

    public static void waitControlJavaScriptExecutor() {
        JavascriptExecutor js = (JavascriptExecutor) Constant.WEBDRIVER;
        js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 1500);");
    }
}
