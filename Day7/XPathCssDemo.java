import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathCssDemo {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://example.com/login");

        // CSS selector: tag name + attribute + attribute value
        driver.findElement(By.cssSelector("input[id='username']"));

        // XPath using attribute: //tagname[@attribute='value']
        driver.findElement(By.xpath("//input[@id='username']"));

        // XPath using text (anchor tag / link)
        driver.findElement(By.xpath("//a[text()='link text']"));
        driver.findElement(By.xpath("//a[.='link text']"));

        // XPath with index when there are multiple matches
        driver.findElement(By.xpath("(//a[text()='link text'])[1]"));

        driver.quit();
    }
}
