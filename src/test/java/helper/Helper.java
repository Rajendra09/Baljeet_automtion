package helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class Helper  {
    private static WebDriver REAL_DRIVER;

    public static void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Job Prep\\BrowserDriver\\chromedriver.exe");
        REAL_DRIVER = new ChromeDriver();
        REAL_DRIVER.get("http://webdriveruniversity.com/index.html");
    }


    public static WebDriver getWebDriver() {
        return REAL_DRIVER;
    }


}
