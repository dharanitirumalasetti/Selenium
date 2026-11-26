
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/login");

        // Create Explicit Wait
        WebDriverWait wait =
                new WebDriverWait(driver, Duration.ofSeconds(10));

        // Wait until username is visible
        WebElement username = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.id("username")));

        username.sendKeys("tomsmith");

        // Wait until password is visible
        WebElement password = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.id("password")));

        password.sendKeys("SuperSecretPassword!");

        // Wait until login button is clickable
        WebElement loginButton = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.cssSelector("button[type='submit']")));

        loginButton.click();

        // Wait for success message
        WebElement message = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.id("flash")));

        System.out.println("Message: " + message.getText());

        driver.quit();
    }
}
