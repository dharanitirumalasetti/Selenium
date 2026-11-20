import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.List;

public class MultipleBrowsers {

    static List<WebDriver> allDrivers = new ArrayList<>();

    public static void chromeBrowser() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        allDrivers.add(driver);
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
    }

    public static void firefoxBrowser() {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        allDrivers.add(driver);
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
    }

    public static void edgeBrowser() {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        allDrivers.add(driver);
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
    }

    public static void main(String[] args) {
        chromeBrowser();
        firefoxBrowser();
        edgeBrowser();

        for (WebDriver d : allDrivers) {
            d.close();
        }
    }
}
