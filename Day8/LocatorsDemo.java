import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://example.com/login");

        // CSS selector - using id
        driver.findElement(By.cssSelector("input#username"));

        // CSS selector - using class
        driver.findElement(By.cssSelector("input.form-control"));

        // CSS selector - attribute and value
        driver.findElement(By.cssSelector("input[name='username']"));

        // CSS selector - starts with and ends with
        driver.findElement(By.cssSelector("input[id^='user']"));
        driver.findElement(By.cssSelector("input[id$='name']"));

        // Absolute XPath
        driver.findElement(By.xpath("/html/body/div[1]/form/input[1]"));

        // Relative XPath
        driver.findElement(By.xpath("//input[@id='username']"));
        driver.findElement(By.xpath("//input[@name='username']"));

        driver.quit();
    }
}
