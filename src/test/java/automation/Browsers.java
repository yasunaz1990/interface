package automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.Test;

public class Browsers {

    public WebDriver getChosenBrowser(String choice) {
        if(choice.contains("chrome")) {
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        }
        else if(choice.contains("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        }

        WebDriverManager.edgedriver().setup();
        return new EdgeDriver();
    }

    @Test
    public void openingBrowser() {
        String browserType = System.getProperty("browser");
        WebDriver driver = getChosenBrowser(browserType);

        // Test Code
        driver.get("https://trello.com");
        String url = driver.getCurrentUrl();
        System.out.println(url);
        driver.manage().window().fullscreen();
        driver.quit();
    }
}
